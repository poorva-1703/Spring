package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import com.config.MyConfigClass;
import com.entity.Emp;

public class MainClass {

	public static void main(String[] args) {

		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class); // used for Annotation 
		Emp e = context.getBean(Emp.class);
		
//		e.setEid(51);    //setter level fields
//		e.setEname("poorva");
//		e.setSalary(30979.89);
		
      System.out.println(e);		
	
	
	}

}
