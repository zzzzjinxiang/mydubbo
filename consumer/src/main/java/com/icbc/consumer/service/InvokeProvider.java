package com.icbc.consumer.service;

import com.icbc.consumer.stub.FindByName;
import com.icbc.provider.stub.QueryInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InvokeProvider implements FindByName {

    QueryInfoService queryInfoService;

    @Resource
    public void setQueryInfoService(QueryInfoService queryInfoService) {
        this.queryInfoService = queryInfoService;
    }

    @Override
    public String invokeProvider(String name) {
        String names = queryInfoService.queryByName(name);
        return names;
    }
}
