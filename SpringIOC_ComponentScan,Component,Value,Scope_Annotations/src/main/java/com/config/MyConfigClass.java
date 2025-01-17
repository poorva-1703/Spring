package com.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.entity") //Scan Particular Class & Mark As a Bean class with Help of the @Component Annotation 
public class MyConfigClass { //Means it search which class have @Component Annotation

}
