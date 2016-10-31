package com.analyze.logfile.ams;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerReportsProcessor extends AbstractAmsPorcessor {


    public AmsCustomerReportsProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerReportsRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerReportsRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    public static void main(String[] args) {
        AmsCustomerReportsProcessor amsCustomerAgreementNewsProcessor = new AmsCustomerReportsProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerAgreementNewsProcessor.printResult();
    }

}
