package com.hazelcast.test;

import com.hazelcast.test.config.HazelcastConfig;
import com.hazelcast.test.config.SwaggerConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SwaggerConfig.class, HazelcastConfig.class})
public class ApplicationBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .headless(true)
                .run(args);
    }

}
