package com.simplilearn.Servlet_Example_04122022.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="/GenericServletExample", urlPatterns= {"/generic/hello"})
public class GenericServletExample extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.append("<html><body>");
		
		out.append("Hello World dfsdv edfzdff");
		
		
		out.append("</html></body>");
	}

}
