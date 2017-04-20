package com.study.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by CuongBM on 1/22/2017.
 */
public class Hello implements Job {
    private static final Logger logger = LoggerFactory.getLogger(Hello.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Job is call");
    }
}
