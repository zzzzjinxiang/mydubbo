package com.icbc.consumer.stub;

import org.springframework.stereotype.Component;

@Component
public interface FindByName {

    public String invokeProvider(String name);
}
