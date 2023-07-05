package com.jut.Spring_IOC_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    
	public static void main( String[] args )
    {
    	ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/jut/Spring_IOC_1/ApplicationContext.xml");
        
    	System.out.println("Hello World...!");
    	
        Employee e1 = (Employee) ctx.getBean("e");
        
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSal());
        System.out.println(e1.getAds());
       
    }
}
