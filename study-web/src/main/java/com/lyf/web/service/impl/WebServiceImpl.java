package com.lyf.web.service.impl;

import com.lyf.web.client.CityClient;
import com.lyf.web.pojo.City;
import com.lyf.web.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebServiceImpl implements WebService {

    @Autowired
    private CityClient cityClient;

    public List<City> findAll(){
        return cityClient.findAll();
    }
}
