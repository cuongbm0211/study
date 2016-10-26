package com.analyze.logfile.ams;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    private static final String folderContainsLogFile = "D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/AMS_API_CONTROLLER.20160903/opt/sc_app/logs/ams-api-controller/";
    private static final String filePath = folderContainsLogFile + "ams-api-controller.log.2016-08-19";

    public static void main( String[] args ) {
        try {
            File[] logFiles = new File(folderContainsLogFile).listFiles();

            String logContent = Files.toString(new File(filePath), Charsets.UTF_8);
            int count = StringUtils.countMatches(logContent, "[start] handle AmsCustomerAgreementNewsRequest");

            System.out.println("abc");




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
