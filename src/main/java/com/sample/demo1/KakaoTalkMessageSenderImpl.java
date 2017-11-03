package com.sample.demo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("katalk")
public class KakaoTalkMessageSenderImpl implements MessageSender {

	public void send(String message) {
		System.out.println("카톡:" + message);
	}
}
