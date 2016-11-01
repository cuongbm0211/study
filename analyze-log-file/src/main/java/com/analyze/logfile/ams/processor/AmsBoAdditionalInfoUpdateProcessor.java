package com.analyze.logfile.ams.processor;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsBoAdditionalInfoUpdateProcessor extends AbstractAmsPorcessor {

    public AmsBoAdditionalInfoUpdateProcessor() {
        super();
        setStartRequestString("[start] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        setEndRequestString("[end] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public AmsBoAdditionalInfoUpdateProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        setEndRequestString("[end] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public static void main(String[] args) {
        AmsBoAdditionalInfoUpdateProcessor amsCustomerAgreementNewsProcessor = new AmsBoAdditionalInfoUpdateProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerAgreementNewsProcessor.printResult();
    }

}
