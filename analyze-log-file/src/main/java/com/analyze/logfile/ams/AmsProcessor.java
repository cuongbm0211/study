package com.analyze.logfile.ams;

import com.analyze.logfile.ams.processor.AbstractAmsPorcessor;
import com.analyze.logfile.ams.processor.AmsBoAdditionalInfoUpdateProcessor;
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class AmsProcessor {
    private static final String folderContainsLogFile = "D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/";
    private static final String filePath = folderContainsLogFile + "ams-api-controller.log.2016-09-01";

    public static void main( String[] args ) {
        try {
            File[] logFiles = new File(folderContainsLogFile).listFiles();

            String logContent = Files.toString(new File(filePath), Charsets.UTF_8);
            int countStart = StringUtils.countMatches(logContent, "[start] handle AmsCustomerAgreementNewsRequest");
            int countEnd = StringUtils.countMatches(logContent, "[end] handle AmsCustomerAgreementNewsRequest, requestId: ");
            System.out.println(countStart + "   " + countEnd);
            // String requestId = ; Don't have requestID, get end

            System.out.println("abc");




        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void initProcessor(String filePath) {
        List<AbstractAmsPorcessor> amsPorcessors = new ArrayList<AbstractAmsPorcessor>();

        AbstractAmsPorcessor amsBoAdditionalInfoUpdateProcessor = new AmsBoAdditionalInfoUpdateProcessor(filePath);
        amsPorcessors.add(amsBoAdditionalInfoUpdateProcessor);


    }
}
