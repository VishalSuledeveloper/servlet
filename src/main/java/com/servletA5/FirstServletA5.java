package com.servletA5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FirstServletA5 implements Servlet
{
	public void init(ServletConfig cong) 
	{
		System.out.println("Servlet Started");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws IOException 
	{
		System.out.println("Servlet Responding....");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();//printing
		out.print("<h1> I am very Happy . Vishal have done first servlet </h1>");//Print in html
	}
	public void destroy() {
		System.out.println("Servlet being destroyed");
		
	}
	
	public ServletConfig getServletConfig()
	{
		return null;
	}
	
	public String getServletInfo() {
		return null;
	}
	

}
