package com.lyf.web.controller;

import com.lyf.web.pojo.City;
import com.lyf.web.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/web")
public class WebController {

    @Autowired
    private WebService webService;

    /**
     * 查询全部数据
     * @return
     */
    @RequestMapping(method= GET)
    public List<City> findAll(){
        return webService.findAll();
    }

}
