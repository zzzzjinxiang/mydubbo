package com.icbc.provider.service;

import com.icbc.provider.dao.DubboServiceDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DubboService {

    DubboServiceDao serviceDao;

    @Resource
    public void setServiceDao(DubboServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    public String getSocre(String name) {
        return serviceDao.selectByName(name).getName();
    }
}
