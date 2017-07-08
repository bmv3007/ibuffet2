package com.mycompany.ibuffet.web;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.ibuffet.beans.Product;

/**
 * Servlet implementation class Controller2
 */
public class Controller2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("**********************");
		response.setContentType("image/jpeg");
		OutputStream out = response.getOutputStream();
		
		try{
			int index = Integer.valueOf(request.getParameter("im_id"));
			ArrayList<Product> list = (ArrayList<Product> ) request.getSession(false).getAttribute("currentProductList");
			Product product = list.get(index);
			response.setContentLength(product.getImage().length);
			
			out.write(product.getImage());
		}finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
