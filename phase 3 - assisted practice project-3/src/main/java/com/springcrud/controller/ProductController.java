package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.beans.Product;

import com.springcrud.dao.ProductDao;

@Controller
public class ProductController {
	@Autowired
	ProductDao dao;
	
	
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m){
		List<Product> proList= dao.getProductDetails();
		m.addAttribute("proList",proList);
		return "redirect:/list";
	}

	
	
	
	
	
}