package com.jordantanjunwen.transaction.service;

import java.util.List;

import com.jordantanjunwen.transaction.domain.Transaction;

public interface TransactionService {

	public List<Transaction> getTransactionBySource(String source);
	
	public List<Transaction> getTransactionByDestination(String destination);
	
	public Transaction doTransaction(String source, String destination, String type, Float amount);
}
