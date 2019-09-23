package com.lyf.service.service;

import com.lyf.service.dao.CityDao;
import com.lyf.service.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

    /**
     * 查询全部列表
     * @return
     */
    public List<City> findAll() {
        return cityDao.findAll();
    }
}
