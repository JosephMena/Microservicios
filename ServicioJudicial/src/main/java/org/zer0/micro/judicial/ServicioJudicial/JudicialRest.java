package org.zer0.micro.judicial.ServicioJudicial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class JudicialRest {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/proceso/{idProceso}", method = RequestMethod.GET)
    public String getProceso(@PathVariable String idProceso) {
        System.out.println("idProceso:" + idProceso);
 
        String response = restTemplate.exchange("http://reniec-service/persona/{dni}",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, "42585594").getBody();
        
        System.out.println("Respuesta reniec service: " + response);
        
        return "id Proceso -  " + idProceso + " \n Personas:" + response;
    }
	
	@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
