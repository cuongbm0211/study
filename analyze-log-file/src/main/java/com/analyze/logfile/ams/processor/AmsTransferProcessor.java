package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsTransferProcessor extends AbstractAmsProcessor {

    public AmsTransferProcessor() {
        super();
        setStartRequestString("[start] handle AmsTransferRequest, requestId: ");
        setEndRequestString("[end] handle AmsTransferRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsTransferProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsTransferRequest, requestId: ");
        setEndRequestString("[end] handle AmsTransferRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsTransferProcessor amsTransferProcessor = new AmsTransferProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsTransferProcessor.printResult();
    }

}
