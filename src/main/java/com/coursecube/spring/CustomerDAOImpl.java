package com.coursecube.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("custDAO")
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	JdbcTemplate jtemp;

	@Override
	public void addCustomer(Customer cust) {
		String SQL="insert into mycustomers values (?,?,?,?,?)";
		jtemp.update(SQL, cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),
				cust.getCity());
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		String SQL="select * from mycustomers";
	List<Customer> cust=	jtemp.query(SQL, new CustomerRowMapper());		
		return cust;
	}

}
