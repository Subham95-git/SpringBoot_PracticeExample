package com.subham.service;

import java.util.List;

import com.subham.dto.CustomerDTO;

public interface CustomerService {

	public List<CustomerDTO> fetchCustomer();
	public String createCustomer(CustomerDTO dto);
	
}
