package com.ashokit.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class TestRunner implements CommandLineRunner{
	
	public TestRunner() {
		System.out.println("Test Runner");	
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("Test Runner Executed  :::::" + Arrays.toString(args));
		
	}

}
