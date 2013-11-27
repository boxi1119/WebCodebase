package com.weicoding.services;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.weicoding.model.User;

@Local
@Path("/users")
@Produces("application/xml")
public interface UserServiceIntf {
	@GET
    @Path("/{id}")
    public User getUser(@PathParam("id") int id);
}
