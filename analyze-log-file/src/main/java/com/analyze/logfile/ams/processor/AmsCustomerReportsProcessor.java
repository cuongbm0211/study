package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerReportsProcessor extends AbstractAmsPorcessor {

    public AmsCustomerReportsProcessor() {
        super();
        setStartRequestString("[start] handle AmsCustomerReportsRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerReportsRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerReportsProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerReportsRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerReportsRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerReportsProcessor amsCustomerReportsProcessor = new AmsCustomerReportsProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerReportsProcessor.printResult();
    }

}
