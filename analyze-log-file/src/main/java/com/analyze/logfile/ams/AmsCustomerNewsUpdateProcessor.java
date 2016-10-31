package com.analyze.logfile.ams;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerNewsUpdateProcessor extends AbstractAmsPorcessor {


    public AmsCustomerNewsUpdateProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerNewsUpdateRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerNewsUpdateRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    public static void main(String[] args) {
        AmsCustomerNewsUpdateProcessor amsCustomerAgreementNewsProcessor = new AmsCustomerNewsUpdateProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerAgreementNewsProcessor.printResult();
    }

}
