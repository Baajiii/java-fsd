package com.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.entity.EProduct;

public class EProductDAO {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	public List<EProduct> getproduct(){
		return template.query("select * from product",new RowMapper<EProduct>() {
			public EProduct mapRow(ResultSet rs, int row) throws SQLException {
				EProduct e = new EProduct();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPrice(rs.getInt(3));
				return e;
			}
		});
		
	}

}
