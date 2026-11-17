//
//package cse_5.StudentManagementSystem.repository;
//import cse_5.StudentManagementSystem.model.StudentManagementSystemModel;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class StudentManagementSystemRepository {
//	@Value("${spring.datasource.url}")
//	private String url;
//	
//	@Value("${spring.datasource.username}")
//	private String username;
//	
//	@Value("${spring.datasource.password}")
//	private String password;
//	public int updateStudent(StudentManagementSystemModel model) {
//		try {
//			Connection con=DriverManager.getConnection(url, username, password);
//			String sql = "UPDATE student_details SET studentname=?, branch=?, email=?, mobileno=?, address=?, dateofbirth=? WHERE studentid=?";
//			PreparedStatement st=con.prepareStatement(sql);
//			st.setString(1, model.getStudentname());
//			st.setString(2, model.getBranch());
//			st.setString(3, model.getEmail());
//			st.setString(4, model.getMobileno());
//			st.setString(5, model.getAddress());
//			st.setDate(6, model.getDateofbirth());
//			st.setInt(7, model.getStudentid());
//			return st.executeUpdate();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
//	public StudentManagementSystemModel getStudentById(int studentid) {
//
//	    try {
//
//	        Connection con = DriverManager.getConnection(url, username, password);
//
//	        String sql = "SELECT * FROM student_details WHERE studentid=?";
//
//	        PreparedStatement st = con.prepareStatement(sql);
//
//	        st.setInt(1, studentid);
//
//	        ResultSet rs = st.executeQuery();
//
//	        if (rs.next()) {
//
//	            StudentManagementSystemModel model =
//	                new StudentManagementSystemModel(
//	                    rs.getInt("studentid"),
//	                    rs.getString("studentname"),
//	                    rs.getString("branch"),
//	                    rs.getString("email"),
//	                    rs.getString("mobileno"),
//	                    rs.getString("address"),
//	                    rs.getDate("dateofbirth")
//	                );
//
//	            return model;
//	        }
//
//	    }
//	    catch (Exception e) {
//	        e.printStackTrace();
//	    }
//
//	    return null;
//	}
//	public List<StudentManagementSystemModel> getstudentdetails(){
//		 List<StudentManagementSystemModel> students = new ArrayList<>();
//		try {
//		Connection con=DriverManager.getConnection(url, username, password);
//		String sql="SELECT * FROM student_details";
//		PreparedStatement st=con.prepareStatement(sql);
//		ResultSet rs=st.executeQuery();
//		while(rs.next()) {
//			StudentManagementSystemModel model=new StudentManagementSystemModel(rs.getInt("studentid"),
//                    rs.getString("studentname"),
//                    rs.getString("branch"),
//                    rs.getString("email"),
//                    rs.getString("mobileno"),
//                    rs.getString("address"),
//                    rs.getDate("dateofbirth"));
//			students.add(model);
//		}
//		return students;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public int deletestudent(int studentid) {
//		try {
//			Connection con=DriverManager.getConnection(url, username, password);
//			String sql=" delete from student_details where studentid=?";
//			PreparedStatement st=con.prepareStatement(sql);
//			st.setInt(1,studentid);
//			return st.executeUpdate();
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
//	public int savestudent(StudentManagementSystemModel model) {
//		try {
//			Connection con=DriverManager.getConnection(url, username, password);
//			String sql=" insert into student_details(studentid, studentname, branch, email, mobileno, address, dateofbirth) VALUES (?, ?, ?, ?, ?, ?, ?); ";
//			
//			PreparedStatement st=con.prepareStatement(sql);
//			st.setInt(1,model.getStudentid());
//			st.setString(2, model.getStudentname());
//			st.setString(3, model.getBranch());
//			st.setString(4, model.getEmail());
//			st.setString(5, model.getMobileno());
//			st.setString(6, model.getAddress());
//			st.setDate(7, model.getDateofbirth());
//			return st.executeUpdate();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
//	
//
//}
