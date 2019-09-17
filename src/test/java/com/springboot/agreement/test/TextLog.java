package com.springboot.agreement.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TextLog {
    public static Log log = LogFactory.getLog(TextLog.class);
    public static void main(String[] argv) {
        String test="sdibt";
        log.info("this is info:"+test);
        log.error("this is error:"+test);
        log.debug("this is debug:"+test);
    }

}