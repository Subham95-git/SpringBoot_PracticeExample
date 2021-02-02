package com.subham;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class PracticeExampleApplication {

	public static void main(String[] args) {
		CustomerServiceImpl service=null;
		AbstractApplicationContext context 
			= (AbstractApplicationContext)SpringApplication.run(PracticeExampleApplication.class, args);
		service = (CustomerServiceImpl)context.getBean("customerService");
		System.out.println(service.fetchCustomer());
		context.close();
		
	}

}
