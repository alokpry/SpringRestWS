package com.alok.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class TestService {

	@GET
	@Path("/hello/{msg}")
	public String sayHello(String msg){
		return "Hello"+msg;
	}
}
