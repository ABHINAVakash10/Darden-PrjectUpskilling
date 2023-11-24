package net.javaguides.springbootrestapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springbootrestapi.bean.Student;

@RestController
public class StudentController {
	
	@GetMapping("students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Abhinav", "Akash"));
		students.add(new Student(2, "Rajat ", "Verma"));
		students.add(new Student(3, "Ajit", "Lal"));
		
		return students;
					
				
	}
	
	@GetMapping("students/{id}")
	public Student srudentPathVariable(@PathVariable("id") int studentId)
	{
		return new Student(studentId, "Abhinav", "Akash");
	}
	
	@GetMapping("students/query")
	public Student studentRequestVariable(@RequestParam int id) {
		return new Student(id, "Abhinav", "Akash");
	}
	
	@PostMapping("students/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student)
	{
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return student;
	}
	
	@PutMapping("students/{id}/update")
	public Student updateStudent(Student student, int studentId)
	{
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return student;
	}
	
	@DeleteMapping("students/{id}/delete")
	public String deleteSudent(@PathVariable("id") int studentId) {
		System.out.println(studentId);
		return "student deleted successfully";
	}

}
