package com.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.dao.LinkDao;

@WebFilter("/IndexFilter")
public class IndexFilter implements Filter {
	@SuppressWarnings("unused")
	private FilterConfig fc;
	
	public void init(FilterConfig fc) throws ServletException {
		this.fc=fc;
	}
	
	public void destroy() {
		this.fc=null;
	}
	@SuppressWarnings("rawtypes")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try{
			/* 获取显示在主页的链接 */
			List linklist=new ArrayList();
			LinkDao linkDao=new LinkDao();
			linklist=linkDao.getDefaultLink();
			request.setAttribute("linklist",linklist);
			
			/* 获取显示在首页的word */
			List wordlist = new ArrayList();

		}catch(Exception e){
			System.out.println("indexfilter dopost");
			e.printStackTrace();
		}
		
		chain.doFilter(request, response);
	}
}
