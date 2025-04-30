package com.spring.Noon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		
		Person p1 = context.getBean(Person.class);
		Person p2= context.getBean(Person.class);
		
		p1.show();
		p2.show();
		
	}

}
