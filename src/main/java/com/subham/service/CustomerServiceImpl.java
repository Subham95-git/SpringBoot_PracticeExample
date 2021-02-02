package com.subham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.subham.dto.CustomerDTO;
import com.subham.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerrepository;

	@Override
	public List<CustomerDTO> fetchCustomer() {
		
		return customerrepository.fetchCustomer();
	}

	@Override
	public String createCustomer(CustomerDTO dto) {
		
		customerrepository.createCustomer(dto);
		
		return "Customer with name "+dto.getName()+" created";
	}

}
