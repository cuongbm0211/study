package com.analyze.logflie.mail.plmail;

import com.analyze.logfile.mail.util.LineUtil;
import com.analyze.logflie.mail.bean.MailInfo;
import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.io.Files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class DealingPlMailProcessor {
    private static final String mailServerFilePath = "D:/Nextop/20 story/087 Check PL Mail/mail_server.log";

    public static void main(String[] args) throws Exception {
        String mailServerContent = Files.toString(new File(mailServerFilePath), Charsets.UTF_8);
        List<MailInfo> mailInfos = new ArrayList<MailInfo>();

        List<String> mailServerContentInLine = Splitter.on(System.getProperty("line.separator"))
                .splitToList(mailServerContent);

        List<String> allLineFromPlMail = LineUtil.getAllLineHaveValue(mailServerContentInLine, "client=tft-webs4-f[10.8.10.22]");
        // Oct 24 07:00:03 mail postfix/smtpd[27911]: DB34D743CB1: client=tft-webs4-f[10.8.10.22], sasl_method=LOGIN, sasl_username=no-reply@min-st.jp

        // Get mail code
        List<String> mailCodes = Lists.newArrayList();
        for (String line : allLineFromPlMail) {
            int position = line.indexOf("]: ");
            String mailCode = line.substring(position + 3, position + 14);
            mailCodes.add(mailCode);
        }

        // Work with mail code
        for (String code : mailCodes) {
            List<String> lineContainsCodes = LineUtil.getAllLineHaveValue(mailServerContentInLine, code);

            // Check status
            boolean isSendMailSuccess = false;
            for (String line : lineContainsCodes) {
                if (line.contains("status=sent")) {
                    isSendMailSuccess = true;
                    break;
                }
            }

            // Get time send from pl
            String timeFromPlMail = getTimeSendFromPlMail(lineContainsCodes);

            // Get time resend on posfix
            String timeSendOnPostfix = getTimeSendOnPostfix(lineContainsCodes);

            System.out.println(timeFromPlMail + "\t" + timeSendOnPostfix + "\t" + isSendMailSuccess + "\t" + code);
        }


    }

    private static boolean checkPostfixReceiveAndSendImmidiately(List<String> lineContainsCodes) {
        List<String> lineContainsPostfixSmtpd = LineUtil.getAllLineHaveValue(lineContainsCodes, "postfix/smtpd");
        if (lineContainsPostfixSmtpd.size() == 1) return true;

        return false;
    }

    private static String getTimeSendOnPostfix(List<String> lineContainsCodes) {
        List<String> linesConttainsSmtp = LineUtil.getAllLineHaveValue(lineContainsCodes, "trs-st-hourly@traderssec.co.jp");
        String time = linesConttainsSmtp.get(linesConttainsSmtp.size() -1).substring(7, 16);
        return time;
    }

    private static String getTimeSendFromPlMail(List<String> lineContainsCodes) {
        String firstLine = lineContainsCodes.get(0);
        String time = firstLine.substring(7, 16);
        return time;
    }
}