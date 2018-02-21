package org.zer0.micro.ws.EurekaCliente;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaRest {

	@RequestMapping("/saludos")
    public String greeting() {
        return "Hola desde eureka cliente!";
    }
	
}
