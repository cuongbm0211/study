package com.analyze.logfile.ams;

import com.analyze.logfile.ams.processor.AbstractAmsPorcessor;
import com.analyze.logfile.ams.processor.AmsBoAdditionalInfoUpdateProcessor;
import com.analyze.logfile.ams.processor.AmsCustomerAgreementNewsProcessor;
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
 */
public class AmsProcessor {
    private static final String folderContainsLogFile = "D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/";
    private static final String filePath = folderContainsLogFile + "ams-api-controller.log.2016-09-01";

    public static void main(String[] args) {
        try {
            File[] logFiles = new File(folderContainsLogFile).listFiles();
            List<AbstractAmsPorcessor> amsPorcessors = getProcessor();

            for (AbstractAmsPorcessor amsPorcessor : amsPorcessors) {
                for (File logFile : logFiles) {
                    amsPorcessor.setFilePath(logFile.getPath());
                    amsPorcessor.reloadData();
                    amsPorcessor.printResult();
                }
                amsPorcessor = null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<AbstractAmsPorcessor> getProcessor() {
        List<AbstractAmsPorcessor> amsPorcessors = new ArrayList<AbstractAmsPorcessor>();

        AbstractAmsPorcessor amsBoAdditionalInfoUpdateProcessor = new AmsBoAdditionalInfoUpdateProcessor();
        amsPorcessors.add(amsBoAdditionalInfoUpdateProcessor);

        AbstractAmsPorcessor amsCustomerAgreementNewsProcessor = new AmsCustomerAgreementNewsProcessor();
        amsPorcessors.add(amsBoAdditionalInfoUpdateProcessor);

        return amsPorcessors;
    }
}
