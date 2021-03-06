package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerCloseSocialProcessor extends AbstractAmsProcessor {

    public AmsCustomerCloseSocialProcessor() {
        super();
        setStartRequestString("[start] handle AmsCustomerCloseSocialRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerCloseSocialRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerCloseSocialProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerCloseSocialRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerCloseSocialRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerCloseSocialProcessor amsCustomerCloseSocialProcessor = new AmsCustomerCloseSocialProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerCloseSocialProcessor.printResult();
    }

}
