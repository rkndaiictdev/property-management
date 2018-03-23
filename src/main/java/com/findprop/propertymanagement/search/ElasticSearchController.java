package com.findprop.propertymanagement.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ElasticSearchController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/property-management/elastic-search/create-indices")
    public String createIndices() {
//        restTemplate.postForEntity();
        return null;
    }

}
