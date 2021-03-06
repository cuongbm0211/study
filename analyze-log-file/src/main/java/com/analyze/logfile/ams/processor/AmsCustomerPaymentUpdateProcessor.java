package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerPaymentUpdateProcessor extends AbstractAmsProcessor {

    public AmsCustomerPaymentUpdateProcessor() {
        super();
        setStartRequestString("[start] handle AmsCustomerPaymentUpdateTask, requestId: ");
        setEndRequestString("[end] handle AmsCustomerPaymentUpdateTask, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerPaymentUpdateProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerPaymentUpdateTask, requestId: ");
        setEndRequestString("[end] handle AmsCustomerPaymentUpdateTask, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerPaymentUpdateProcessor amsCustomerPaymentUpdateProcessor = new AmsCustomerPaymentUpdateProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerPaymentUpdateProcessor.printResult();
    }

}
