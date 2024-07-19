package com.kishoreb.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.kishoreb.pojo.UuserDTO;

@Repository("dao_s")
public class Dao_imp implements Dao {
	//JdbcTemplate temp=new JdbcTemplate(getSource());
	@Autowired
	JdbcTemplate temp;
	
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

void cleanup() {
	String que="TRUNCATE TABLE HISTORYS1";
	temp.execute(que);
	System.out.println("All Datas Cleared!!!!!!!!");
}

@Override
public List<UuserDTO> getAll() {
	// TODO Auto-generated method stub
	 String que = "SELECT Name as yourname, " +
             "`Crush Name` as crushname, " +
             "Result as relation " +
             "FROM HISTORYS1";
	//List<Flames>flam=temp.query(que, new RowMappers());
	// Bean Property Row Mapper
	 List<UuserDTO>dtos=temp.query(que, new BeanPropertyRowMapper<UuserDTO>(UuserDTO.class));
		return dtos;
}

}
