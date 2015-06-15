package com.radhi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		response.setContentType("text/html;charset=UTF-8");
		//PrintWriter out = response.getWriter();
		//String name = request.getParameter("name");
		//response.sendRedirect("thankyou.jsp");
		request.getRequestDispatcher("thankyou.jsp").forward(request, response);
		
		
	/*	try{
			out.println("<!DOCTYPE html>");
	         out.println("<html><head>");
	         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	         out.println("<title>Hello, World</title></head>");
	         out.println("<body>");
	         out.println("<h1>Hello, world!"+name+"</h1>");  // says Hello
	         out.println("</body>");
	         out.println("</html>");
		}
		finally{
			out.close();
		}*/
	}
		public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			
			try{
				out.println("<!DOCTYPE html>");
		         out.println("<html><head>");
		         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		         out.println("<title>Hello from Post, World</title></head>");
		         out.println("<body>");
		         out.println("<h1>Hello, world!"+name+"</h1>");  // says Hello
		         out.println("</body>");
		         out.println("</html>");
			}
			finally{
				out.close();
			}
			
	}

}
