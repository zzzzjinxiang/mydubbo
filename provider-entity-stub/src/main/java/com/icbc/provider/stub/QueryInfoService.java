package com.icbc.provider.stub;

import org.springframework.stereotype.Component;

@Component
public interface QueryInfoService {

    public String queryByName(String name);
}
