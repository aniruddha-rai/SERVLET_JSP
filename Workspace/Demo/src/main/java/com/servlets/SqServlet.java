package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		// Request Dispatcher USE
//		int k = (int) req.getAttribute("k");
//		k = k * k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("Result is " + k);
		
		// Redirect URL use
//		int k = Integer.parseInt(req.getParameter("k"));
//		k = k * k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("Result is " + k);
		
		// Session USE
		HttpSession session = req.getSession();
		//session.removeAttribute("k");
		int k = (int) session.getAttribute("k");
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		
		// Cookie USE
		
		
	}
}
