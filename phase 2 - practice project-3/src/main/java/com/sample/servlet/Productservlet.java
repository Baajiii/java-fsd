package com.sample.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.domain.Product;
import com.sample.service.Productstoreservice;

@WebServlet("/products")
public class Productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Productstoreservice productstoreService;

	public void init() throws ServletException {
		super.init();
		this.productstoreService = new Productstoreservice();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Product> products = this.productstoreService.getProducts();

		request.setAttribute("products", products);

		RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productname = request.getParameter("productname");
		String pricestr = request.getParameter("price");
		
		if (productname == null ||pricestr == null) {
			// write a response invalid input
			// return
		}
			
		int priceint = Integer.parseInt(pricestr);

		Product product = new Product(productname, priceint);

		this.productstoreService.addProduct(product);

		List<Product> products = this.productstoreService.getProducts();

		request.setAttribute("products", products);

		RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
		rd.forward(request, response);
	}

}