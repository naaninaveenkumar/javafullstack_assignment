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

import com.bean.Product;
import com.service.Service;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }
    Service s=new Service();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		List<Product> list = s.display();
		HttpSession hs =  request.getSession();
		hs.setAttribute("productdetails",list);
		response.sendRedirect("RetrieveProduct.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		String option=request.getParameter("product");
		Product p=new Product();
		
		if(option.equals("insert")) {
		p.setPid(Integer.parseInt(request.getParameter("pid")));
		p.setPname(request.getParameter("pname"));
		p.setPprice(Float.parseFloat(request.getParameter("pprice")));
		p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		
		RequestDispatcher rd=request.getRequestDispatcher("InsertProduct.jsp");
		pw.println(s.insert(p));
		rd.include(request, response);
		}
		
		else if(option.equals("delete")) {
			int id=Integer.parseInt(request.getParameter("pid"));
			
			
			RequestDispatcher rd=request.getRequestDispatcher("DeleteProduct.jsp");
			pw.println(s.delete(id));
			rd.include(request, response);
			}
		
		else if(option.equals("update")) {
			int id=Integer.parseInt(request.getParameter("pid"));
			float price=Float.parseFloat(request.getParameter("pprice"));
			int quantity=Integer.parseInt(request.getParameter("quantity"));
			RequestDispatcher rd=request.getRequestDispatcher("UpdateProduct.jsp");
			pw.println(s.update(id,price,quantity));
			rd.include(request, response);
			}
		
		else if(option.equals("order")) {
			int id=Integer.parseInt(request.getParameter("pid"));
			int quantity=Integer.parseInt(request.getParameter("quantity"));
			RequestDispatcher rd=request.getRequestDispatcher("OrderProduct.jsp");
			pw.println(s.order(id, quantity));
			rd.include(request, response);
			}
	}

}
