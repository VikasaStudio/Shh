package com.vikasa.shh_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ShhBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShhBeApplication.class, args);
	}

}
