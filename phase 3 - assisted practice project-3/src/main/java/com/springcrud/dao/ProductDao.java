package com.springcrud.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcrud.beans.Product;

public class ProductDao {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}
	
	
	public List<Product> getProductDetails(){
		String sql="select * from Employee";
		List<Product> proList = template.query(sql, new ProductMapper());
		return proList;
	}
	
	
	
}