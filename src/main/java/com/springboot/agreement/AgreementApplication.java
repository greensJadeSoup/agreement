/*
package com.springboot.agreement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgreementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgreementApplication.class, args);
    }

}
*/
package com.springboot.agreement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication			//声明这是SpringBoot启动类
@EnableTransactionManagement	//开启事务管理
public class AgreementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgreementApplication.class, args);
    }
}
