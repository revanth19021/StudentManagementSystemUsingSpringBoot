package cse_5.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cse_5.StudentManagementSystem.model.StudentManagementSystemModel;
import cse_5.StudentManagementSystem.service.StudentManagementSystemService;

@Controller
public class StudentManagementSystemController {
	@Autowired
	private StudentManagementSystemService service;
	
	@GetMapping("/")
	public String homepage() {
		return "home";
	}
	@GetMapping("/about")
	public String aboutpage() {
		return "about";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/update")
	public String updating() {
		return "update";
	}

	@GetMapping("/delete")
	public String deleting() {
		return "delete";
	}
	@GetMapping("/contact")
	public String contacting() {
		return "contact";
	}
	
	@PostMapping("/register")
	public String savestudent(StudentManagementSystemModel model) {
		int result=service.savestudent(model);
		if(result>0) {
			return "redirect:/";
		}
		return "register";
	}
	
	@PostMapping("/update")
	public String updateStudent(StudentManagementSystemModel model) {

	    int result = service.updatestudent(model);

	    if (result > 0) {
	        return "redirect:/";
	    }

	    return "update";
	}
	
	@PostMapping("/delete")
	public String deleteStudent(@RequestParam("studentid") int id) {
		 int result = service.deletestudent(id);

		    if (result > 0) {
		        return "redirect:/";
		    }

		    return "delete";
	}
}