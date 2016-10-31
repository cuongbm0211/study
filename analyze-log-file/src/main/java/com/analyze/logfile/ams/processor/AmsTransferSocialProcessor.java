package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsTransferSocialProcessor extends AbstractAmsPorcessor {


    public AmsTransferSocialProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsTransferSocialRequest, requestId: ");
        setEndRequestString("[end] handle AmsTransferSocialRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    public static void main(String[] args) {
        AmsTransferSocialProcessor amsTransferSocialProcessor = new AmsTransferSocialProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsTransferSocialProcessor.printResult();
    }

}
