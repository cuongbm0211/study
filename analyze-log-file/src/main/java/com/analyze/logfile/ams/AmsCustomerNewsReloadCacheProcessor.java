package com.analyze.logfile.ams;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerNewsReloadCacheProcessor extends AbstractAmsPorcessor {

    public AmsCustomerNewsReloadCacheProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[Start] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        setEndRequestString("[End] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    public static void main(String[] args) {
        AmsCustomerNewsReloadCacheProcessor amsCustomerAgreementNewsProcessor = new AmsCustomerNewsReloadCacheProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerAgreementNewsProcessor.printResult();
    }

}
