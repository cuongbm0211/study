package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsDepositProcessor extends AbstractAmsPorcessor {


    public AmsDepositProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsDepositRequest, requestId: ");
        setEndRequestString("[end] handle AmsDepositRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    public static void main(String[] args) {
        AmsDepositProcessor amsDepositProcessor = new AmsDepositProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsDepositProcessor.printResult();
    }

}
