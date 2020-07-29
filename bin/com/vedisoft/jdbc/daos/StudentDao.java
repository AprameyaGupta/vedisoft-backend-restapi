package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.Student;
import com.vedisoft.utilities.ConnectionPool;
import com.vedisoft.utilities.DateUtils;

public class StudentDao {

	public static int create(Student student) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		int id = 0;
		try {
			String sql = "insert into student (registration_date,name ,course,sem,laddress,paddress,flag,dob,mno,pno,email,campus,doj,package1,enquiry_id,branch,college_id,password,branch_id,card_no,created_by,creation_date,last_updated_by,last_updation_date,reg_id,company,extra3"
					+ ") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);
			java.sql.Date registrationdate = new java.sql.Date(student.getRegistrationDate().getTime());
			ps.setDate(1, registrationdate);
			ps.setString(2, student.getName());
			ps.setString(3, student.getCourse());
			ps.setString(4, student.getSem());
			ps.setString(5, student.getLaddress());
			ps.setString(6, student.getPaddress());
			ps.setString(7, student.getFlag());
			java.sql.Date dob = new java.sql.Date(student.getDob().getTime());
			ps.setDate(8, dob);
			ps.setString(9, student.getMno());
			ps.setString(10, student.getPno());
			ps.setString(11, student.getEmail());
			ps.setString(12, student.getCampus());
			java.sql.Date doj = new java.sql.Date(student.getDoj().getTime());
			ps.setDate(13, doj);
			ps.setString(14, student.getPackage1());
			ps.setInt(15, student.getEnquiryId());
			ps.setString(16, student.getBranch());
			ps.setInt(17, student.getCollegeId());
			ps.setString(18, student.getPassword());
			ps.setInt(19, student.getBranchId());
			ps.setInt(20, student.getCardNo());
			ps.setString(21, student.getCreatedBy());
			ps.setString(22, student.getLastUpdatedBy());
			java.sql.Date lud = new java.sql.Date(student.getLastUpdationDate().getTime());
			ps.setDate(23, lud);
			ps.setString(24, student.getRegId());
			ps.setString(25, student.getCompany());
			ps.setString(26, student.getExtra3());

		} catch (

		SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return id;

	}

	public static boolean edit(Student student) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		boolean rslt = true;
		try {
			String sql = "update student set registration_date=?,name=?,course=?,sem=?,laddress=?,paddress=?,flag=?,dob=?,mno=?,pno=?,email=?,campus=?,doj=?,package1=?,enquiry_id=?,branch=?,college_id=?,password=?,branch_id=?,card_no=?,created_by=?,creation_date=?,last_updated_by=?,last_updation_date=?,reg_id=?,company=?,extra3=? where registrationId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			java.sql.Date registrationdate = new java.sql.Date(student.getRegistrationDate().getTime());
			ps.setDate(1, registrationdate);
			ps.setString(2, student.getName());
			ps.setString(3, student.getCourse());
			ps.setString(4, student.getSem());
			ps.setString(5, student.getLaddress());
			ps.setString(6, student.getPaddress());
			ps.setString(7, student.getFlag());
			java.sql.Date dob = new java.sql.Date(student.getDob().getTime());
			ps.setDate(8, dob);
			ps.setString(9, student.getMno());
			ps.setString(10, student.getPno());
			ps.setString(11, student.getEmail());
			ps.setString(12, student.getCampus());
			java.sql.Date doj = new java.sql.Date(student.getDoj().getTime());
			ps.setDate(13, doj);
			ps.setString(14, student.getPackage1());
			ps.setInt(15, student.getEnquiryId());
			ps.setString(16, student.getBranch());
			ps.setInt(17, student.getCollegeId());
			ps.setString(18, student.getPassword());
			ps.setInt(19, student.getBranchId());
			ps.setInt(20, student.getCardNo());
			ps.setString(21, student.getCreatedBy());
			ps.setString(22, student.getLastUpdatedBy());
			java.sql.Date lud = new java.sql.Date(student.getLastUpdationDate().getTime());
			ps.setDate(23, lud);
			ps.setString(24, student.getRegId());
			ps.setString(25, student.getCompany());
			ps.setString(26, student.getExtra3());
			ps.setInt(27, student.getRegistrationId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			rslt = false;
		} finally {
			pool.putConnection(conn);
		}
		return rslt;
	}

	public static boolean remove(int registrationId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		boolean rslt = true;
		try {
			String sql = "delete from student where registration_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, registrationId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			rslt = false;
		} finally {
			pool.putConnection(conn);
		}
		return rslt;
	}

