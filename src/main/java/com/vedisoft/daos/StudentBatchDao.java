package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.StudentBatch;
import com.vedisoft.utilities.ConnectionPool;
import com.vedisoft.utilities.DateUtils;

public class StudentBatchDao {

	public static void create(StudentBatch studentbatch) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();

		try {
			String sql = "insert into studentbatch (student_id,batch_id,flag,created_by,created_date,last_updated_by,last_updated_date,joined,certificate) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, studentbatch.getStudentId());
			ps.setInt(2, studentbatch.getBatchId());
			ps.setString(3, studentbatch.getFlag());
			ps.setString(4, studentbatch.getCreatedBy());

			java.sql.Date dt1 = new Date(studentbatch.getCreatedDate().getTime());
			ps.setDate(5, dt1);
			ps.setString(6, studentbatch.getLastUpdatedBy());
			java.sql.Date dt2 = new Date(studentbatch.getLastUpdatedDate().getTime());
			ps.setDate(7, dt2);

			ps.setString(8, studentbatch.getJoined());
			ps.setString(9, studentbatch.getCertificate());

			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}

	public static void edit(StudentBatch studentbatch) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update studentbatch set student_id=? ,batch_id=? ,flag=? ,created_by=? ,created_date=? ,last_updated_by=? ,last_updated_date=? ,joined=? ,certificate=? where sb_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, studentbatch.getStudentId());
			ps.setInt(2, studentbatch.getBatchId());
			ps.setString(3, studentbatch.getFlag());
			ps.setString(4, studentbatch.getCreatedBy());
			java.sql.Date dt1 = new Date(studentbatch.getCreatedDate().getTime());
			ps.setDate(5, dt1);
			ps.setString(6, studentbatch.getLastUpdatedBy());
			java.sql.Date dt2 = new Date(studentbatch.getLastUpdatedDate().getTime());
			ps.setDate(7, dt2);
			ps.setString(8, studentbatch.getJoined());
			ps.setString(9, studentbatch.getCertificate());
			ps.setInt(10, studentbatch.getSbId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit the row");
		} finally {
			pool.putConnection(conn);
		}
	}

	public static void remove(int studentbatchId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from studentbatch where studentbatch_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, studentbatchId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	}

	public static StudentBatch find(int sbId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		StudentBatch studentbatch = new StudentBatch();
		try {
			String sql = "select * from studentbatch where sb_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sbId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				studentbatch.setSbId(sbId);
				studentbatch.setStudentId(rs.getString("student_id"));
				studentbatch.setBatchId(rs.getInt("batch_id"));
				studentbatch.setFlag(rs.getString("flag_id"));
				studentbatch.setCreatedBy(rs.getString("created_by"));			
				java.sql.Date dt1 = rs.getDate("created_date");
				studentbatch.setCreatedDate(new java.util.Date(dt1.getTime()));
				studentbatch.setLastUpdatedBy(rs.getString("last_update_by"));
				java.sql.Date dt2 = rs.getDate("last_update_date");
				studentbatch.setLastUpdatedDate(new java.util.Date(dt2.getTime()));
				studentbatch.setJoined(rs.getString("joined"));
				studentbatch.setCertificate(rs.getString("certificate"));

			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return studentbatch;
	}

	public static ArrayList<StudentBatch> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<StudentBatch> listStudentBatch = new ArrayList<StudentBatch>();
		try {
			String sql = "select * from studentbatch";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentBatch studentbatch = new StudentBatch();
				studentbatch.setSbId(rs.getInt("sb_id"));
				studentbatch.setStudentId(rs.getString("student_id"));
				studentbatch.setBatchId(rs.getInt("batch_id"));
				studentbatch.setFlag(rs.getString("flag_id"));
				studentbatch.setCreatedBy(rs.getString("created_by"));			
				java.sql.Date dt1 = rs.getDate("created_date");
				studentbatch.setCreatedDate(new java.util.Date(dt1.getTime()));
				studentbatch.setLastUpdatedBy(rs.getString("last_update_by"));
				java.sql.Date dt2 = rs.getDate("last_update_date");
				studentbatch.setLastUpdatedDate(new java.util.Date(dt2.getTime()));
				studentbatch.setJoined(rs.getString("joined"));
				studentbatch.setCertificate(rs.getString("certificate"));
				listStudentBatch.add(studentbatch);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listStudentBatch;
	}

	public static void main(String args[]) {
		java.util.Date dt = DateUtils.convertDate("28-05-2018");

		// StudentBatch studentbatch = new StudentBatch("ram", dt, dt, "raj", dt,
		// "Ronnie", dt,
		// "aaaa");
		// StudentBatchDao appDao = new StudentBatchDao();
		// appDao.create(studentbatch);

		// StudentBatch studentbatch = new StudentBatch(1);
		// StudentBatchDao app1 = new StudentBatchDao();
		// System.out.println(app1.find(60));

		// StudentBatchDao cd = new StudentBatchDao();
		// ArrayList<StudentBatch> al = cd.findAll();
		// for (StudentBatch studentbatch : al) {
		// System.out.println(studentbatch);
		// }
	}

}
