package com.sample.demo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SmsMessageSenderImpl implements MessageSender {

	public void send(String message) {
		System.out.println("sms발송: " + message);
	}
}
