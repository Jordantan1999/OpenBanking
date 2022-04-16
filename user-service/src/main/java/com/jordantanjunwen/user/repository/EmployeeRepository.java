package com.jordantanjunwen.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordantanjunwen.user.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

	EmployeeEntity findEmployeeByPhoneNo(String phoneNo);
}
