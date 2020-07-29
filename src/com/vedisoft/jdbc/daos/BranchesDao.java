package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.Branches;
import com.vedisoft.utilities.ConnectionPool;
import com.vedisoft.utilities.DateUtils;

public class BranchesDao {
	public static void create(Branches branches) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into branches (branch_name, branch_prefix, plot_no, locality, street, city, state, branch_manager_id, branch_contact_no, multiple_courses, estb_date, created_by, creation_date, last_updated_by, last_updation_date, extra1, extra2) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, branches.getBranchName());
			ps.setString(2, branches.getBranchPrefix());
			ps.setString(3, branches.getPlotNo());
			ps.setString(4, branches.getLocality());
			ps.setString(5, branches.getStreet());
			ps.setString(6, branches.getCity());
			ps.setString(7, branches.getState());
			ps.setInt(8, branches.getBranchManagerId());
			ps.setString(9, branches.getBranchContactNo());
			ps.setString(10, branches.getMultipleCourses());
			java.sql.Date dt1 = new Date(branches.getEstbDate().getTime());
			ps.setDate(11, dt1);
			ps.setString(12, branches.getCreatedBy());
			java.sql.Date dt2 = new Date(branches.getCreationDate().getTime());
			ps.setDate(13, dt2);
			ps.setString(14, branches.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(branches.getLastUpdationDate().getTime());
			ps.setDate(15, dt3);
			ps.setString(16, branches.getExtra1());
			ps.setInt(17, branches.getExtra2());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static void edit(Branches branches) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update branches set branch_name = ?, branch_prefix = ?, plot_no = ?, locality = ?, street = ?, city = ?, state = ?, branch_manager_id = ?, branch_contact_no = ?, multiple_courses = ?, estb_date = ?, created_by = ?, creation_date = ?, last_updated_by = ?, last_updation_date = ?, extra1 = ?, extra2 = ? where branch_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, branches.getBranchName());
			ps.setString(2, branches.getBranchPrefix());
			ps.setString(3, branches.getPlotNo());
			ps.setString(4, branches.getLocality());
			ps.setString(5, branches.getStreet());
			ps.setString(6, branches.getCity());
			ps.setString(7, branches.getState());
			ps.setInt(8, branches.getBranchManagerId());
			ps.setString(9, branches.getBranchContactNo());
			ps.setString(10, branches.getMultipleCourses());
			java.sql.Date dt1 = new Date(branches.getEstbDate().getTime());
			ps.setDate(11, dt1);
			ps.setString(12, branches.getCreatedBy());
			java.sql.Date dt2 = new Date(branches.getCreationDate().getTime());
			ps.setDate(13, dt2);
			ps.setString(14, branches.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(branches.getLastUpdationDate().getTime());
			ps.setDate(15, dt3);
			ps.setString(16, branches.getExtra1());
			ps.setInt(17, branches.getExtra2());
			ps.setInt(18, branches.getBranchId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static void remove(int branchId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from branches where branch_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, branchId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static Branches find(int branchId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Branches branches = new Branches();
		try {
			String sql = "select * from branches where branch_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, branchId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				branches.setBranchId(branchId);
				branches.setBranchName(rs.getString("branch_name"));
				branches.setBranchPrefix(rs.getString("branch_prefix"));
				branches.setPlotNo(rs.getString("plot_no"));
				branches.setLocality(rs.getString("locality"));
				branches.setStreet(rs.getString("street"));
				branches.setCity(rs.getString("city"));
				branches.setState(rs.getString("state"));
				branches.setBranchManagerId(rs.getInt("branch_manager_id"));
				branches.setBranchContactNo(rs.getString("branch_contact_no"));
				branches.setMultipleCourses(rs.getString("multiple_courses"));
				java.sql.Date dt1 = rs.getDate("estb_date");
				branches.setEstbDate(new java.util.Date(dt1.getTime()));
				branches.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt2 = rs.getDate("creation_date");
				branches.setCreationDate(new java.util.Date(dt2.getTime()));
				branches.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date dt3 = rs.getDate("last_updation_date");
				branches.setLastUpdationDate(new java.util.Date(dt3.getTime()));
				branches.setExtra1(rs.getString("extra1"));
				branches.setExtra2(rs.getInt("extr2"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return branches;
	}

	public static ArrayList<Branches> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Branches> listBranches = new ArrayList<Branches>();
		try {
			String sql = "select * from branches";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Branches branches = new Branches();
				branches.setBranchId(rs.getInt("branch_id"));
				branches.setBranchName(rs.getString("branch_name"));
				branches.setBranchPrefix(rs.getString("branch_prefix"));
				branches.setPlotNo(rs.getString("plot_no"));
				branches.setLocality(rs.getString("locality"));
				branches.setStreet(rs.getString("street"));
				branches.setCity(rs.getString("city"));
				branches.setState(rs.getString("state"));
				branches.setBranchManagerId(rs.getInt("branch_manager_id"));
				branches.setBranchContactNo(rs.getString("branch_contact_no"));
				branches.setMultipleCourses(rs.getString("multiple_courses"));
				java.sql.Date dt1 = rs.getDate("estb_date");
				branches.setEstbDate(new java.util.Date(dt1.getTime()));
				branches.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt2 = rs.getDate("creation_date");
				branches.setCreationDate(new java.util.Date(dt2.getTime()));
				branches.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date dt3 = rs.getDate("last_updation_date");
				branches.setLastUpdationDate(new java.util.Date(dt3.getTime()));
				branches.setExtra1(rs.getString("extra1"));
				branches.setExtra2(rs.getInt("extra2"));
				
				listBranches.add(branches);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find rows." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listBranches;
	}
	
	public static void main(String[] args) {
		java.util.Date dt1 = DateUtils.convertDate("10-1-2018 10:10:15");
		java.util.Date dt2 = DateUtils.convertDate("10-1-2018 10:10:15");
		java.util.Date dt3 = DateUtils.convertDate("15-6-2018 10:10:15");
		
		Branches branch = new Branches("indrapuri", "2", "3","Bima Kunj", "Kolar Rd","Bhopal", "MP", 23, "7011200229", "nil", dt1, "Aprameya", dt2, "Aprameya", dt3, "active", 4);
		BranchesDao branchDao = new BranchesDao();
		branchDao.create(branch);
		
//		 Branches branch = new Branches(4, "mp nagar", "2", "3","pragati petrol pump", "jail road","Bhopal", "MP", 23, "7011200229", "nil", dt1, "Aprameya", dt2, "Aprameya", dt3, "active", 4);
//		 BranchesDao branchDao = new BranchesDao();
//		 branchDao.edit(branch);

//		 BranchesDao branchDao = new BranchesDao();
//		 branchDao.remove(5);

//		 BranchesDao branchDao = new BranchesDao();
//		 Branches branch = branchDao.find(3);
//		 System.out.println(branch);

//		 BranchesDao branchDao = new BranchesDao();
//		 ArrayList<Branches> al = branchDao.findAll();
//		 for (Branches branch : al)
//		 System.out.println(branch);
	}

}
