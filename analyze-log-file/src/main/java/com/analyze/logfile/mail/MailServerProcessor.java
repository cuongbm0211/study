package com.analyze.logfile.mail;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.io.Files;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Hello world!
 */
public class MailServerProcessor {
    private static final String filePath = "D:/Nextop/20 story/083 TRSPT-9712 List-up all emails have been affected/mail_server.log";
    private String email = "kim1971@hotmail.co.jp";
    private String sendDateFromCommonSendMail = "08:00:05:357";
//    private static final String sendDateFromCommonSendMail = "07:00:08:090";
//    private static final String sendDateFromCommonSendMail = "23:30:06:339";

    private SimpleDateFormat sdfCommonMail = new SimpleDateFormat("hh:mm:ss:S");
    private SimpleDateFormat sdfServer = new SimpleDateFormat("hh:mm:ss"); //Oct 24 07:00:08

    public void checkMail() throws Exception {
        Date dateSendFromCommonSendmail = sdfCommonMail.parse(sendDateFromCommonSendMail);

        String fileContent = Files.toString(new File(filePath), Charsets.UTF_8);

        List<String> dataFile = Splitter.on(System.getProperty("line.separator")).splitToList(fileContent);

        List<String> lineContainsEmails = new ArrayList<String>();
        for (String line : dataFile) {
            if (line.contains(email) && line.contains("postfix")) {
                lineContainsEmails.add(line);
            }
        }

        Set<String> allCodeWithMail = new HashSet<String>();
        for (String line : lineContainsEmails) {
            int position = line.indexOf(": to=<");
            String code = line.substring(position - 11, position);
            allCodeWithMail.add(code);
        }

        List<String> codeQualifiesTime = getCodeQualified(dateSendFromCommonSendmail, dataFile, allCodeWithMail);

        for (String code : codeQualifiesTime) {
            List<String> lineContains = new ArrayList<String>();
            for (String line : dataFile) {
                if (line.contains(code)) {
                    lineContains.add(line);
                }
            }

            boolean isSendMailSuccess = false;
            for (String line : lineContains) {
                if (line.contains("status=sent")) {
                    isSendMailSuccess = true;
                    break;
                }
            }

            if (isSendMailSuccess) {
                System.out.println(email + ", code: " + code + ", time: " + sendDateFromCommonSendMail + ": OK");
//                System.out.println(email + "/t" +": OK");
            } else {
                System.out.println(email + ", code: " + code + ", time: " + sendDateFromCommonSendMail + ": FAIL");
//                System.out.println(email + "/t" + ": FAIL");
            }
        }
    }

    private List<String> getCodeQualified(Date commonDate, List<String> dataFile, Set<String> allCodeWithMail) throws ParseException {
        List<String> codeQualifies = new ArrayList<String>();
        for (String code : allCodeWithMail) {

            List<String> lineWithCode = new ArrayList<String>();
            for (String line : dataFile) {
                if (line.contains(code)) {
                    lineWithCode.add(line);
                }
            }



            for (String line : lineWithCode) {
                if (line.contains("client")) {
                    int positionFirstColon = line.indexOf(":");
                    String date = line.substring(positionFirstColon - 2, positionFirstColon + 6);

                    Date serverDate = sdfServer.parse(date);
                    if (serverDate.getTime() - commonDate.getTime() < 1000 && serverDate.getTime() - commonDate.getTime() > - 1000) {
                        codeQualifies.add(code);
                    }
                }
            }
        }

        return codeQualifies;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSendDateFromCommonSendMail() {
        return sendDateFromCommonSendMail;
    }

    public void setSendDateFromCommonSendMail(String sendDateFromCommonSendMail) {
        this.sendDateFromCommonSendMail = sendDateFromCommonSendMail;
    }
}
