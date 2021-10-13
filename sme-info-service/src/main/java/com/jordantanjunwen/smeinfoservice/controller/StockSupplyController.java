package com.jordantanjunwen.smeinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jordantanjunwen.smeinfoservice.repository.SMERepository;

@RestController
public class StockSupplyController {
	@Autowired
    private RestTemplate restTemplate;
	
	private SMERepository smeRepository;
}
