package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerNewsReloadCacheProcessor extends AbstractAmsProcessor {

    public AmsCustomerNewsReloadCacheProcessor() {
        super();
        setStartRequestString("[Start] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        setEndRequestString("[End] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerNewsReloadCacheProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[Start] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        setEndRequestString("[End] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerNewsReloadCacheProcessor amsCustomerNewsReloadCacheProcessor = new AmsCustomerNewsReloadCacheProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerNewsReloadCacheProcessor.printResult();
    }

}
