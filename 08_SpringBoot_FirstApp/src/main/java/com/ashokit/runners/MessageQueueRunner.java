package com.ashokit.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageQueueRunner implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Non-Option Values ::::" + args.getNonOptionArgs());
		
		
		Set<String> optionNames = args.getOptionNames();		
		//Java8 streams
		optionNames.forEach(optionName -> {
			String optionValue = args.getOptionValues(optionName).get(0);
			System.out.println(optionName +"======" + optionValue);
		});
		
	}

}
