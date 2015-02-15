package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.valueBean.Administrator;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if("login".equals(action)){
			doLogin(request,response);
		}else if("check".equals(action)){
			doCheck(request,response);
		}else if("logout".equals(action)){
			doLogout(request,response);
		}
		
	}
	
	protected void doLogin(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String forward=getInitParameter("loginPage");
		RequestDispatcher rd=request.getRequestDispatcher(forward);
		rd.forward(request,response);
	}
	protected void doLogout(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String forward=request.getContextPath();
		HttpSession session=request.getSession();
		
		session.setAttribute("administrator",null);
		response.sendRedirect(forward);
	}
	
	protected void doCheck(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String message="";
		String forward="";
		String name=this.getInitParameter("name");
		String password=this.getInitParameter("pass");
		HttpSession session=request.getSession();
		
		if(name.equals(request.getParameter("name")) && password.equals(request.getParameter("pass"))){
			Administrator logoner = new Administrator();
			logoner.setName(name);
			logoner.setPassword(password);
			session.setAttribute("administrator",logoner);
			forward=request.getContextPath();
			response.sendRedirect(forward);
		}else{
			message="用户名密码错误！";
			request.setAttribute("message", message);
			forward=getInitParameter("loginPage");
			RequestDispatcher rd=request.getRequestDispatcher(forward);
			rd.forward(request,response);
		}
	}

}