	public static Student find(int registrationId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Student student = new Student();
		try {
			String sql = "select * from student where registrationId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, registrationId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				student.setRegistrationId(registrationId);
				java.sql.Date registrationdate = rs.getDate("RegistrationDate");
				student.setRegistrationDate(new java.util.Date(registrationdate.getTime()));
				student.setName(rs.getString("name"));
				student.setCourse(rs.getString("course"));
				student.setSem(rs.getString("sem"));
				student.setLaddress(rs.getString("laddress"));
				student.setPaddress(rs.getString("paddress"));
				student.setLaddress(rs.getString("flag"));
				java.sql.Date dob = rs.getDate("Dob");
				student.setRegistrationDate(new java.util.Date(dob.getTime()));
				student.setMno(rs.getString("mno"));
				student.setPno(rs.getString("pno"));
				student.setEmail(rs.getString("Email"));
				student.setCampus(rs.getString("campus"));
				java.sql.Date doj = rs.getDate("Doj");
				student.setRegistrationDate(new java.util.Date(doj.getTime()));
				student.setPackage1(rs.getString("package1"));
				student.setEnquiryId(rs.getInt("enquiryId"));
				student.setBranch(rs.getString("branch"));
				student.setCollegeId(rs.getInt("collegeId"));
				student.setPassword(rs.getString("passowrd"));
				student.setBranchId(rs.getInt("branchId"));
				student.setCardNo(rs.getInt("cardNo"));
				student.setCreatedBy(rs.getString("createdby"));
				student.setLastUpdatedBy(rs.getString("lastUpdatedBy"));

				java.sql.Date ludate = rs.getDate("lastUpdationDate");
				student.setLastUpdationDate(new java.util.Date(ludate.getTime()));
				student.setRegId(rs.getString("regId"));
				student.setCompany(rs.getString("company"));
				student.setExtra3(rs.getString("extra3"));
				
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return student;
	}

	 public static ArrayList<Student> findAll() {
	 ConnectionPool pool = ConnectionPool.getInstance();
	 pool.initialize();
	 Connection conn = pool.getConnection();
	 ArrayList<Student> liststudent = new ArrayList<Student>();
	 try {
	 String sql = "select * from student";
	 PreparedStatement ps = conn.prepareStatement(sql);
	 ResultSet rs = ps.executeQuery();
	 while (rs.next()) {
	 Student student = new Student();
		java.sql.Date registrationdate = rs.getDate("RegistrationDate");
		student.setRegistrationDate(new java.util.Date(registrationdate.getTime()));
		student.setName(rs.getString("name"));
		student.setCourse(rs.getString("course"));
		student.setSem(rs.getString("sem"));
		student.setLaddress(rs.getString("laddress"));
		student.setPaddress(rs.getString("paddress"));
		student.setLaddress(rs.getString("flag"));
		java.sql.Date dob = rs.getDate("Dob");
		student.setRegistrationDate(new java.util.Date(dob.getTime()));
		student.setMno(rs.getString("mno"));
		student.setPno(rs.getString("pno"));
		student.setEmail(rs.getString("Email"));
		student.setCampus(rs.getString("campus"));
		java.sql.Date doj = rs.getDate("Doj");
		student.setRegistrationDate(new java.util.Date(doj.getTime()));
		student.setPackage1(rs.getString("package1"));
		student.setEnquiryId(rs.getInt("enquiryId"));
		student.setBranch(rs.getString("branch"));
		student.setCollegeId(rs.getInt("collegeId"));
		student.setPassword(rs.getString("passowrd"));
		student.setBranchId(rs.getInt("branchId"));
		student.setCardNo(rs.getInt("cardNo"));
		student.setCreatedBy(rs.getString("createdby"));
		student.setLastUpdatedBy(rs.getString("lastUpdatedBy"));

		java.sql.Date ludate = rs.getDate("lastUpdationDate");
		student.setLastUpdationDate(new java.util.Date(ludate.getTime()));
		student.setRegId(rs.getString("regId"));
		student.setCompany(rs.getString("company"));
		student.setExtra3(rs.getString("extra3"));
	 liststudent.add(student);
	 }
	 } catch (SQLException sq) {
	 System.out.println("unable to find the record." + sq);
	 } finally {
	 pool.putConnection(conn);
	 }
	 return liststudent;
	 }

	public static void main(String args[]) {

		java.util.Date lastmodified = DateUtils.convertDate("3-3-2003 11:1:15");

		// Student bb = new
		// Student(1,2,3,4,"abc","abc","abc","abc",lastmodified,3);
		// MaterialsDao studentDao = new MaterialsDao();
		// studentDao.create(bb);

		// Student bb = new
		// Student(1,2,3,4,5,"abc","abc","abc","abc",lastmodified,3);
		// MaterialsDao student = new MaterialsDao();
		// student.edit(bb);

		// StudentDao cd = new StudentDao();
		// cd.remove(1);

		// MaterialsDao cd = new MaterialsDao();
		// Student student = cd.find(1);
		// System.out.println(student);

		// MaterialsDao cd = new MaterialsDao();
		// ArrayList<Student> al = cd.findAll();
		// for (Student student : al) {
		// System.out.println(student);
		// }

	}
}
