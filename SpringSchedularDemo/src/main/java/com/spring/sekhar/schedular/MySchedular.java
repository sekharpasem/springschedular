package com.spring.sekhar.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class MySchedular {
	@Scheduled(fixedRate = 5000)
	public void test() {
		System.out.println("test method is calling for every seconds...");
	}
}
