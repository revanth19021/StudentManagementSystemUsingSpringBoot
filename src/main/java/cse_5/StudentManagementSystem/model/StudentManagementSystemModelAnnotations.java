package cse_5.StudentManagementSystem.model;

import java.sql.Date;

import org.springframework.boot.persistence.autoconfigure.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentManagementSystemModelAnnotations {
	@Id
	@Column(name="studentid")
	 private int studentid;
	@Column(name="studentname")
	    private String studentname;
	@Column(name="branch")
	    private String branch;
	@Column(name="email")
	    private String email;
	@Column(name="mobileno")
	    private String mobileno;
	@Column(name="address")
	    private String address;
	@Column(name="dateofbirth")
	    private Date dateofbirth;
	    public StudentManagementSystemModelAnnotations() {
	        
	    }
	    public StudentManagementSystemModelAnnotations(int studentid, String studentname, String branch,
	                   String email, String mobileno, String address,
	                   Date dateofbirth) {

	        this.studentid = studentid;
	        this.studentname = studentname;
	        this.branch = branch;
	        this.email = email;
	        this.mobileno = mobileno;
	        this.address = address;
	        this.dateofbirth = dateofbirth;
	    }

	    

	    public int getStudentid() {
	        return studentid;
	    }

	    public void setStudentid(int studentid) {
	        this.studentid = studentid;
	    }

	    public String getStudentname() {
	        return studentname;
	    }

	    public void setStudentname(String studentname) {
	        this.studentname = studentname;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public void setBranch(String branch) {
	        this.branch = branch;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMobileno() {
	        return mobileno;
	    }

	    public void setMobileno(String mobileno) {
	        this.mobileno = mobileno;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public Date getDateofbirth() {
	        return dateofbirth;
	    }

	    public void setDateofbirth(Date dateofbirth) {
	        this.dateofbirth = dateofbirth;
	    }

}
