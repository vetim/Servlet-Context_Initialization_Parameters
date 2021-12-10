package com.simplilearn.Servlet_Example_04122022.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletExample
 */
@WebServlet(urlPatterns ="/httpServlet", initParams = @WebInitParam(name="organization", value = "simplilearn"))
public class HttpServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String organization =null;
	private String location =null;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	organization = config.getInitParameter("organization");
    	location = config.getServletContext().getInitParameter("location");
    	super.init(config);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("HI! That is GET invocation from HttpServlet. Organization Configured as init param is:" + organization + " and " + location);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		PrintWriter pw = response.getWriter();
		pw.append(name);
	}

}
