package com.sample.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		String resources = "classpath:/META-INF/spring/demo2-resource-context.xml";
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(resources);

		MemberServiceImpl service = context.getBean(MemberServiceImpl.class);
		service.removeAllMembers();
		
		context.destroy();
		
		System.out.println("종료....");
	}
}
