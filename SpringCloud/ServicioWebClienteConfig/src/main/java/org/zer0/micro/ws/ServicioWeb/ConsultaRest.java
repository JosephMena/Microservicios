package org.zer0.micro.ws.ServicioWeb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConsultaRest {

	@Value("${msg:No hay configuracion con el server 2}")
    private String msg;
 
    @RequestMapping("/consulta")
    String getMsg() {
        return this.msg;
    }
	
}