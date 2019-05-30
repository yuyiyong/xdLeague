package com.xdleague.dahei01;

import hydh.libinfrastructure.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dahei01Application {

    private static LogUtil logger = new LogUtil(Dahei01Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Dahei01Application.class, args);
        logger.info("服务已启动。。。。");
    }
}
