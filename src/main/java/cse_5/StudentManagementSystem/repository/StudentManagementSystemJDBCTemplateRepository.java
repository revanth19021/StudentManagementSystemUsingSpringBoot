<<<<<<< HEAD
//package cse_5.StudentManagementSystem.repository;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import cse_5.StudentManagementSystem.model.StudentManagementSystemModel;
//
//@Repository
//public class StudentManagementSystemJDBCTemplateRepository {
//	
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	public StudentManagementSystemModel getstudent(int id) {
//		String sql="select * from student_details where studentid=?";
//		StudentManagementSystemModel model=(StudentManagementSystemModel) jdbcTemplate.query(sql, (rs,rownumber)->{
//			return new StudentManagementSystemModel(rs.getInt("studentid"),
//                    rs.getString("studentname"),
//                    rs.getString("branch"),
//                    rs.getString("email"),
//                    rs.getString("mobileno"),
//                    rs.getString("address"),
//                    rs.getDate("dateofbirth"));
//		},id);
//		return model;
//	}
//	public List<StudentManagementSystemModel> getstudents(){
//		String sql="select * from student_details";
//		List<StudentManagementSystemModel> students=jdbcTemplate.query(sql, (rs,rownumber)->{
//			return new StudentManagementSystemModel(rs.getInt(0),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6));
//		});
//		return students;
//	}
//	
//	
//	public int savestudent(StudentManagementSystemModel model) throws SQLException{
//		String sql="insert into student_details( studentid  ,studentname, branch ,email,mobileno,address,dateofbirth) values(?,?,?,?,?,?,?)";
//		int result=jdbcTemplate.update(sql,model.getStudentid(),model.getStudentname(),model.getBranch(),
//	            model.getEmail(),
//	            model.getMobileno(),
//	            model.getAddress(),
//	            model.getDateofbirth());
//		
//		return result; 
//	}
//	
//	public int updatestudent(StudentManagementSystemModel model) throws SQLException{
//		String sql="update student_details set studentname=?,branch=?,email=?,mobileno=?,address=?,dateofbirth=? where studentid=?";
//		int result=jdbcTemplate.update(sql, model.getStudentname(),
//	            model.getBranch(),
//	            model.getEmail(),
//	            model.getMobileno(),
//	            model.getAddress(),
//	            model.getDateofbirth(),
//	            model.getStudentid());
//		return result;
//	}
//	
//
//}
=======
package cse_5.StudentManagementSystem.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cse_5.StudentManagementSystem.model.StudentManagementSystemModel;

@Repository
public class StudentManagementSystemJDBCTemplateRepository {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public StudentManagementSystemModel getstudent(int id) {
		String sql="select * from student_details where studentid=?";
		StudentManagementSystemModel model=(StudentManagementSystemModel) jdbcTemplate.query(sql, (rs,rownumber)->{
			return new StudentManagementSystemModel(rs.getInt("studentid"),
                    rs.getString("studentname"),
                    rs.getString("branch"),
                    rs.getString("email"),
                    rs.getString("mobileno"),
                    rs.getString("address"),
                    rs.getDate("dateofbirth"));
		},id);
		return model;
	}
	public List<StudentManagementSystemModel> getstudents(){
		String sql="select * from student_details";
		List<StudentManagementSystemModel> students=jdbcTemplate.query(sql, (rs,rownumber)->{
			return new StudentManagementSystemModel(rs.getInt(0),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6));
		});
		return students;
	}
	
	
	public int savestudent(StudentManagementSystemModel model) throws SQLException{
		String sql="insert into student_details( studentid  ,studentname, branch ,email,mobileno,address,dateofbirth) values(?,?,?,?,?,?,?)";
		int result=jdbcTemplate.update(sql,model.getStudentid(),model.getStudentname(),model.getBranch(),
	            model.getEmail(),
	            model.getMobileno(),
	            model.getAddress(),
	            model.getDateofbirth());
		
		return result; 
	}
	
	public int updatestudent(StudentManagementSystemModel model) throws SQLException{
		String sql="update student_details set studentname=?,branch=?,email=?,mobileno=?,address=?,dateofbirth=? where studentid=?";
		int result=jdbcTemplate.update(sql, model.getStudentname(),
	            model.getBranch(),
	            model.getEmail(),
	            model.getMobileno(),
	            model.getAddress(),
	            model.getDateofbirth(),
	            model.getStudentid());
		return result;
	}
	

}
>>>>>>> 474b159fbdfb411d9e6a224e2acd1aebca9bb4b2
