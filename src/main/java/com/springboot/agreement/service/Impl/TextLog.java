package com.springboot.agreement.service.Impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TextLog {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(TextLog.class);
        for(int i=0;i<=500;i++){
            System.out.println("循环"+"--"+i);
            try{
                System.out.println(1%0);
            }catch(Exception e){
                log.info("测试日志"+"--"+"异常信息"+i+"："+e);
            }
        }
    }
}