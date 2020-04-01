package com.ozlem.trafficrestservice;

import com.ozlem.trafficrestservice.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ITrafficService TrafficService;

    @RequestMapping("/Traffics")
    public List<Traffic> listCountries() {
        
        return TrafficService.findAll();
    }
}