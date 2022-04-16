package com.jordantanjunwen.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordantanjunwen.user.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

	CustomerEntity findCustomerByPhoneNo(String phoneNo);
}
