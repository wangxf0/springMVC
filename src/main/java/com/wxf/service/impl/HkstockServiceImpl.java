package com.wxf.service.impl;

import com.wxf.dao.HkstockMapper;
import com.wxf.domain.model.Hkstock;
import com.wxf.service.HkstockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("HkstockService")
public class HkstockServiceImpl implements HkstockService {

    @Resource(name = "HkstockMapper")
    HkstockMapper hkstockMapper;

    public Hkstock getHkStock() {
        Hkstock hkstock = hkstockMapper.selectByPrimaryKey(10l);
        return hkstock;
    }
}
