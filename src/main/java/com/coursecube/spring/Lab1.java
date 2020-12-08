package com.coursecube.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		
	
	
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JLCAppConfig.class);
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("custDAO");
                    /*
                    Customer cust1 = new Customer(105, "sri", "sri@jlc", 9999, "Blore");
                    cdao.addCustomer(cust1);
                    */
                List<Customer> cust2= cdao.getAllCustomers();
                for(Customer c:cust2)
                System.out.println(c);
}
}