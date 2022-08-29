package com.springcrud.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcrud.beans.Product;
public class ProductMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum)throws SQLException{
		Product pro =new Product();
		
		pro.setId(rs.getInt("id"));
		pro.setName(rs.getString("name"));
		pro.setPrice(rs.getInt("price"));
		return pro;
	}
	

	
	

}