package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servlet implements Servlet {

	public void destroy() {
		System.out.println("destroy()");
	}

	public ServletConfig getServletConfig() {
		System.out.println("servletconfig ()");
		return null;
	}

	public String getServletInfo() {
		System.out.println("get servletinfo");
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init()");

	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service method()");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("the first application");
		writer.println("the first application");
	}

}
