package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerRegisterSocialProcessor extends AbstractAmsPorcessor {


    public AmsCustomerRegisterSocialProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerRegisterSocialRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerRegisterSocialRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerRegisterSocialProcessor amsCustomerRegisterSocialProcessor = new AmsCustomerRegisterSocialProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerRegisterSocialProcessor.printResult();
    }

}
