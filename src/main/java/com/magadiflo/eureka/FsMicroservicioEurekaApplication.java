package com.magadiflo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // Habilitamos este microservicio como un Servidor Eureka
@SpringBootApplication
public class FsMicroservicioEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsMicroservicioEurekaApplication.class, args);
	}

}
