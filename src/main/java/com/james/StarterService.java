package com.james;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StarterService {

    Logger logger = LogManager.getLogger();

    public void doSomething() {
        logger.info("这是来自starter的日志，starter项目内是使用log4j的api进行日志打印");
    }

}
