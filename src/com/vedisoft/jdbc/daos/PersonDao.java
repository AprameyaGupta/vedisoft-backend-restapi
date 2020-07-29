package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.Person;
import com.vedisoft.utilities.ConnectionPool;
import com.vedisoft.utilities.DateUtils;

public class PersonDao {

	public static int create(Person person) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		int id = 0;
		try {
			String sql = "insert into person (person_type_id,person_name,designation,branch_id,contact_no,address,plot_no,street,locality,city,state,dob,doj,dol,email,username,password,key1,active,card_no,created_by,created_date,last_updated_by,last_updated_date"
					+ ") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,)";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, person.getPersonTypeId());
			ps.setString(2, person.getPersonName());
			ps.setString(3, person.getDesignation());
			ps.setInt(4, person.getBranchId());
			ps.setString(5, person.getContactNo());
			ps.setString(6, person.getAddress());
			ps.setString(7, person.getPlotNo());
			ps.setString(8, person.getStreet());
			ps.setString(9, person.getLocality());
			ps.setString(10, person.getCity());
			ps.setString(11, person.getState());
			java.sql.Date dob = new java.sql.Date(person.getDob().getTime());
			ps.setDate(12, dob);
			java.sql.Date doj = new java.sql.Date(person.getDoj().getTime());
			ps.setDate(13, doj);
			java.sql.Date dol = new java.sql.Date(person.getDol().getTime());
			ps.setDate(14, dol);			
			ps.setString(15, person.getEmail());
			ps.setString(16, person.getUsername());
			ps.setString(17, person.getPassword());
			ps.setString(18, person.getKey1());
			ps.setString(19, person.getActive());
			ps.setString(20, person.getCardNo());
			ps.setString(21, person.getCreatedBy());			
			java.sql.Date cd = new java.sql.Date(person.getCreatedDate().getTime());
			ps.setDate(22, cd);
			ps.setString(23, person.getLastUpdatedBy());		
			java.sql.Date lud = new java.sql.Date(person.getLastUpdatedDate().getTime());
			ps.setDate(24, lud);

		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return id;

	}

	public static boolean edit(Person person) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		boolean rslt = true;
		try {
			String sql = "update person set person_type_id=?,person_name=?,designation=?,branch_id=?,contact_no=?,address=?,plot_no=?,street=?,locality=?,city=?,state=?,dob=?,doj=?,dol=?,email=?,username=?,password=?,key1=?,active=?,card_no=?,created_by=?,created_date=?,last_updated_by=?,last_updated_date=? where personId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, person.getPersonTypeId());
			ps.setString(2, person.getPersonName());
			ps.setString(3, person.getDesignation());
			ps.setInt(4, person.getBranchId());
			ps.setString(5, person.getContactNo());
			ps.setString(6, person.getAddress());
			ps.setString(7, person.getPlotNo());
			ps.setString(8, person.getStreet());
			ps.setString(9, person.getLocality());
			ps.setString(10, person.getCity());
			ps.setString(11, person.getState());
			java.sql.Date dob = new java.sql.Date(person.getDob().getTime());
			ps.setDate(12, dob);
			java.sql.Date doj = new java.sql.Date(person.getDoj().getTime());
			ps.setDate(13, doj);
			java.sql.Date dol = new java.sql.Date(person.getDol().getTime());
			ps.setDate(14, dol);			
			ps.setString(15, person.getEmail());
			ps.setString(16, person.getUsername());
			ps.setString(17, person.getPassword());
			ps.setString(18, person.getKey1());
			ps.setString(19, person.getActive());
			ps.setString(20, person.getCardNo());
			ps.setString(21, person.getCreatedBy());			
			java.sql.Date cd = new java.sql.Date(person.getCreatedDate().getTime());
			ps.setDate(22, cd);
			ps.setString(23, person.getLastUpdatedBy());		
			java.sql.Date lud = new java.sql.Date(person.getLastUpdatedDate().getTime());
			ps.setDate(24, lud);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			rslt = false;
		} finally {
			pool.putConnection(conn);
		}
		return rslt;
	}

	public static boolean remove(int personId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		boolean rslt = true;
		try {
			String sql = "delete from person where person_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, personId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			rslt = false;
		} finally {
			pool.putConnection(conn);
		}
		return rslt;
	}

	public static Person find(int personId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Person person = new Person();
		try {
			String sql = "select * from person where person_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, personId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				person.setPersonId(personId);
				person.setPersonTypeId(rs.getInt("person_type_id"));
				person.setPersonName(rs.getString("person_name"));
				person.setDesignation(rs.getString("designation"));
				person.setBranchId(rs.getInt("branch_id"));
				person.setContactNo(rs.getString("contact_no"));
				person.setAddress(rs.getString("address"));
				person.setPlotNo(rs.getString("plot_no"));
				person.setStreet(rs.getString("street"));
				person.setLocality(rs.getString("locality"));
				person.setCity(rs.getString("city"));
				person.setState(rs.getString("state"));
				java.sql.Date dob = rs.getDate("dob");
				person.setDob(new java.util.Date(dob.getTime()));
				java.sql.Date doj = rs.getDate("doj");
				person.setDoj(new java.util.Date(doj.getTime()));
				java.sql.Date dol = rs.getDate("dol");
				person.setDol(new java.util.Date(dol.getTime()));
	
				person.setEmail(rs.getString("email"));
				person.setUsername(rs.getString("username"));
				person.setKey1(rs.getString("key1"));
				person.setActive(rs.getString("active"));
				person.setCardNo(rs.getString("card_no"));
				person.setCreatedBy(rs.getString("created_by"));
				java.sql.Date cd = rs.getDate("created_date");
				person.setCreatedDate(new java.util.Date(cd.getTime()));
				person.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date lud = rs.getDate("last_upadted_date");
				person.setLastUpdatedDate(new java.util.Date(lud.getTime()));
				
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return person;
	}

	 public static ArrayList<Person> findAll() {
	 ConnectionPool pool = ConnectionPool.getInstance();
	 pool.initialize();
	 Connection conn = pool.getConnection();
	 ArrayList<Person> listperson = new ArrayList<Person>();
	 try {
	 String sql = "select * from person";
	 PreparedStatement ps = conn.prepareStatement(sql);
	 ResultSet rs = ps.executeQuery();
	 while (rs.next()) {
	 Person person = new Person();
		person.setPersonTypeId(rs.getInt("person_type_id"));
		person.setPersonName(rs.getString("person_name"));
		person.setDesignation(rs.getString("designation"));
		person.setBranchId(rs.getInt("branch_id"));
		person.setContactNo(rs.getString("contact_no"));
		person.setAddress(rs.getString("address"));
		person.setPlotNo(rs.getString("plot_no"));
		person.setStreet(rs.getString("street"));
		person.setLocality(rs.getString("locality"));
		person.setCity(rs.getString("city"));
		person.setState(rs.getString("state"));
		java.sql.Date dob = rs.getDate("dob");
		person.setDob(new java.util.Date(dob.getTime()));
		java.sql.Date doj = rs.getDate("doj");
		person.setDoj(new java.util.Date(doj.getTime()));
		java.sql.Date dol = rs.getDate("dol");
		person.setDol(new java.util.Date(dol.getTime()));
		person.setEmail(rs.getString("email"));
		person.setUsername(rs.getString("username"));
		person.setKey1(rs.getString("key1"));
		person.setActive(rs.getString("active"));
		person.setCardNo(rs.getString("card_no"));
		person.setCreatedBy(rs.getString("created_by"));
		java.sql.Date cd = rs.getDate("created_date");
		person.setCreatedDate(new java.util.Date(cd.getTime()));
		person.setLastUpdatedBy(rs.getString("last_update_by"));
		java.sql.Date lud = rs.getDate("last_upadted_date");
		person.setLastUpdatedDate(new java.util.Date(lud.getTime()));
	 listperson.add(person);
	 }
	 } catch (SQLException sq) {
	 System.out.println("Unable to find the record." + sq);
	 } finally {
	 pool.putConnection(conn);
	 }
	 return listperson;
	 }

	public static void main(String args[]) {

		java.util.Date lastmodified = DateUtils.convertDate("3-3-2003 11:1:15");

		// Person bb = new
		// Person(1,2,3,4,"abc","abc","abc","abc",lastmodified,3);
		// MaterialsDao personDao = new MaterialsDao();
		// personDao.create(bb);

		// Person bb = new
		// Person(1,2,3,4,5,"abc","abc","abc","abc",lastmodified,3);
		// MaterialsDao person = new MaterialsDao();
		// person.edit(bb);

		// PersonDao cd = new PersonDao();
		// cd.remove(1);

		// MaterialsDao cd = new MaterialsDao();
		// Person person = cd.find(1);
		// System.out.println(person);

		// MaterialsDao cd = new MaterialsDao();
		// ArrayList<Person> al = cd.findAll();
		// for (Person person : al) {
		// System.out.println(person);
		// }

	}

	
	
}
