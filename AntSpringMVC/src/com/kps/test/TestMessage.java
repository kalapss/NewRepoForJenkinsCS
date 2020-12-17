package com.kps.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kps.message.MessageGenerator;

public class TestMessage {

	@Test
	public void test_welcome_message() {

		MessageGenerator obj = new MessageGenerator();
		assertEquals("welcome", obj.getWelcomeMessage());

	}
 
}