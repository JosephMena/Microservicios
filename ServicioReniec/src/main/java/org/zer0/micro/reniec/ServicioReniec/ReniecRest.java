package org.zer0.micro.reniec.ServicioReniec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReniecRest {

	private static Map<String,Persona> dbPersona = new HashMap<>();
	 
    static {
        Persona std = new Persona(19, "Cesar Augusto","42585594");
        dbPersona.put(std.getDni(),std);
        std = new Persona(22,"Joseph Mena", "54815415");
        dbPersona.put(std.getDni(),std);
 
    }
	
    @RequestMapping(value = "/persona/{dni}", method = RequestMethod.GET)
    public Persona getPersona(@PathVariable String dni) {
        System.out.println("DNI:" + dni);
 
        Persona personaTemp = dbPersona.get(dni);
        if (personaTemp == null) {
        	personaTemp= new Persona(0,"Not Found", "N/A");
        }
        return personaTemp;
    }
}
