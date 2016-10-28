package com.analyze.logfile.mail.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuong on 10/27/2016.
 */
public class LineUtil {

    public static List<String> getAllLineHaveValue(List<String> dataFile, String keySearch) {
        List<String> result = new ArrayList<String>();

        for (String line : dataFile) {
            if (line.contains(keySearch)) {
                result.add(line);
            }
        }

        return  result;
    }
}
