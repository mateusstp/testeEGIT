package com.exemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class OlaMundo {

	@GET
	@Produces("text/plain")
	public String showHelloWorld() {
	return "Olá mundo!";
	}
}
