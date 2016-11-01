package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsDepositUpdateProcessor extends AbstractAmsPorcessor {

    public AmsDepositUpdateProcessor() {
        super();
        setStartRequestString("[start] handle AmsDepositUpdateTask, requestId: ");
        setEndRequestString("[end] handle AmsDepositUpdateTask, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsDepositUpdateProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsDepositUpdateTask, requestId: ");
        setEndRequestString("[end] handle AmsDepositUpdateTask, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AbstractAmsPorcessor AmsDepositUpdateProcessor = new AmsDepositUpdateProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        AmsDepositUpdateProcessor.printResult();
    }

}
