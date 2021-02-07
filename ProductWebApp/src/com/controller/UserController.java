package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Customer;
import com.bean.Product;
import com.service.CustomerService;
import com.service.Service;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    Service s=new Service();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		List<Product> list = s.display();
		HttpSession hs =  request.getSession();
		hs.setAttribute("productdetails",list);
		response.sendRedirect("Retrive.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	CustomerService cs=new CustomerService();
	Customer c=new Customer();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String option=request.getParameter("user1");
		HttpSession hs=request.getSession();
		if(option.equals("login"))
		{
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		RequestDispatcher rd=request.getRequestDispatcher("GenericLoginPage.jsp");
		int res=cs.login(user, pass);
		if(res==1) {
			rd.include(request, response);
			response.sendRedirect("CustomerView.jsp");
		}
		else if(res==2)
		{
			rd.include(request, response);
			response.sendRedirect("Index.jsp");
		}
		else {
			rd.include(request, response);
			pw.println("login failed");
		}
		}
		
		else if(option.equals("signup"))
		{
		c.setFirstname(request.getParameter("firstname"));
		c.setLastname(request.getParameter("lastname"));
		c.setGender(request.getParameter("gender"));
		c.setAge(Integer.parseInt(request.getParameter("age")));
		c.setPhnnumber(Integer.parseInt(request.getParameter("phnnumber")));
		c.setUsername(request.getParameter("username"));
		c.setPassword(request.getParameter("password"));
		RequestDispatcher rd=request.getRequestDispatcher("CustomerSignUp.jsp");
		int res=cs.createAccount(c);
		if(res==1) {
			rd.include(request, response);
			response.sendRedirect("GenericLoginPage.jsp");
		}
		else {
			rd.include(request, response);
			pw.println("account not created");
		}
		
		}
	}

}
