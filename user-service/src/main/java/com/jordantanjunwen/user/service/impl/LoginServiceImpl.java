package com.jordantanjunwen.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordantanjunwen.user.domain.Login;
import com.jordantanjunwen.user.domain.User;
import com.jordantanjunwen.user.entity.CustomerEntity;
import com.jordantanjunwen.user.entity.EmployeeEntity;
import com.jordantanjunwen.user.exception.UserNotFoundException;
import com.jordantanjunwen.user.repository.CustomerRepository;
import com.jordantanjunwen.user.repository.EmployeeRepository;
import com.jordantanjunwen.user.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService
{
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public User loginUser(Login credentials) throws UserNotFoundException 
	{
		User user = null;
		if("CUSTOMER".equalsIgnoreCase(credentials.getUserRole())) 
		{
			user =  customerRepo.findCustomerByPhoneNo(credentials.getPhoneNo());
			
			if(user == null)
				throw new UserNotFoundException("User not found by phone no");
		} 
		else if("EMPLOYEE".equalsIgnoreCase(credentials.getUserRole())) 
		{
			user = employeeRepo.findEmployeeByPhoneNo(credentials.getPhoneNo());
			
			if(user == null)
				throw new UserNotFoundException("User not found by phone no");
		}
		
		if(user.getPassword().equals(credentials.getPassword())) 
		{
			if(user instanceof CustomerEntity)
				return CustomerEntity.prepareDTO((CustomerEntity) user);
			else
				return EmployeeEntity.prepareEmployeeDTO((EmployeeEntity) user);
		}
		return null;
	}

}