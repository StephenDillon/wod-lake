package org.yodes.wod.lake.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WodLakeEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WodLakeEurekaApplication.class, args);
	}
}
