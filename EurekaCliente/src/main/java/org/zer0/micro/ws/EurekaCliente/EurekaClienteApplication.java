package org.zer0.micro.ws.EurekaCliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClienteApplication.class, args);
	}
}
