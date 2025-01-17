package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Emp;

// @Configuration, @Bean -used previously but not much 

//class level annotation
@Configuration // indicate its having Bean With help of @Bean
public class MyConfigClass { 
	
	@Bean    //method level annotation ,declare that class contain bean
	public Emp eobj() { //classname, method name
		return new Emp(); // Anonymous object 
		
		//we write here different class different methods as per need with help of @Bean
	}
}
