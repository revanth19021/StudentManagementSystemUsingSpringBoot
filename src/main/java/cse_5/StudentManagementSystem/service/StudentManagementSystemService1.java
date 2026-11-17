package cse_5.StudentManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cse_5.StudentManagementSystem.model.StudentManagementSystemModelAnnotations;
import cse_5.StudentManagementSystem.repository.StudentManagementSystem;

@Service
public class StudentManagementSystemService1 {
	private StudentManagementSystem system;
	StudentManagementSystemService1(StudentManagementSystem jpA){
		this.system=jpA;
	}
	public StudentManagementSystemModelAnnotations savestudent(StudentManagementSystemModelAnnotations student) {
		return system.save(student);
	}
	public StudentManagementSystemModelAnnotations updatestudent(StudentManagementSystemModelAnnotations student) {
		if(!system.existsById(student.getStudentid())) {
			return null;
		}
		return system.save(student);
	}
	public boolean deletestudent(int id) {
		if(!system.existsById(id)) {
			return false;
		}
		system.deleteById(id);
		return true;
	}
	  public List<StudentManagementSystemModelAnnotations> getstudentdetails() {

	        return system.findAll();
	    }

	    public Optional<StudentManagementSystemModelAnnotations> getStudentById(int id) {

	        return system.findById(id);
	    }
}
