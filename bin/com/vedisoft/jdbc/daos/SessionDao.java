package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.Session;
import com.vedisoft.utilities.ConnectionPool;
import com.vedisoft.utilities.DateUtils;

public class SessionDao {

	public static void create(Session session) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();

		try {
			String sql = "insert into session (session_name, Start_date, end_date, created_by, creation_date, last_update_by, last_update_date, extra) values(?,?,?,?,?,?,?,?,)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, session.getSessionName());

			java.sql.Date dt1 = new Date(session.getStartDate().getTime());
			ps.setDate(2, dt1);

			java.sql.Date dt2 = new Date(session.getEndDate().getTime());
			ps.setDate(3, dt2);

			ps.setString(4, session.getCreatedBy());

			java.sql.Date dt3 = new Date(session.getCreationDate().getTime());
			ps.setDate(5, dt3);

			ps.setString(6, session.getLastUpdatedBy());

			java.sql.Date dt4 = new Date(session.getLastUpdationDate().getTime());
			ps.setDate(7, dt4);

			ps.setString(8, session.getExtra());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}

	public static void edit(Session session) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update session set session_name=?, Start_date=?, end_date=?, created_by=?, creation_date=?, last_update_by=?, last_update_date=?, extra=? where session_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, session.getSessionName());

			java.sql.Date dt1 = new Date(session.getStartDate().getTime());
			ps.setDate(2, dt1);

			java.sql.Date dt2 = new Date(session.getEndDate().getTime());
			ps.setDate(3, dt2);

			ps.setString(4, session.getCreatedBy());

			java.sql.Date dt3 = new Date(session.getCreationDate().getTime());
			ps.setDate(5, dt3);

			ps.setString(6, session.getLastUpdatedBy());

			java.sql.Date dt4 = new Date(session.getLastUpdationDate().getTime());
			ps.setDate(7, dt4);

			ps.setString(8, session.getExtra());
			ps.setInt(9, session.getSessionId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit the row");
		} finally {
			pool.putConnection(conn);
		}
	}

	public static void remove(int sessionId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from session where session_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sessionId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	}

	public static Session find(int sessionId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Session session = new Session();
		try {
			String sql = "select * from session where session_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sessionId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				session.setSessionId(sessionId);
				session.setSessionName(rs.getString("session_name"));
				java.sql.Date dt1 = rs.getDate("start_date");
				session.setStartDate(new java.util.Date(dt1.getTime()));
				java.sql.Date dt2 = rs.getDate("end_date");
				session.setEndDate(new java.util.Date(dt2.getTime()));
				session.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt3 = rs.getDate("creation_date");
				session.setCreationDate(new java.util.Date(dt3.getTime()));
				session.setLastUpdatedBy(rs.getString("last_created_by"));
				java.sql.Date dt4 = rs.getDate("last_update_date");
				session.setLastUpdationDate(new java.util.Date(dt1.getTime()));
				session.setExtra(rs.getString("extra"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return session;
	}

	public static ArrayList<Session> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Session> listSession = new ArrayList<Session>();
		try {
			String sql = "select * from session";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Session session = new Session();
				session.setSessionId(rs.getInt("session_id"));
				session.setSessionName(rs.getString("session_name"));
				java.sql.Date dt1 = rs.getDate("start_date");
				session.setStartDate(new java.util.Date(dt1.getTime()));
				java.sql.Date dt2 = rs.getDate("end_date");
				session.setEndDate(new java.util.Date(dt2.getTime()));
				session.setCreatedBy(rs.getString("created_by"));
				java.sql.Date dt3 = rs.getDate("creation_date");
				session.setCreationDate(new java.util.Date(dt3.getTime()));
				session.setLastUpdatedBy(rs.getString("last_created_by"));
				java.sql.Date dt4 = rs.getDate("last_update_date");
				session.setLastUpdationDate(new java.util.Date(dt1.getTime()));
				session.setExtra(rs.getString("extra"));
				listSession.add(session);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listSession;
	}

	public static void main(String args[]) {
		java.util.Date dt = DateUtils.convertDate("28-05-2018");

		// Session session = new Session("ram", dt, dt, "raj", dt, "Ronnie", dt,
		// "aaaa");
		// SessionDao appDao = new SessionDao();
		// appDao.create(session);

		// Session session = new Session(1);
		// SessionDao app1 = new SessionDao();
		// System.out.println(app1.find(60));

		// SessionDao cd = new SessionDao();
		// ArrayList<Session> al = cd.findAll();
		// for (Session session : al) {
		// System.out.println(session);
		// }
	}

}
