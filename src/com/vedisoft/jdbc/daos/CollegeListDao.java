package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.CollegeList;
import com.vedisoft.utilities.ConnectionPool;

public class CollegeListDao {
	public static void create(CollegeList collegeList) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into college_list (name, prefix, city) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, collegeList.getName());
			ps.setString(2, collegeList.getPrefix());
			ps.setString(3, collegeList.getCity());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static void edit(CollegeList collegeList) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update college_list set name = ?, prefix = ?, city = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, collegeList.getName());
			ps.setString(2, collegeList.getPrefix());
			ps.setString(3, collegeList.getCity());
			ps.setInt(4, collegeList.getId());
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
			String sql = "delete from college_list where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static CollegeList find(int id) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		CollegeList collegeList = new CollegeList();
		try {
			String sql = "select * from college_list where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				collegeList.setId(id);
				collegeList.setName(rs.getString("name"));
				collegeList.setPrefix(rs.getString("prefix"));
				collegeList.setCity(rs.getString("city"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return collegeList;
	}
	
	public static ArrayList<CollegeList> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<CollegeList> listCollegeList = new ArrayList<CollegeList>();
		try {
			String sql = "select * from college_list";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CollegeList collegeList = new CollegeList();
				collegeList.setId(rs.getInt("id"));
				collegeList.setName(rs.getString("name"));
				collegeList.setPrefix(rs.getString("prefix"));
				collegeList.setCity(rs.getString("city"));
				
				listCollegeList.add(collegeList);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listCollegeList;
	}

	public static void main(String[] args) {
//		CollegeList collegeList = new CollegeList("University Institute of Technology RGPV", "UIT", "Bhopal");
//		CollegeListDao collegeListDao = new CollegeListDao();
//		collegeListDao.create(collegeList);
		
//		 CollegeList collegeList = new CollegeList(90, "University Institute of Technology RGPV", "UIT-RGPV", "Bhopal");
//		 CollegeListDao collegeListDao = new CollegeListDao();
//		 collegeListDao.edit(collegeList);

//		 CollegeListDao collegeListDao = new CollegeListDao();
//		 collegeListDao.remove(92);

//		 CollegeListDao collegeListDao = new CollegeListDao();
//		 CollegeList collegeList = collegeListDao.find(90);
//		 System.out.println(collegeList);

//		 CollegeListDao collegeListDao = new CollegeListDao();
//		 ArrayList<CollegeList> al = collegeListDao.findAll();
//		 for (CollegeList collegeList : al)
//		 System.out.println(collegeList);

	}

}
