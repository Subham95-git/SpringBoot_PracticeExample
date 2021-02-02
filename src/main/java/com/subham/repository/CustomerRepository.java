package com.subham.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.subham.dto.CustomerDTO;

@Repository
public class CustomerRepository {

	List<CustomerDTO> customer = null;
	
	@PostConstruct
	public void init() {
		CustomerDTO customerdto = new CustomerDTO();
		customerdto.setName("Subham");
		customerdto.setPhoneNo(1122334455);
		customerdto.setEmail("Subham.roy@gmail.com");
		customerdto.setAddress("\n Chank, Bamun Para \n Purba Burdwan \n West Bengal, 713131");
		
		customer = new ArrayList<CustomerDTO>();
		customer.add(customerdto);
	}
	
	public void createCustomer(CustomerDTO customerdto) {
		customer.add(customerdto);
	}
	
	public List<CustomerDTO> fetchCustomer(){
		return customer;
	}
}
