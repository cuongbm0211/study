package com.analyze.logflie.mail.plmail;

import com.analyze.logfile.util.LineUtil;
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
public class BoPlMailProcessor {
    private static final String mailServerFilePath = "D:/Nextop/20 story/087 Check PL Mail/mail_server.log";

    public static void main(String[] args) throws Exception {
        String mailServerContent = Files.toString(new File(mailServerFilePath), Charsets.UTF_8);
        List<MailInfo> mailInfos = new ArrayList<MailInfo>();

        List<String> mailServerContentInLine = Splitter.on(System.getProperty("line.separator"))
                .splitToList(mailServerContent);


        List<String> mailCodes = Lists.newArrayList("89F54743F93", "3E626743AB0", "37A237443A0", "39811743AD0", "380E2744947", "3E9CF743B31", "36D2674014C", "35B0374014C");
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

    private static String getTimeSendOnPostfix(List<String> lineContainsCodes) {
        List<String> linesConttainsSmtp = LineUtil.getAllLineHaveValue(lineContainsCodes, "trs-st-hourly@traderssec.co.jp");
        String time = linesConttainsSmtp.get(linesConttainsSmtp.size()-1).substring(7, 16);
        return time;
    }

    private static String getTimeSendFromPlMail(List<String> lineContainsCodes) {
        String firstLine = lineContainsCodes.get(0);
        String time = firstLine.substring(7, 16);
        return time;
    }
}