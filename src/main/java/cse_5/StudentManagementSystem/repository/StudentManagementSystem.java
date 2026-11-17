package cse_5.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cse_5.StudentManagementSystem.model.StudentManagementSystemModelAnnotations;

@Repository
public interface StudentManagementSystem extends JpaRepository<StudentManagementSystemModelAnnotations,Integer>{
	// // save(student)
    // findAll()
    // findById(id)
    // existsById(id)
    // deleteById(id)
}
