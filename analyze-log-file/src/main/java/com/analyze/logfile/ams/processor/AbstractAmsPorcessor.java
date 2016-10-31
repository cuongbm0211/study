package com.analyze.logfile.ams.processor;

import com.analyze.logfile.util.LineUtil;
import com.analyze.logfile.util.PrintUtil;
import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.io.Files;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cuong on 10/31/2016.
 */
public abstract class AbstractAmsPorcessor {
    private String filePath;
    protected String fileContent;
    protected List<String> fileContenInLines;

    // map with requestId, endLine
    private Map<String, String> mapToFind = new HashMap<String, String>();

    protected String requestName;
    protected String startRequestString;
    protected String endRequestString;

    public AbstractAmsPorcessor(String filePath) {
        this.filePath = filePath;
        try {
            fileContent = Files.toString(new File(filePath), Charsets.UTF_8);
            fileContenInLines = Splitter.on("\n").splitToList(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getIdStartLine(String startLine) {
        int position = startLine.indexOf(getStartRequestString());
        int cutFrom = position + getStartRequestString().length();
        int cutTo = cutFrom + 16;
        String id = startLine.substring(cutFrom , cutTo);
        return id;
    }

    public String getIdEndLine(String endLine) {
        int position = endLine.indexOf(getEndRequestString());
        int cutFrom = position + getEndRequestString().length();
        int cutTo = cutFrom + 16;
        String id = endLine.substring(cutFrom , cutTo);
        return id;
    }

    public void printResult() {
        int countStart = StringUtils.countMatches(fileContent, getStartRequestString());
        int countEnd = StringUtils.countMatches(fileContent, getEndRequestString());

        if (countStart != countEnd) {
            System.err.println(this.getClass().toString() + " countStart != countEnd, countStart: " + countStart + ", countEnd: " + countEnd);
        }

        List<String> startLines = LineUtil.getAllLineHaveValue(getFileContenInLines(), getStartRequestString());
        List<String> endLines = LineUtil.getAllLineHaveValue(getFileContenInLines(), getEndRequestString());

        initMapToFind(endLines);

        for (int i = 0; i < startLines.size(); i++) {
            String startLine = startLines.get(i);
            String requestId = getIdStartLine(startLine);
            String endLine = mapToFind.get(requestId);
            if (endLine == null) {
                System.err.println("Error on, requestId: " + requestId );
                continue;
            }

            PrintUtil.printResult(getRequestName(), startLine, endLine, requestId);
        }
    }

    private void initMapToFind(List<String> endLines) {
        for (String endLine : endLines) {
            String id = getIdEndLine(endLine);
            mapToFind.put(id, endLine);
        }
    }

    public abstract String getStartTime();

    public abstract String getEndTime();

    public String getStartRequestString() {
        return startRequestString;
    }

    public void setStartRequestString(String startRequestString) {
        this.startRequestString = startRequestString;
    }

    public String getEndRequestString() {
        return endRequestString;
    }

    public void setEndRequestString(String endRequestString) {
        this.endRequestString = endRequestString;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public List<String> getFileContenInLines() {
        return fileContenInLines;
    }

    public void setFileContenInLines(List<String> fileContenInLines) {
        this.fileContenInLines = fileContenInLines;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }
}
