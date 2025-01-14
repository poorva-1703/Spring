package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Login;
import com.entity.Register;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Register r = context.getBean("reg", Register.class); //import com.entity.Register;

		Login l = context.getBean("lg", Login.class); //import com.entity.Login;


		System.out.println(r);
		System.out.println();
		System.out.println(l);
	}

}
