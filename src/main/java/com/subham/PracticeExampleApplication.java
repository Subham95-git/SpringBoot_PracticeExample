package com.subham;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.subham.dto.CustomerDTO;
import com.subham.service.CustomerServiceImpl;

@SpringBootApplication
public class PracticeExampleApplication {

	public static void main(String[] args) {
		CustomerServiceImpl service=null;
		AbstractApplicationContext context 
			= (AbstractApplicationContext)SpringApplication.run(PracticeExampleApplication.class, args);
		service = (CustomerServiceImpl)context.getBean("customerService");
		
		List<CustomerDTO> customer = service.fetchCustomer();
		
		
		
		for(CustomerDTO dto : customer) {
			System.out.println(" Name: "+dto.getName()+"\n Phone: "+dto.getPhoneNo()+"\n Email: "+ dto.getEmail()+"\n Address: "+dto.getAddress());
		}
		
		context.close();
		
	}
	


}
