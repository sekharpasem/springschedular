package com.spring.sekhar.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Configuration
 * 
 * @author Sekhar
 */
@Configuration
@ComponentScan(basePackages = "com.spring.sekhar.*")
@EnableScheduling
public class AppConfiguration {

	public static void main( String[] args )
    {
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(AppConfiguration.class);
    }
}
