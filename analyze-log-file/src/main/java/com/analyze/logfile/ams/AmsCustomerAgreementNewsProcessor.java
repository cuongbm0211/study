package com.analyze.logfile.ams;

import com.analyze.logfile.util.LineUtil;
import com.analyze.logfile.util.PrintUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerAgreementNewsProcessor extends AbstractAmsPorcessor {

    public AmsCustomerAgreementNewsProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerAgreementNewsRequest ");
        setEndRequestString("[end] handle AmsCustomerAgreementNewsRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    @Override
    public void printResult() {
        int countStart = StringUtils.countMatches(fileContent, getStartRequestString());
        int countEnd = StringUtils.countMatches(fileContent, getEndRequestString());

        if (countStart != countEnd) {
            System.err.println("AmsCustomerAgreementNewsProcessor countStart != countEnd");
            return;
        }

        List<String> startLines = LineUtil.getAllLineHaveValue(getFileContenInLines(), getStartRequestString());
        List<String> endLines = LineUtil.getAllLineHaveValue(getFileContenInLines(), getEndRequestString());

        for (int i = 0; i < startLines.size(); i++) {
            String startLine = startLines.get(i);
            String endLine = endLines.get(i);
            PrintUtil.printResult(getRequestName(), startLine, endLine, "");
        }
    }

    public static void main(String[] args) {
        AmsCustomerAgreementNewsProcessor amsCustomerAgreementNewsProcessor = new AmsCustomerAgreementNewsProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerAgreementNewsProcessor.printResult();
    }

}
