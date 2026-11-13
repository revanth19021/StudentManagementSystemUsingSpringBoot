package cse_5.StudentManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cse_5.StudentManagementSystem.model.StudentManagementSystemModel;
import cse_5.StudentManagementSystem.repository.StudentManagementSystemRepository;

@Service
public class StudentManagementSystemService {
	@Autowired
	private StudentManagementSystemRepository repository;
	
	public int savestudent(StudentManagementSystemModel model) {
		return repository.savestudent(model);
	}
	public int updatestudent(StudentManagementSystemModel model) {
		return repository.updateStudent(model);
	}
	public int deletestudent(int id) {
		return repository.deletestudent(id);
	}
	 public List<StudentManagementSystemModel> getstudentdetails() {
	        return repository.getstudentdetails();
	    }

	    
	    public StudentManagementSystemModel getStudentById(int id) {
	        return repository.getStudentById(id);
	    }

}
