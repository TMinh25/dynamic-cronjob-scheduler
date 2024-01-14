package com.quartzschedule.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.quartzschedule.automation")
public class AutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationApplication.class, args);
	}

}
