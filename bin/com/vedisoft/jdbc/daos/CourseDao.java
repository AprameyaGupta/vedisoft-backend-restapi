package com.vedisoft.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vedisoft.pojos.Course;
import com.vedisoft.utilities.ConnectionPool;

public class CourseDao {
	public static void create(Course course) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into course (name, prefix, centi_title, duration) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, course.getName());
			ps.setString(2, course.getPrefix());
			ps.setString(3, course.getCentiTitle());
			ps.setInt(4, course.getDuration());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row");
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public static void edit(Course course) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update course set name = ?, prefix = ?, centi_title = ?, duration = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, course.getName());
			ps.setString(2, course.getPrefix());
			ps.setString(3, course.getCentiTitle());
			ps.setInt(4, course.getDuration());
			ps.setInt(5, course.getId());
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
			String sql = "delete from course where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete the row");
		} finally {
			pool.putConnection(conn);
		}
	} 

	public static Course find(int id) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Course course = new Course();
		try {
			String sql = "select * from course where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				course.setId(id);
				course.setName(rs.getString("name"));
				course.setPrefix(rs.getString("prefix"));
				course.setCentiTitle(rs.getString("centi_title"));
				course.setDuration(rs.getInt("duration"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return course;
	}
	
	public static ArrayList<Course> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Course> listCourse = new ArrayList<Course>();
		try {
			String sql = "select * from course";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Course course = new Course();
				course.setId(rs.getInt("id"));
				course.setName(rs.getString("name"));
				course.setPrefix(rs.getString("prefix"));
				course.setCentiTitle(rs.getString("centi_title"));
				course.setDuration(rs.getInt("duration"));
				
				listCourse.add(course);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find the row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listCourse;
	}
	
	
	public static void main(String[] args) {
//		Course course = new Course("core_java", "j2se", "java-module1", 11);
//		CourseDao courseDao = new CourseDao();
//		courseDao.create(course);
		
//		 Course course = new Course(90, "core_java", "j2se", "java-module1", 11);
//		 CourseDao courseDao = new CourseDao();
//		 courseDao.edit(course);

//		 CourseDao courseDao = new CourseDao();
//		 courseDao.remove(92);

//		 CourseDao courseDao = new CourseDao();
//		 Course course = courseDao.find(90);
//		 System.out.println(course);

//		 CourseDao courseDao = new CourseDao();
//		 ArrayList<Course> al = courseDao.findAll();
//		 for (Course course : al)
//		 System.out.println(course);
	}

}
