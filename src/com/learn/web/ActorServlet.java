package com.learn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.learn.web.bo.ActorBO;
import com.learn.web.dto.ActorDTO;
import com.learn.web.exception.TestRestException;

/**
 * Servlet implementation class ActorServlet
 */
@WebServlet("/actor")
public class ActorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActorBO actorBO = null;
	
	private static Logger logger = Logger.getLogger(ActorServlet.class);
	
	@Override
	public void init() throws ServletException {
		logger.debug("ActorServlet is Initialized");
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
		logger.debug("ActorServlet doGet is called");
		String actorId =  request.getParameter("actorId");
		logger.debug("ActorServlet actorId Paramener Value :: "  + actorId);
		
		int intActorId = 0;
		ActorDTO actor = null;
		PrintWriter writer = response.getWriter();
		response.setContentType("text/HTML");
		if(actorId != null && actorId.length() > 0){
			try{
				actor = actorBO.executeGetActorDetails(actorId.trim());
				if(actor != null){
					writer.println("<Actor> ");
					writer.println("<FirstName>" + actor.getFirstName() + "</FirstName>");
					writer.println("<LastName>" + actor.getLastName() + "</LastName>");
					writer.println("</Actor> ");
				}
			}catch(TestRestException exe){
				logger.error("TestRestException in ActorServlet : " + exe.getMessage(), exe);
				writer.println("TestRestException in ActorServlet " + exe.getMessage());
			}
			catch(Exception e){
				logger.error("Exception in ActorServlet : " + e.getMessage(), e);;
				//writer.println("Exception in ActorServlet " + e.getMessage());
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
