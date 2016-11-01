package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerPaymentInfoProcessor extends AbstractAmsProcessor {

    public AmsCustomerPaymentInfoProcessor() {
        super();
        setStartRequestString("[start] handle AmsCustomerPaymentInfoRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerPaymentInfoRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerPaymentInfoProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerPaymentInfoRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerPaymentInfoRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerPaymentInfoProcessor amsCustomerPaymentInfoProcessor = new AmsCustomerPaymentInfoProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerPaymentInfoProcessor.printResult();
    }

}
