package com.analyze.logfile.ams;

import java.util.Date;

/**
 * Created by cuong on 10/26/2016.
 */
public class AmsRequest {
    private String startRequestString;
    private String endRequestString;
    private Date startTime;
    private Date endTime;

    public AmsRequest() {
    }

    public String getStartRequestString() {
        return startRequestString;
    }

    public void setStartRequestString(String startRequestString) {
        this.startRequestString = startRequestString;
    }

    public String getEndRequestString() {
        return endRequestString;
    }

    public void setEndRequestString(String endRequestString) {
        this.endRequestString = endRequestString;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
