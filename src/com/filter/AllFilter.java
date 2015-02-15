package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AllFilter implements Filter {
	@SuppressWarnings("unused")
	private FilterConfig fc;
	
	public void init(FilterConfig fc) throws ServletException {
		this.fc=fc;
	}
	
	public void destroy() {
		this.fc=null;
	}
	
	public void doFilter(ServletRequest sRequest, ServletResponse sResponse,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)sRequest;
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(sRequest,sResponse);
	}
}
