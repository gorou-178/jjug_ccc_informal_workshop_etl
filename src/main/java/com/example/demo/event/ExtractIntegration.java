package com.example.demo.event;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.stereotype.Component;

import java.io.File;

//@Component
public class ExtractIntegration {

//    @Bean
//    public MessageSource<File> sourceDirectory() {
//        FileReadingMessageSource messageSource = new FileReadingMessageSource();
//        messageSource.setDirectory(new File("src/main/resources"));
//        return messageSource;
//    }

    //@Bean
    public IntegrationFlow extractFlow() {
        return IntegrationFlow
                .from("address.extract")
                .get();
    }
}
