package com.jordantanjunwen.stocksupplyservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jordantanjunwen.stocksupplyservice.repository.StockRepository;

@RestController
public class StockSupplyController {
	
	private StockRepository stockRepository;

	public StockSupplyController(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}
	
	
}
