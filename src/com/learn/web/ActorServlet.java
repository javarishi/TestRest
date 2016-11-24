package com.learn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.web.bo.ActorBO;
import com.learn.web.dto.ActorDTO;

/**
 * Servlet implementation class ActorServlet
 */
@WebServlet("/actor")
public class ActorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActorBO actorBO = null;
	
	@Override
	public void init() throws ServletException {
		actorBO = new ActorBO();
	}
    /**
     * Default constructor. 
     */
    public ActorServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// check request
		String actorId =  request.getParameter("actorId");
		int intActorId = 0;
		ActorDTO actor = null;
		PrintWriter writer = response.getWriter();
		if(actorId != null && actorId.length() > 0){
			try{
				intActorId = Integer.parseInt(actorId.trim());
				actor = actorBO.executeGetActorDetails(intActorId);
				if(actor != null){
					writer.append("<Actor> ");
					writer.append("<FirstName>" + actor.getFirstName() + "</FirstName>");
					writer.append("<LastName>" + actor.getLastName() + "</LastName>");
					writer.append("</Actor> ");
				}
			}catch(Exception e){
				e.printStackTrace();
				writer.append("Exception in ActorServlet " + e.getMessage());
			}
			response.flushBuffer();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
