package com.lyf.web.service;

import com.lyf.web.client.CityClient;
import com.lyf.web.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WebService {

     List<City> findAll();
}
