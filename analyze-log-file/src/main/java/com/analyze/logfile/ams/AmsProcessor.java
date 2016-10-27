package com.analyze.logfile.ams;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class AmsProcessor {
    private static final String folderContainsLogFile = "D:/Nextop/20 story/079 TRSPT-9700 Summary request traffic of AmsApi/AMS_API_CONTROLLER.20160903/opt/sc_app/logs/ams-api-controller/";
    private static final String filePath = folderContainsLogFile + "ams-api-controller.log.2016-08-19";

    List<AmsRequest> amsRequests = Lists.newArrayList();

    public static void main( String[] args ) {
        try {
            File[] logFiles = new File(folderContainsLogFile).listFiles();

            String logContent = Files.toString(new File(filePath), Charsets.UTF_8);
            int count = StringUtils.countMatches(logContent, "[start] handle AmsCustomerAgreementNewsRequest");

            System.out.println("abc");




        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void initRequest() {
        // CUSTOMER

        AmsRequest amsBoAdditionalInfoUpdateRequest = new AmsRequest();
        amsBoAdditionalInfoUpdateRequest.setStartRequestString("[start] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        amsBoAdditionalInfoUpdateRequest.setEndRequestString("[end] handle AmsBoAdditionalInfoUpdateRequest, requestId: ");
        amsRequests.add(amsBoAdditionalInfoUpdateRequest);

        AmsRequest amsCustomerAgreementNewsRequest = new AmsRequest();
        amsCustomerAgreementNewsRequest.setStartRequestString("[start] handle AmsCustomerAgreementNewsRequest ");
        amsCustomerAgreementNewsRequest.setEndRequestString("[end] handle AmsCustomerAgreementNewsRequest, requestId: ");
        amsRequests.add(amsCustomerAgreementNewsRequest);

        AmsRequest amsCustomerBalanceRequest = new AmsRequest();
        amsCustomerBalanceRequest.setStartRequestString("[start] handle AmsCustomerBalanceRequest, requestId: ");
        amsCustomerBalanceRequest.setEndRequestString("[end] handle AmsCustomerBalanceRequest, requestId: ");
        amsRequests.add(amsCustomerBalanceRequest);

        AmsRequest amsCustomerBoTestUpdateRequest = new AmsRequest();
        amsCustomerBoTestUpdateRequest.setStartRequestString("[start] handle AmsCustomerBoTestUpdateRequest, requestId: ");
        amsCustomerBoTestUpdateRequest.setEndRequestString("[end] handle AmsCustomerBoTestUpdateRequest, requestId: ");
        amsRequests.add(amsCustomerBoTestUpdateRequest);

        AmsRequest amsCustomerCloseSocialRequest = new AmsRequest();
        amsCustomerCloseSocialRequest.setStartRequestString("[start] handle AmsCustomerCloseSocialRequest, requestId: ");
        amsCustomerCloseSocialRequest.setEndRequestString("[end] handle AmsCustomerCloseSocialRequest, requestId: ");
        amsRequests.add(amsCustomerCloseSocialRequest);

        AmsRequest amsCustomerInfoRequest = new AmsRequest();
        amsCustomerInfoRequest.setStartRequestString("[start] handle AmsCustomerInfoRequest, requestId: ");
        amsCustomerInfoRequest.setEndRequestString("[end] handle AmsCustomerInfoRequest, requestId: ");
        amsRequests.add(amsCustomerInfoRequest);

        AmsRequest amsCustomerInfoUpdateRequest = new AmsRequest();
        amsCustomerInfoUpdateRequest.setStartRequestString("[start] handle AmsCustomerInfoUpdateRequest, requestId: ");
        amsCustomerInfoUpdateRequest.setEndRequestString("[end] handle AmsCustomerInfoUpdateRequest, requestId: ");
        amsRequests.add(amsCustomerInfoUpdateRequest);

        AmsRequest amsCustomerModifySocialRequest = new AmsRequest();
        amsCustomerModifySocialRequest.setStartRequestString("[start] handle AmsCustomerModifySocialRequest, requestId: ");
        amsCustomerModifySocialRequest.setEndRequestString("[end] handle AmsCustomerModifySocialRequest, requestId: ");
        amsRequests.add(amsCustomerModifySocialRequest);

        AmsRequest amsCustomerNewsReloadCacheTask = new AmsRequest();
        amsCustomerNewsReloadCacheTask.setStartRequestString("[Start] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        amsCustomerNewsReloadCacheTask.setEndRequestString("[End] handle AmsCustomerNewsReloadCacheTask, requestId: ");
        amsRequests.add(amsCustomerNewsReloadCacheTask);

        AmsRequest amsCustomerNewsRequest = new AmsRequest();
        amsCustomerNewsRequest.setStartRequestString("[start] handle AmsCustomerNewsRequest, requestId: ");
        amsCustomerNewsRequest.setEndRequestString("[end] handle AmsCustomerNewsRequest, requestId: ");
        amsRequests.add(amsCustomerNewsRequest);

        AmsRequest amsCustomerNewsUpdateRequest = new AmsRequest();
        amsCustomerNewsUpdateRequest.setStartRequestString("[start] handle AmsCustomerNewsUpdateRequest, requestId: ");
        amsCustomerNewsUpdateRequest.setEndRequestString("[end] handle AmsCustomerNewsUpdateRequest, requestId: ");
        amsRequests.add(amsCustomerNewsUpdateRequest);

        AmsRequest amsCustomerPaymentUpdateTask = new AmsRequest();
        amsCustomerPaymentUpdateTask.setStartRequestString("[start] handle AmsCustomerPaymentUpdateTask, requestId: ");
        amsCustomerPaymentUpdateTask.setEndRequestString("[end] handle AmsCustomerPaymentUpdateTask, requestId: ");
        amsRequests.add(amsCustomerPaymentUpdateTask);

        AmsRequest amsCustomerRegisterSocialRequest = new AmsRequest();
        amsCustomerRegisterSocialRequest.setStartRequestString("[start] handle AmsCustomerRegisterSocialRequest, requestId: ");
        amsCustomerRegisterSocialRequest.setEndRequestString("[end] handle AmsCustomerRegisterSocialRequest, requestId: ");
        amsRequests.add(amsCustomerRegisterSocialRequest);

        AmsRequest amsCustomerReportsRequest = new AmsRequest();
        amsCustomerReportsRequest.setStartRequestString("[start] handle AmsCustomerReportsRequest, requestId: ");
        amsCustomerReportsRequest.setEndRequestString("[end] handle AmsCustomerReportsRequest, requestId: ");
        amsRequests.add(amsCustomerReportsRequest);

        // TRANSACTION
        AmsRequest amsCustomerPaymentInfoRequest = new AmsRequest();
        amsCustomerPaymentInfoRequest.setStartRequestString("[start] handle AmsCustomerPaymentInfoRequest, requestId: ");
        amsCustomerPaymentInfoRequest.setEndRequestString("[end] handle AmsCustomerPaymentInfoRequest, requestId: ");
        amsRequests.add(amsCustomerPaymentInfoRequest);

        AmsRequest amsDepositRequest = new AmsRequest();
        amsDepositRequest.setStartRequestString("[start] handle AmsDepositRequest, requestId: ");
        amsDepositRequest.setEndRequestString("[end] handle AmsDepositRequest, requestId: ");
        amsRequests.add(amsDepositRequest);

        AmsRequest amsDepositUpdateTask = new AmsRequest();
        amsDepositUpdateTask.setStartRequestString("[start] handle AmsDepositUpdateTask, requestId: ");
        amsDepositUpdateTask.setEndRequestString("[end] handle AmsDepositUpdateTask, requestId: ");
        amsRequests.add(amsDepositUpdateTask);

        AmsRequest amsTransferSocialRequest = new AmsRequest();
        amsTransferSocialRequest.setStartRequestString("[start] handle AmsTransferSocialRequest, requestId: ");
        amsTransferSocialRequest.setEndRequestString("[end] handle AmsTransferSocialRequest, requestId: ");
        amsRequests.add(amsTransferSocialRequest);

        AmsRequest amsTransferRequest = new AmsRequest();
        amsTransferRequest.setStartRequestString("[start] handle AmsTransferRequest, requestId: ");
        amsTransferRequest.setEndRequestString("[end] handle AmsTransferRequest, requestId: ");
        amsRequests.add(amsTransferRequest);










































    }
}
