package com.bkoj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import static com.bkoj.mq.CodeMqInitMain.doInitCodeMq;

/**
 * 主类（项目启动入口）
 *
 * @author bk
 */
// todo 如需开启 Redis，须移除 exclude 中的内容
// @SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@SpringBootApplication()
@MapperScan("com.bkoj.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class bkMainApplication {

    public static void main(String[] args) {
        doInitCodeMq();
        SpringApplication.run(bkMainApplication.class, args);
    }

}
