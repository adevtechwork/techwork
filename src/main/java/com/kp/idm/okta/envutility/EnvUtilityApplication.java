package com.kp.idm.okta.envutility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EnvUtilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvUtilityApplication.class, args);
	}

}
