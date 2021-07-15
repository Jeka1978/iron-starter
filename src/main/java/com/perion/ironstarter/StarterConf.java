package com.perion.ironstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
public class StarterConf {
    @Bean
    public HelloWorldService helloWorldService(){
        return new HelloWorldService();
    }
}
