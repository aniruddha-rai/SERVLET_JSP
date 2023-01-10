package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	//public void service/doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
		// doPost ---> hides the data fetched from the web page from url unlike doGet
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
		{
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			int k = i + j;
			//System.out.println("Result is " + k); ---> Prints in console
			
			PrintWriter out = res.getWriter(); // To print in web page
			out.println("<html><body bgcolor='cyan'>");
			out.println("Result is " + k);
			out.println("</body></html>");
			
			// Request Dispatcher USE
//			// Session Management ---> To pass the date to another servlet
//			req.setAttribute("k", k);
//			//res.sendRedirect(); ---> To redirect to another site like the payment gateway
//			
//			// Request Dispatcher and Redirect ---> Used to call another servlet from one servlet
//			RequestDispatcher rd = req.getRequestDispatcher("sq");
//			rd.forward(req, res);
			
			// 3 ways to do Session Management ? Session:Cookie:URL
			
			// Redirect USE
//			// URL Rewriting
//			res.sendRedirect("sq?k="+k);	
			
			// Session USE
//			HttpSession session = req.getSession();
//			session.setAttribute("k",k);
//			res.sendRedirect("sq");
			
			// Cookie USE
//			Cookie cookie = new Cookie("k",k+"");
//			res.addCookie(cookie);
//			res.sendRedirect("sq");
			
//			res.setContentType("text.html");
			
			// Servlet Context & Config
//			ServletContext ctx = getServletContext();
//			String str = ctx.getInitParameter("name");
//			
//			ServletConfig cg = getServletConfig();
//			String str2 = cg.getInitParameter("name");
//			
//			PrintWriter out = res.getWriter();
//			out.println("Hi, My name is "+str2);
			
		}
}
