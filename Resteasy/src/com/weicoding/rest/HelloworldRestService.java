package com.weicoding.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/echo")
public class HelloworldRestService {
 
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
 
		String result = "Welcome to our Adroid world: " + msg;
 
		return Response.status(200).entity(result).build();
 
	}
 
}
