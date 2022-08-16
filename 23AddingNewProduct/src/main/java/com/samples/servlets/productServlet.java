package com.samples.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.product;
import com.samples.service.productstoreService;

@WebServlet("/products")
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	productstoreService productstoreService;

	public void init() throws ServletException {
		super.init();
		this.productstoreService = new productstoreService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<product> products = this.productstoreService.getproducts();

		request.setAttribute("products", products);

		RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productname = request.getParameter("productname");
		String isbn = request.getParameter("isbn");
		String pricestr = request.getParameter("price");
		
		if (productname == null || isbn == null || pricestr == null) {
			// write a response invalid input
			// return
		}
			
		int priceint = Integer.parseInt(pricestr);

		product product = new product(isbn, productname, priceint);

		this.productstoreService.addproduct(product);

		List<product> products = this.productstoreService.getproducts();

		request.setAttribute("products", products);

		RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
		rd.forward(request, response);
	}

}