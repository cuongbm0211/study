package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsCustomerBoTestUpdateProcessor extends AbstractAmsPorcessor {

    public AmsCustomerBoTestUpdateProcessor() {
        super();
        setStartRequestString("[start] handle AmsCustomerBoTestUpdateRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerBoTestUpdateRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsCustomerBoTestUpdateProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsCustomerBoTestUpdateRequest, requestId: ");
        setEndRequestString("[end] handle AmsCustomerBoTestUpdateRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsCustomerBoTestUpdateProcessor amsCustomerBoTestUpdateProcessor = new AmsCustomerBoTestUpdateProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerBoTestUpdateProcessor.printResult();
    }

}
