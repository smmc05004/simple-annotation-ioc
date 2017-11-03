package com.sample.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sun.org.apache.xerces.internal.dom.events.EventImpl;

public class App1 {

	public static void main(String[] args) {
		
		String resources = "classpath:/META-INF/spring/demo1-annotation-scan-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resources);
		
		EventServiceImpl service = context.getBean(EventServiceImpl.class);
		service.notice("빅세일");
	}
}
