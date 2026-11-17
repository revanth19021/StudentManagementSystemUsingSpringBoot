package cse_5.StudentManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cse_5.StudentManagementSystem.service.StudentManagementSystemService1;
import cse_5.StudentManagementSystem.model.StudentManagementSystemModelAnnotations;

@Controller
public class StudentManagementSystemController1 {
	private StudentManagementSystemService1 service;
	public StudentManagementSystemController1(StudentManagementSystemService1 service1){
		this.service=service1;
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	
	
	@GetMapping("/update")
	public String update() {
		
		return "update";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("studentid") int id, Model model) {

	    Optional<StudentManagementSystemModelAnnotations> student =
	            service.getStudentById(id);

	    if (student.isPresent()) {
	        model.addAttribute("student", student.get());
	    } else {
	        model.addAttribute("message", "Student ID " + id + " not found!");
	    }

	    return "search";
	}
	
	@PostMapping("/register")
	public String registration(StudentManagementSystemModelAnnotations model) {
		StudentManagementSystemModelAnnotations result=service.savestudent(model);
		
		if(result!=null) {
			return "redirect:/";
		}
		return "register";
	}
	
	@PostMapping("/update")
	public String updatingstudent(StudentManagementSystemModelAnnotations model) {
		StudentManagementSystemModelAnnotations result=service.updatestudent(model);
		
		if(result!=null) {
			return "redirect:/";
		}
		return "update";
	}
	
	@PostMapping("/delete")
	public String deletebyid(@RequestParam("studentid") int id) {

	    boolean result = service.deletestudent(id);

	    if (result) {
	        return "redirect:/";
	    }

	    return "delete";
	}
	@GetMapping("/retrieving")
	public List<StudentManagementSystemModelAnnotations> getdetails(Model model) {
		
		List<StudentManagementSystemModelAnnotations> students= service.getstudentdetails();
		model.addAttribute("students", students);
		return students;
	}
}
