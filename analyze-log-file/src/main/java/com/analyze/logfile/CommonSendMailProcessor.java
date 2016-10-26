package com.analyze.logfile;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.io.Files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class CommonSendMailProcessor {
    private static final String stringContent = "Line 3: 2016-10-25 00:00:01:574 - INFO - Logit - start process mail:  mailCode: AMS_ORDER_SUCCESS_NOTIFY_JA, from: no-reply@min-st.jp , to: kawaichikao@gmail.com , cc: , bcc: , templateId: null, subject: AMS_ORDER_SUCCESS_NOTIFY_JA, content[AmsScMailTemplateInfo [customerName=【EURJPY】短期逆バリSar, customerServiceId=100414807, eventDateTime=null, executionPrice=113.454, fullName=川井　千賀子, guruCustomerId=1055403, lastTradeTime=null, orderDate=2016/10/25 00:00:01, orderId=372534732062975233, orderType=売, symbol=EURJPY, tradeType=新規, volume=1000]]";
    private static final String filePath = "D:/Nextop/20 story/083 TRSPT-9712 List-up all emails have been affected/start-proces-mail.txt";

    public static void main(String[] args) throws Exception {
        String fileContent = Files.toString(new File(filePath), Charsets.UTF_8);
        List<MailInfo> mailInfos = new ArrayList<MailInfo>();

        List<String> lines = Splitter.on(System.getProperty("line.separator"))
                .splitToList(fileContent);
        for (String line : lines) {
            // Get date
            int firstColonPosition = line.indexOf(":");
            String date = line.substring(firstColonPosition + 2, firstColonPosition + 25);

            // get mail code
            int positionMailCode = line.indexOf("mailCode");
            String cutFromMailCode = line.substring(positionMailCode, line.length());

            //
            List<String> values = (List<String>) Splitter.on(",")
                    .trimResults()
                    .omitEmptyStrings()
                    .splitToList(cutFromMailCode);

            // Set value
            MailInfo mailInfo = new MailInfo();
            mailInfo.setMailCode(values.get(0).replace("mailCode: ", ""));
            mailInfo.setFrom(values.get(1).replace("from: ", ""));
            mailInfo.setTo(values.get(2).replace("to: ", ""));
            mailInfo.setCc(values.get(3).replace("cc:", ""));
            mailInfo.setBcc(values.get(4).replace("bcc:", ""));
            mailInfo.setSubject(values.get(6).replace("subject: ", ""));
            mailInfo.setDate(date);

            mailInfos.add(mailInfo);
        }

        for (MailInfo mailInfo:mailInfos) {
//            System.out.println(mailInfo.getDate() + "\t" + mailInfo.getMailCode() + "\t" + mailInfo.getFrom() + "\t" + mailInfo.getTo()
//            + "\t" + mailInfo.getCc() + "\t" + mailInfo.getBcc() + "\t" + mailInfo.getSubject());

            MailServerProcessor mailServerProcessor = new MailServerProcessor();
            mailServerProcessor.setEmail(mailInfo.getTo());
            mailServerProcessor.setSendDateFromCommonSendMail(mailInfo.getDate().substring(11));
            mailServerProcessor.checkMail();

        }


    }
}