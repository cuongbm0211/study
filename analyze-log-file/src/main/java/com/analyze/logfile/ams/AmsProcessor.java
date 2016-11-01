package com.analyze.logfile.ams;

import com.analyze.logfile.ams.processor.AbstractAmsProcessor;

import java.io.File;
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
            List<String> amsProcessorsClassNames = getProcessorClassName();

            for (String amsProcessorsClassName : amsProcessorsClassNames) {
                for (File logFile : logFiles) {
//                    System.out.println(logFile.getPath());

                    // Not good for memory
//                    amsPorcessor.setFilePath(logFile.getPath());
//                    amsPorcessor.reloadData();
//                    amsPorcessor.printResult();
//                    amsPorcessor.clearMemory();

                    // Other
//                    AbstractAmsProcessor newProcessor = new AmsBoAdditionalInfoUpdateProcessor();
//                    newProcessor.setFilePath(logFile.getPath());
//                    newProcessor.reloadData();
//                    newProcessor.printResult();
//                    newProcessor.clearMemory();

                    Class c = Class.forName(amsProcessorsClassName);

                    AbstractAmsProcessor newProcessor = (AbstractAmsProcessor) c.newInstance();
                    newProcessor.setFilePath(logFile.getPath());
                    newProcessor.reloadData();
                    newProcessor.printResult();
                    newProcessor.clearMemory();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<String> getProcessorClassName() {
        List<String> amsProcessorsClassNames = new ArrayList<String>();
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsBoAdditionalInfoUpdateProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerAgreementNewsProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerBalanceProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerBoTestUpdateProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerCloseSocialProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerInfoProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerInfoUpdateProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerModifySocialProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerNewsProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerNewsReloadCacheProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerNewsUpdateProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerPaymentInfoProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerPaymentUpdateProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerRegisterSocialProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsCustomerReportsProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsDepositProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsDepositUpdateProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsTransferProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsTransferSocialProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsWithdrawalCancelProcessor");
        amsProcessorsClassNames.add("com.analyze.logfile.ams.processor.AmsWithdrawalProcessor");
        return amsProcessorsClassNames;
    }
}
