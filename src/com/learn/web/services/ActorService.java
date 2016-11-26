package com.learn.web.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.learn.web.bo.ActorBO;
import com.learn.web.dto.ActorDTO;
import com.learn.web.util.XMLTransformer;

@Path("actor")
public class ActorService {
	
	private final Logger logger = Logger.getLogger(ActorService.class);
	private ActorBO actorBO = null;
	
	public ActorService() {
		actorBO = new ActorBO();
	}
	
	@GET
	@Path("getDetails/{actorId}")
	@Produces("application/xml")
	public String getActorDetails(@PathParam("actorId") String actorId){
		logger.debug("Received ActorId :: " + actorId);
		String result = null;
		try{
			if(actorId != null && actorId.length() > 0){
				ActorDTO dto = actorBO.executeGetActorDetails(actorId);
				result = XMLTransformer.toXML(dto);
			}else{
				result = "Invalid ActorId provided";
			}
		}catch(Exception exe){
			logger.error("Exception in ActorBO : " + exe.getMessage(), exe);
			result = exe.getMessage();
		}
		return result;
	}
	

}
