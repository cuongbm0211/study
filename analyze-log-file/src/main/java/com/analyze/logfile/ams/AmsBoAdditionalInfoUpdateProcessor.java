package com.analyze.logfile.ams;

import com.analyze.logfile.util.LineUtil;
import com.analyze.logfile.util.PrintUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cuong on 10/31/2016.
 */
public class AmsBoAdditionalInfoUpdateProcessor extends AbstractAmsPorcessor {


    public AmsBoAdditionalInfoUpdateProcessor(String filePath) {
        super(filePath);
        setStartRequestString("[start] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        setEndRequestString("[end] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        setRequestName(this.getClass().toString());
    }

    public String getStartTime() {
        return null;
    }

    public String getEndTime() {
        return null;
    }

    public static void main(String[] args) {
        AmsBoAdditionalInfoUpdateProcessor amsCustomerAgreementNewsProcessor = new AmsBoAdditionalInfoUpdateProcessor("D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/summary-log/ams-api-controller.log.2016-09-01");
        amsCustomerAgreementNewsProcessor.printResult();
    }

}
