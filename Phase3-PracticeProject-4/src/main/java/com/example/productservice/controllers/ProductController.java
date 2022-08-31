package com.example.productservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@RequestMapping("/products")
	public String getProducts(ModelMap model) {
		Iterable<Product> pro = repo.findAll();
		model.addAttribute("products", pro);
		return "products";
	}
	
}