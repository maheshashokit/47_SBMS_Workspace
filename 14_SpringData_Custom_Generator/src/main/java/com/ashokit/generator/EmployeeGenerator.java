package com.ashokit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.jdbc.ReturningWork;

public class EmployeeGenerator implements IdentifierGenerator {

	private static final long serialVersionUID = 1L;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String formattedEmployeeId = "ashokit_%s"; //Prefix : ashokit_ && suffix:Random number from sequence
		String employeeId = null;
	
		//obtaining the Connection object from Hibernate
	    Connection con = session.doReturningWork(new ReturningWork<Connection>() {
            @Override
            public Connection execute(Connection conn) throws SQLException {
                return conn;
            }
        });
	    
	    //try with resource(Java7 Version)
		try(Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select ashokit_emp_seq.nextval from dual");) {
			
			if (rs.next()) {
				employeeId = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Generated While generating custom sequence");
		}
		System.out.println("Format::::" + String.format(formattedEmployeeId,employeeId));
		return String.format(formattedEmployeeId,employeeId);
	}
}
/* create sequence ashokit_emp_seq start with 501 increment by 1; */
