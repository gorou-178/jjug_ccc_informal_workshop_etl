package com.example.demo.event;

import com.example.demo.dao.Address;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

//@MessagingGateway
public interface ExtractEventGateway {
    //@Gateway(requestChannel = "address.extract")
    void extract(Address address);
}
