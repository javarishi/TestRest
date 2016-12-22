package com.learn.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.learn.web.dto.ActorDTO;

public class ActorDAO {
	
	private final String fetchActorWithActorId = ""
			+ "SELECT `actor`.`actor_id`, "
			+ "    `actor`.`first_name`, "
			+ "    `actor`.`last_name`, "
			+ "    `actor`.`last_update` "
			+ "FROM `sakila`.`actor` "
			+ "WHERE `actor`.`actor_id` = ?;";

	public ActorDAO() {
		String check = null;
		if(check.length() > 0){
			System.out.println("I am a Bug");
		}
	}

	
	public ActorDTO fetchActorDetails(int actorId) throws Exception{
		Connection conn = null;
		ActorDTO actor = new ActorDTO();
		try{
			conn = DBUtility.getConnection();
			PreparedStatement pStat = conn.prepareStatement(fetchActorWithActorId);
			pStat.setInt(1, actorId);
			ResultSet rs = pStat.executeQuery();
			
			while(rs.next()){
				actor.setActorId(rs.getInt("actor_id"));
				actor.setFirstName(rs.getString("first_name"));
				actor.setLastName(rs.getString("last_name"));
				actor.setLastUpdate(rs.getTimestamp("last_update"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtility.closeConnection(conn);
		}
		
		return actor;
	}
}
