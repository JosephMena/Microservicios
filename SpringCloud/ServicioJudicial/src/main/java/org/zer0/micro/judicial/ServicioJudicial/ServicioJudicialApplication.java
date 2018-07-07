package org.zer0.micro.judicial.ServicioJudicial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicioJudicialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioJudicialApplication.class, args);
	}
}
