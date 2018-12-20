package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.Batch;
import com.vedisoft.utilities.ConnectionPool;

public class BatchDao {
	public void create(Batch batch) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into batch (code, faculty_id, course_id, timings, sdate, days, enddate, session_id, created_by, creation_date, last_updated_by, last_updation_date, status, branch_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, batch.getCode());
			ps.setInt(2, batch.getFacultyId());
			ps.setInt(3, batch.getCourseId());
			ps.setString(4, batch.getTimings());
			java.sql.Date dt1 = new Date(batch.getSdate().getTime());
			ps.setDate(5, dt1);
			ps.setString(6, batch.getDays());
			ps.setString(7, batch.getEnddate());
			ps.setInt(8, batch.getSessionId());
			ps.setString(9, batch.getCreatedBy());
			java.sql.Date dt2 = new Date(batch.getCreationDate().getTime());
			ps.setDate(10, dt2);
			ps.setString(11, batch.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(batch.getLastUpdationDate().getTime());
			ps.setDate(12, dt3);
			ps.setString(13, batch.getStatus());
			ps.setInt(14, batch.getBranchId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public void edit(Batch batch) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update batch set code = ?, faculty_id = ?, course_id = ?, timings = ?, sdate = ?, days = ?, enddate = ?, session_id = ?, created_by = ?, creation_date = ?, last_updated_by = ?, last_updation_date = ?, status = ?, branch_id = ? where batch_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, batch.getCode());
			ps.setInt(2, batch.getFacultyId());
			ps.setInt(3, batch.getCourseId());
			ps.setString(4, batch.getTimings());
			java.sql.Date dt1 = new Date(batch.getSdate().getTime());
			ps.setDate(5, dt1);
			ps.setString(6, batch.getDays());
			ps.setString(7, batch.getEnddate());
			ps.setInt(8, batch.getSessionId());
			ps.setString(9, batch.getCreatedBy());
			java.sql.Date dt2 = new Date(batch.getCreationDate().getTime());
			ps.setDate(10, dt2);
			ps.setString(11, batch.getLastUpdatedBy());
			java.sql.Date dt3 = new Date(batch.getLastUpdationDate().getTime());
			ps.setDate(12, dt3);
			ps.setString(13, batch.getStatus());
			ps.setInt(14, batch.getBranchId());
			ps.setInt(15, batch.getBatchId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public void remove(int batchId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from batch where batch_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, batchId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public Batch find(int batchId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Batch batch = new Batch();
		try {
			String sql = "select * from batch where batch_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, batchId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				batch.setBatchId(batchId);
				batch.setCode(rs.getString("code"));
				batch.setFacultyId(rs.getInt("faculty_id"));
				batch.setCourseId(rs.getInt("course_id"));
				batch.setTimings(rs.getString("timings"));
				java.sql.Date dt1 = rs.getDate("sdate");
				batch.setSdate(new java.util.Date(dt1.getTime()));
				batch.setDays(rs.getString("days"));
				batch.setEnddate(rs.getString("enddate"));
				batch.setSessionId(rs.getInt("session_id"));
				batch.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt2 = rs.getDate("creation_date");
				batch.setCreationDate(new java.util.Date(dt2.getTime()));
				batch.setLastUpdatedBy(rs.getString("last_updated_by"));
				java.sql.Date dt3 = rs.getDate("last_updation_date");
				batch.setLastUpdationDate(new java.util.Date(dt3.getTime()));
				batch.setStatus(rs.getString("status"));
				batch.setBranchId(rs.getInt("branch_id"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return batch;
	}
	
	public ArrayList<Batch> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Batch> listBatch = new ArrayList<Batch>();
		try {
			String sql = "select * from batch";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Batch batch = new Batch();
				batch.setBatchId(rs.getInt("batch_id"));
				batch.setCode(rs.getString("code"));
				batch.setFacultyId(rs.getInt("faculty_id"));
				batch.setCourseId(rs.getInt("course_id"));
				batch.setTimings(rs.getString("timings"));
				java.sql.Date dt1 = rs.getDate("sdate");
				batch.setSdate(new java.util.Date(dt1.getTime()));
				batch.setDays(rs.getString("days"));
				batch.setEnddate(rs.getString("enddate"));
				batch.setSessionId(rs.getInt("session_id"));
				
				listBatch.add(batch);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listBatch;
	}
	
	public static void main(String args[]) {
		
	}
	
}
