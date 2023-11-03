package com.example.elk.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkLogsDemoApplication {

    private static final Logger LOG = LogManager.getLogger(ElkLogsDemoApplication.class);

    public static void main(String[] args) {
        LOG.debug("Debug log message");
        LOG.info("Info log message");
        LOG.warn("Warn log message");
        LOG.error("Error log message");
        SpringApplication.run(ElkLogsDemoApplication.class, args);
    }

}
