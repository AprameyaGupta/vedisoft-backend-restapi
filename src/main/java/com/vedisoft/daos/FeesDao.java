package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.Fees;
import com.vedisoft.utilities.ConnectionPool;
import com.vedisoft.utilities.DateUtils;

public class FeesDao {
	public static void create(Fees fees) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into fees (batch_id, famt, due_date, mode1, branch_id, created_by, creation_date, last_updated_by, last_updation_date, extra1, extra2) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, fees.getBatchId());
			ps.setFloat(2, fees.getFamt());
			java.sql.Date dt1 = new Date(fees.getDueDate().getTime());
			ps.setDate(3, dt1);
			ps.setString(4, fees.getMode1());
			ps.setInt(5, fees.getBranchId());
			ps.setString(6, fees.getCreatedBy());
			java.sql.Date dt2 = new Date(fees.getCreationDate().getTime());
			ps.setDate(7, dt2);
			ps.setString(8, fees.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(fees.getLastUpdationDate().getTime());
			ps.setDate(9, dt3);
			ps.setString(10, fees.getExtra1());
			ps.setInt(11, fees.getExtra2());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static void edit(Fees fees) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update fees set batch_id = ?, famt = ?, due_date = ?, mode1 = ?, branch_id = ?, created_by = ?, creation_date = ?, last_updated_by = ?, last_updation_date = ?, extra1 = ?, extra2 = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, fees.getBatchId());
			ps.setFloat(2, fees.getFamt());
			java.sql.Date dt1 = new Date(fees.getDueDate().getTime());
			ps.setDate(3, dt1);
			ps.setString(4, fees.getMode1());
			ps.setInt(5, fees.getBranchId());
			ps.setString(6, fees.getCreatedBy());
			java.sql.Date dt2 = new Date(fees.getCreationDate().getTime());
			ps.setDate(7, dt2);
			ps.setString(8, fees.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(fees.getLastUpdationDate().getTime());
			ps.setDate(9, dt3);
			ps.setString(10, fees.getExtra1());
			ps.setInt(11, fees.getExtra2());
			ps.setInt(12, fees.getId());
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
			String sql = "delete from fees where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static Fees find(int id) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Fees fees = new Fees();
		try {
			String sql = "select * from fees where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				fees.setId(id);
				fees.setBatchId(rs.getInt("batch_id"));
				fees.setFamt(rs.getFloat("famt"));
				java.sql.Date dt1 = rs.getDate("due_date");
				fees.setDueDate(new java.util.Date(dt1.getTime()));
				fees.setMode1(rs.getString("mode1"));
				fees.setBranchId(rs.getInt("branch_id"));
				fees.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt2 = rs.getDate("creation_date");
				fees.setCreationDate(new java.util.Date(dt2.getTime()));
				fees.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date dt3 = rs.getDate("last_updation_date");
				fees.setLastUpdationDate(new java.util.Date(dt3.getTime()));
				fees.setExtra1(rs.getString("extra1"));
				fees.setExtra2(rs.getInt("extra2"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return fees;
	}
	
	public static ArrayList<Fees> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Fees> listFees = new ArrayList<Fees>();
		try {
			String sql = "select * from fees";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Fees fees = new Fees();
				fees.setId(rs.getInt("id"));
				fees.setBatchId(rs.getInt("batch_id"));
				fees.setFamt(rs.getFloat("famt"));
				java.sql.Date dt1 = rs.getDate("due_date");
				fees.setDueDate(new java.util.Date(dt1.getTime()));
				fees.setMode1(rs.getString("mode1"));
				fees.setBranchId(rs.getInt("branch_id"));
				fees.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt2 = rs.getDate("creation_date");
				fees.setCreationDate(new java.util.Date(dt2.getTime()));
				fees.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date dt3 = rs.getDate("last_updation_date");
				fees.setLastUpdationDate(new java.util.Date(dt3.getTime()));
				fees.setExtra1(rs.getString("extra1"));
				fees.setExtra2(rs.getInt("extra2"));
				
				listFees.add(fees);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the rows." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listFees;
	}

	public static void main(String[] args) {
		java.util.Date dt1 = DateUtils.convertDate("10-1-2018 10:10:15");
		java.util.Date dt2 = DateUtils.convertDate("10-1-2018 10:10:15");
		java.util.Date dt3 = DateUtils.convertDate("15-6-2018 10:10:15");
		
		Fees fees = new Fees(1, 5000f, dt1, "cash", 2, "Aprameya", dt2, "Aprameya", dt3, "active", 4);
		FeesDao feesDao = new FeesDao();
		feesDao.create(fees);
		
//		 Fees fees = new Fees(22, 1, 5000f, dt1, "cash", 2, "Aprameya", dt2, "Aprameya", dt3, "active", 4);
//		 FeesDao feesDao = new FeesDao();
//		 feesDao.edit(fees);

//		 FeesDao feesDao = new FeesDao();
//		 feesDao.remove(5);

//		 FeesDao feesDao = new FeesDao();
//		 Fees fees = feesDao.find(3);
//		 System.out.println(fees);

//		 FeesDao feesDao = new FeesDao();
//		 ArrayList<Fees> al = feesDao.findAll();
//		 for (Fees fees : al)
//		 System.out.println(fees);
	}

}
