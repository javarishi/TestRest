package com.learn.web.bo;

import org.apache.log4j.Logger;

import com.learn.web.dao.ActorDAO;
import com.learn.web.dto.ActorDTO;
import com.learn.web.exception.TestRestException;

public class ActorBO {
	
	private static Logger logger = Logger.getLogger(ActorBO.class);
	ActorDAO actorDAO = null;
	
	public ActorBO() {
		actorDAO = new ActorDAO();
	}
	
	public ActorDTO executeGetActorDetails(String actorId) 
			throws TestRestException{
		ActorDTO actor = null;
		try{
			int validActorId = Integer.parseInt(actorId);
			actor = actorDAO.fetchActorDetails(validActorId);
			if(actor == null){
				actor = new ActorDTO();
			}
		}catch(Exception e){
			logger.error("Exception in ActorBO : " + e.getMessage(), e);;
			throw new TestRestException(e.getMessage(), e);
		}
		return actor;
		
	}

}
