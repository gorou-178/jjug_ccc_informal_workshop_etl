package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@Component
public class StartupListener {

    private boolean isProcessed = false;

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationEvent() {
        System.out.println("This will run once on startup.");
        this.isProcessed = true;
    }

    public boolean isProcessed() {
        return this.isProcessed;
    }
}
