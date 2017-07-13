package org.rajesh.main;

import org.rajesh.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		shapeService.getCircle().setName("My Own Circle");
		System.out.println(shapeService.getCircle().getName());
				
	}

}
