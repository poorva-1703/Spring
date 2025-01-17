package com.id_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);

		Person p = context.getBean(Person.class);

		System.out.println(p.getSim1().calling()); //p.ref and ref class.method
		System.out.println(p.getSim2().calling());
	}

}
