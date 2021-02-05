package com.icbc.provider.DubboServiceImpl;

import com.icbc.provider.service.DubboService;
import com.icbc.provider.stub.QueryInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QueryInfoServiceImpl implements QueryInfoService {

    DubboService service;

    @Resource
    public void setService(DubboService service) {
        this.service = service;
    }

    @Override
    public String queryByName(String name) {
        return service.getSocre(name);
    }
}
