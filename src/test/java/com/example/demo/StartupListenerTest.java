package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StartupListenerTest {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private StartupListener startupListener;

    @Autowired
    private ApplicationContext context;

    @Test
    public void testOnApplicationEvent() {

        SpringApplication application = new SpringApplication();
        eventPublisher.publishEvent(new ApplicationReadyEvent(application, new String[]{}, (ConfigurableApplicationContext) context, Duration.ofSeconds(1)));

        // リスナーが処理されたか確認
        assertThat(startupListener.isProcessed()).isTrue();
    }
}
