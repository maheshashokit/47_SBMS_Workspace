package com.ashokit.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class DemoRunner implements CommandLineRunner{
	
	public DemoRunner() {
		System.out.println("Demo Runner");	
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("Demo Runner Executed  :::::" + Arrays.toString(args));
		
	}

}
