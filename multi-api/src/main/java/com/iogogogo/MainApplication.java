package com.iogogogo;

import com.iogogogo.common.util.IdHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tao.zeng on 2019-07-27.
 */
@Slf4j
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 这里的IdHelper 类，来自于multi-common module
        log.info("uuid [{}]", IdHelper.uuid());
        log.info("ARTIFACTID [{}]", Version.ARTIFACTID);
        log.info("DESCRIPTION [{}]", Version.DESCRIPTION);
        log.info("TIMESTAMP [{}]", Version.TIMESTAMP);
        log.info("VERSION [{}]", Version.VERSION);
        SpringApplication.run(MainApplication.class, args);
    }
}
