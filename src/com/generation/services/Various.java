package com.generation.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/*Creando la URI*/
@Path("/services")
public class Various {

	/*El primer path accede al recurso mientras que los proximos agregaran 
	 * solo a servicios.*/
	@GET
	@Path("/messaging")
	public String message() {
		return "Returning a message..";
	}
	
	
}
