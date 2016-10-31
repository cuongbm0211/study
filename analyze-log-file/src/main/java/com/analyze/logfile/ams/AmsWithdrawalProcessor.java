package com.analyze.logfile.ams;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsWithdrawalProcessor extends AbstractAmsPorcessor {


    public AmsWithdrawalProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsWithdrawalRequest, requestId: ");
        setEndRequestString("[end] handle AmsWithdrawalRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    public static void main(String[] args) {
        AmsWithdrawalProcessor amsCustomerAgreementNewsProcessor = new AmsWithdrawalProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerAgreementNewsProcessor.printResult();
    }

}
