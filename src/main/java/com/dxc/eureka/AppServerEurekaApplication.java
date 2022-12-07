package com.dxc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServerEurekaApplication.class, args);
	}

}
