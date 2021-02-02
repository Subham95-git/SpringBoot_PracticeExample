package com.subham;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Value("100")
	private int count;

	@Override
	public String fetchCustomer() {
		
		return "The number of customer fetched are: "+count;
	}

	@Override
	public String createCustomer() {
		
		return "Custoer is created Successfully";
	}

}
