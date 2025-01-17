package com.id_qualifier;

import org.springframework.stereotype.Component;

@Component("jio") //"jio" id same name attached with @Qualifier
public class Jio implements Sim {

	@Override
	public String calling() {   //Calling is abstract method from Interface Sim
		return "U R Calling From Jio";
	}

}
