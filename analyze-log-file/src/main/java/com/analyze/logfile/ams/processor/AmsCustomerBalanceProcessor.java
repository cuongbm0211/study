package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerBalanceProcessor extends AbstractAmsPorcessor {


    public AmsCustomerBalanceProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerBalanceRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerBalanceRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerBalanceProcessor amsCustomerBalanceProcessor = new AmsCustomerBalanceProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerBalanceProcessor.printResult();
    }

}
