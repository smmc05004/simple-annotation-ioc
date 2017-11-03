package com.sample.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class EventServiceImpl {

	@Autowired
	// @Autowired -> 타입을 기준으로 주입 결정
	// setter메소드 없어도 무관계
	@Qualifier("katalk")
	// @Qualifier -> 주입받을 클래스 지정
	private MessageSender messageSender;
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	public void notice(String message) {
		messageSender.send(message);
	}
}
