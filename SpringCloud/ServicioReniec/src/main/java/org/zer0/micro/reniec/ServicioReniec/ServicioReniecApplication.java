package org.zer0.micro.reniec.ServicioReniec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicioReniecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioReniecApplication.class, args);
	}
}
