package com.learn.web.services;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/testService")
public class TestService {
	
	@POST
	@Produces("application/xml")
	@Path("/add")
	public String addService(@FormParam("action") String action){
		System.out.println("This addService should be hit from external world");
		return "<HTML><BODY> Something :: addService :: " + action + "  </BODY> </HTML>";
	}
	
	@GET
	@Produces("application/xml")
	@Path("/get")
	public String getService(@QueryParam("action") @DefaultValue("default") String action){
		System.out.println("This getService should be hit from external world");
		return "<HTML><BODY> Something :: getService :: " + action + "  </BODY> </HTML>";
	}
	
	
	@GET
	@Produces("application/xml")
	@Path("/getPathParam/{action}")
	public String getPathParam(@PathParam("action")  String action){
		System.out.println("This getService should be hit from external world");
		return "<HTML><BODY> Something :: getPathParam :: " + action + "  </BODY> </HTML>";
	}
	
	
	@GET
	@Produces("application/xml")
	@Path("/getMatrixParam")
	public String getMatrixParam(@MatrixParam("action") String action){
		System.out.println("This getService should be hit from external world");
		return "<HTML><BODY> Something :: getMatrixParam :: " + action + "  </BODY> </HTML>";
	}

}
