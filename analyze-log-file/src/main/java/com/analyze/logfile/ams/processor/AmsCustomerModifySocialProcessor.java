package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerModifySocialProcessor extends AbstractAmsProcessor {

    public AmsCustomerModifySocialProcessor() {
        super();
        setStartRequestString("[start] handle AmsCustomerModifySocialRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerModifySocialRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerModifySocialProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerModifySocialRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerModifySocialRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerModifySocialProcessor amsCustomerModifySocialProcessor = new AmsCustomerModifySocialProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerModifySocialProcessor.printResult();
    }

}
