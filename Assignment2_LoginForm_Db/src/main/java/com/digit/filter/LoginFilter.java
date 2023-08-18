package com.digit.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.digit.dao.ILoginCred;
import com.digit.dao.LoginCredImpl;
import com.digit.dto.LoginDetails;


@WebFilter("/filter")
public class LoginFilter extends HttpFilter implements Filter {
	ILoginCred cred= new LoginCredImpl();
	List<LoginDetails>list=cred.getDetails();;
    static
    {
    	System.out.println("LoginFilter .class file is loading........");
    }
    public LoginFilter() {
         System.out.println("LoginFilter object is instantiated.........");
    }

	
	public void destroy() {
		System.out.println("LoginFilter object is destroyed.........");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String username_error_msg =null , pass_error_msg=null;
		boolean flag=true;
		
		PrintWriter out = response.getWriter();
		String username=request.getParameter("name");
		String password= request.getParameter("pass");
		
		
		
		if(username==null || username.equals(""))
		{
			username_error_msg="Username is required";
			flag=false;
		}
		else
		{
			boolean flag2=false;
			for(int i=0;i<list.size();i++)
			{
				if(username.equals(list.get(i).getUsername()))
				{
					flag2=true;
					break;
				}
				
				
			}
			if(flag2)
			{
				flag=true;
			}
			else
			{
				username_error_msg="username is not correct";
				flag=false;	
			}
		}
		if(password==null || password.equals(""))
		{
			pass_error_msg="password should not be empty";
			flag=false;
		}
		else
		{
			boolean flag2=false;
			for(int i=0;i<list.size();i++)
			{
				if(password.equals(list.get(i).getPassword()))
				{
					flag2=true;
					break;
				}
				
				
			}
			if(flag2)
			{
				flag=true;
			}
			else
			{
				pass_error_msg="password is not correct";
				flag=false;	
			}
		}
		
		
		if(flag)
		{
			
			chain.doFilter(request, response);
		}
		else
		{
			request.setAttribute("username_error_msg",username_error_msg );
			request.setAttribute("pass_error_msg", pass_error_msg);
			RequestDispatcher rq =null;
			rq=request.getRequestDispatcher("./index.jsp");
			rq.forward(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("LoginFilter object is intialized.........");
	}

}
