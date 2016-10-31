package com.analyze.logfile.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by cuong on 10/31/2016.
 */
public class PrintUtil {
    public static void printResult(String className, String startLine, String endLine, String requestId) {
        String startTimeString = startLine.substring(0, 23);
        String endTimeString = endLine.substring(0, 23);

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss:SSS");
        DateTime startDateTime = formatter.parseDateTime(startTimeString);
        DateTime endDateTime = formatter.parseDateTime(endTimeString);
        long diffInMillis = endDateTime.getMillis() - startDateTime.getMillis();

        System.out.println(className + "\t" + startTimeString + "\t" + endTimeString + "\t" + diffInMillis);
    }
}
