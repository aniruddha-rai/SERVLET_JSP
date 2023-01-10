package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		// Request Dispatcher USE
//		int k = (int) req.getAttribute("k");
		
		// Redirect URL use
//		int k = Integer.parseInt(req.getParameter("k"));
		
		// Session USE
//		HttpSession session = req.getSession();
//		//session.removeAttribute("k");
//		int k = (int) session.getAttribute("k");
		
		// Cookie USE
		int k =0;
		Cookie cookies[] = req.getCookies();
		
		for (Cookie c:cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		// Common Code
//		int k = 0;
		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		System.out.println("sq called");
		
	}
}
