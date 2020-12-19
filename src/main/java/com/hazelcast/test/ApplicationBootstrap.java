package com.hazelcast.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class ApplicationBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .headless(true)
                .run(args);
    }

}
