package com.digit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filter/*")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Integer count=1;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<h1 style='text-align:center;color:green'>Login Successfully</h1>");
		out.println("<h1 style='text-align:center;color:purple'>Student Details</h1>");
		if(count == 1)
		{
			RequestDispatcher rq=null;
			rq=request.getRequestDispatcher("./studentForm.jsp");
			rq.forward(request, response);
			count++;
			
		}
		System.out.println(count);
		
		if(request.getRequestURI().endsWith("std"))
		{
			System.out.println(request.getPathInfo());
			String fname=request.getParameter("firstname");
			String lname=request.getParameter("lastname");
			String email=request.getParameter("email");
			String phone=request.getParameter("mobile");
			String gender=request.getParameter("gender");
			String skills1=request.getParameter("skill1");
			String skills2=request.getParameter("skill2");
			String skills3=request.getParameter("skill3");
			String qual = request.getParameter("qual");
			String area=request.getParameter("area");
			
			System.out.println(fname+" "+lname+" "+email+" "+phone+" "+gender+" "+skills1+" "+skills2+" "+skills3+" "+qual+" "+area);
			RequestDispatcher rq=null;
			request.setAttribute("fname",fname);
			request.setAttribute("fname",fname);
			request.setAttribute("fname",fname);
			request.setAttribute("fname",fname);
			request.setAttribute("fname",fname);
			
			if(skills1 != null)
			{
				request.setAttribute("skills1",skills1 );
			}
			if(skills2 != null)
			{
				request.setAttribute("skills2",skills2 );
			}
			if(skills3 != null)
			{
				request.setAttribute("skills3",skills3 );
			}
			
			request.setAttribute("fname",fname);
			request.setAttribute("fname",fname);
			rq=request.getRequestDispatcher("./studentdetail.jsp");
			rq.forward(request, response);
			
		}
		out.close();
		
	}
	

}
