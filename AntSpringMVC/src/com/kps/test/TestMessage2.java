package com.kps.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kps.message.MessageGenerator;

public class TestMessage2 {

	@Test
	public void test_welcome_message_2() {

		MessageGenerator obj = new MessageGenerator();
		assertEquals("welcome", obj.getWelcomeMessage());

	}
 
}