package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if("select".equals(action)){
			doSelect(request,response);
		}
		
	}
	
	protected void doSelect(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String forward=getInitParameter("listPage");
		String message = "待完成";
		
		HttpSession session = request.getSession();
		session.setAttribute("message", message);
		
		RequestDispatcher rd=request.getRequestDispatcher(forward);
		rd.forward(request,response);
	}
}
