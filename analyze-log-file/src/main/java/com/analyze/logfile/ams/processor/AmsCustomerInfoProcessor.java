package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerInfoProcessor extends AbstractAmsProcessor {

    public AmsCustomerInfoProcessor() {
        super();
        setStartRequestString("[start] handle AmsCustomerInfoRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerInfoRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerInfoProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerInfoRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerInfoRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerInfoProcessor amsCustomerInfoProcessor = new AmsCustomerInfoProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerInfoProcessor.printResult();
    }

}
