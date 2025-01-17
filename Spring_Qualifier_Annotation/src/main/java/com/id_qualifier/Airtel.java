package com.id_qualifier;

import org.springframework.stereotype.Component;

@Component("airtel") //"airtel" id same name attached with @Qualifier
public class Airtel implements Sim{

	@Override
	public String calling() {     //Calling is abstract method from Interface Sim
		return "U R Calling From Airtel";
	}

}
