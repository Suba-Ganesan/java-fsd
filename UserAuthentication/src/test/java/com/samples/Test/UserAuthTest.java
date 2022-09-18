package com.samples.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.samples.service.UserAuthentication;


class UserAuthenticationTest {
	
	private UserAuthentication user;

	@BeforeEach
	public void setup() {
		user = new UserAuthentication();
		System.out.println("UserAuthentication class inititated");
	}


	@AfterEach
	public void tearDown() {
		user = null;
		System.out.println("UserAuthentication Class Closed");
	}

	@Test
	@DisplayName("UserEmailTest")
	void testuserId() {
		assertEquals("suba@gmail.com", user.userId());
	}

	@Test
	public void checkUserNull() {
		assertNotNull(user.userId());
	}

	@Test
	@DisplayName("UserPasswordTest")
	void testpswrd() {
		assertEquals("1234", user.pswrd());
	}

	@Test
	public void checkPasswordNull() {
		assertNotNull(user.pswrd());
	}

	@Test
	public void checkUser1() {
		String email = user.userId();
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		assertEquals(true, matcher.matches());

	}

}

