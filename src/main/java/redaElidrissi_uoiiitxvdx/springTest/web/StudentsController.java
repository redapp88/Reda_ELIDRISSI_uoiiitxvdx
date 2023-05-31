package redaElidrissi_uoiiitxvdx.springTest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import redaElidrissi_uoiiitxvdx.springTest.domaine.StudentVo;
import redaElidrissi_uoiiitxvdx.springTest.entities.Student;
import redaElidrissi_uoiiitxvdx.springTest.services.StudentService;

@RestController
@RequestMapping("students")
public class StudentsController {
	@Autowired
	private StudentService studentService;

	@GetMapping
	public Page<Student> studentByFilter(
			@RequestParam(name = "className", defaultValue = "") String className,
			@RequestParam(name = "teacherFullName", defaultValue = "") String teacherFullName,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "5") int size) {
		
		
		return this.studentService.studentsByFilter(className, teacherFullName, page, size);

	}

}
