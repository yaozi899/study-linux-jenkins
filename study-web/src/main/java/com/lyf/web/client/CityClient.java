package com.lyf.web.client;

import com.lyf.web.pojo.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("study-service")
public interface CityClient {

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public List<City> findAll();
}
