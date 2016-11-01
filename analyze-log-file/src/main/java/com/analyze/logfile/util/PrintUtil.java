package com.analyze.logfile.util;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

/**
 * Created by cuong on 10/31/2016.
 */
public class PrintUtil {
    private static final File file = new File("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/result.txt");

    public static void printResult(String className, String startLine, String endLine, String requestId) {
        String startTimeString = startLine.substring(0, 23);
        String endTimeString = endLine.substring(0, 23);

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss:SSS");
        DateTime startDateTime = formatter.parseDateTime(startTimeString);
        DateTime endDateTime = formatter.parseDateTime(endTimeString);
        long diffInMillis = endDateTime.getMillis() - startDateTime.getMillis();

        String result = className + "\t" + requestId + "\t" + startTimeString + "\t" + endTimeString + "\t" + diffInMillis;
        System.out.println(result);
        printToFile(result);
    }

    public static void printToFile(String value) {
        try {
            Files.append(value, file, Charsets.UTF_8);
            Files.append(System.getProperty("line.separator"), file, Charsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Files.append("Cuong", file, Charsets.UTF_8);
            Files.append("Cuong", file, Charsets.UTF_8);
            Files.append("Cuong", file, Charsets.UTF_8);
            Files.append("Cuong", file, Charsets.UTF_8);
            Files.append("Cuong", file, Charsets.UTF_8);
            Files.append(System.getProperty("line.separator"), file, Charsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
