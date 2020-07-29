package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.PersonType;
import com.vedisoft.utilities.ConnectionPool;
import com.vedisoft.utilities.DateUtils;

public class PersonTypeDao {
	public static void create(PersonType personType) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into person_type  (person_type, created_by, created_date, last_updated_by, last_updated_date) values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, personType.getPersonType());
			ps.setString(2, personType.getCreatedBy());
			java.sql.Date dt1 = new Date(personType.getCreatedDate().getTime());
			ps.setDate(3, dt1);
			ps.setString(4, personType.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(personType.getLastUpdatedDate().getTime());
			ps.setDate(5, dt3);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static void edit(PersonType personType) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update person_type  set person_type = ?, created_by = ?, created_date = ?, last_updated_by = ?, last_updated_date = ? where person_type_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, personType.getPersonType());
			ps.setString(2, personType.getCreatedBy());
			java.sql.Date dt1 = new Date(personType.getCreatedDate().getTime());
			ps.setDate(3, dt1);
			ps.setString(4, personType.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(personType.getLastUpdatedDate().getTime());
			ps.setDate(5, dt3);
			ps.setInt(6, personType.getPersonTypeId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static void remove(int id) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from person_type where person_type_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static PersonType find(int personTypeId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		PersonType personType = new PersonType(); 
		try {
			String sql = "select * from person_type where person_type_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, personTypeId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				personType.setPersonTypeId(personTypeId);
				personType.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt1 = rs.getDate("created_date");
				personType.setCreatedDate(new java.util.Date(dt1.getTime()));
				personType.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date dt2 = rs.getDate("last_updated_date");
				personType.setLastUpdatedDate(new java.util.Date(dt2.getTime()));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return personType;
	}
	
	public static ArrayList<PersonType> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		 ArrayList<PersonType> listPersonType = new ArrayList<PersonType>();
		try {
			String sql = "select * from person_type";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				PersonType personType = new PersonType();
				personType.setPersonTypeId(rs.getInt("person_type_id"));
				personType.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt1 = rs.getDate("created_date");
				personType.setCreatedDate(new java.util.Date(dt1.getTime()));
				personType.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date dt2 = rs.getDate("last_updated_date");
				personType.setLastUpdatedDate(new java.util.Date(dt2.getTime()));
				
				listPersonType.add(personType);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the rows." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listPersonType;
	}

	public static void main(String[] args) {
		java.util.Date dt1 = DateUtils.convertDate("10-1-2018 10:10:15");
		java.util.Date dt2 = DateUtils.convertDate("15-6-2018 10:10:15");		

//		PersonType personType = new PersonType("male", "Aprameya", dt1, "Aprameya", dt2);
//		PersonTypeDao personTypeDao = new PersonTypeDao();
//		personTypeDao.create(personType);
		
//		 PersonType personType = new PersonType(2, "male", "Aprameya", dt1, "Aprameya", dt2);
//		 PersonTypeDao personTypeDao = new PersonTypeDao();
//		 personTypeDao.edit(personType);

//		 PersonTypeDao personTypeDao = new PersonTypeDao();
//		 personTypeDao.remove(5);

//		 PersonTypeDao personTypeDao = new PersonTypeDao();
//		 PersonType personType = personTypeDao.find(3);
//		 System.out.println(personType);

//		 PersonTypeDao personTypeDao = new PersonTypeDao();
//		 ArrayList<PersonType> al = personTypeDao.findAll();
//		 for (PersonType personType : al)
//		 System.out.println(personType);		
	}

}
