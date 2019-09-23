package com.lyf.service.web;

import com.lyf.service.pojo.City;
import com.lyf.service.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * 查询全部数据
     * @return
     */
    @RequestMapping(method= GET)
    public List<City> findAll(){
        return cityService.findAll();
    }
}
