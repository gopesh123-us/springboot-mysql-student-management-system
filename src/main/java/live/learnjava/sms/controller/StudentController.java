package live.learnjava.sms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import live.learnjava.sms.entity.Student;
import live.learnjava.sms.service.IStudentService;

@Controller
@RequestMapping("/sms")
public class StudentController {
	private Logger logger = LoggerFactory.getLogger(StudentController.class);
	private IStudentService service;

	public StudentController(IStudentService service) {
		super();
		this.service = service;
	}

	// handler method to list students and return model and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		logger.info("*** inside listStudents() ***");
		// add data to model
		List<Student> students = service.getAllStudents();
		model.addAttribute("students", students);
		return "students";
	}

	@GetMapping("/new")
	public String createStudentForm(Model model) {

		// create a student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/sms/students";
	}

	@GetMapping("/edit/{id}")
	public String updateStudentForm(@PathVariable Long id, Model model) {
		Student student = service.getStudentById(id);
		model.addAttribute("student", student);
		return "edit_student";
	}

	@PostMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		service.saveStudent(student);
		// get student from database by id
		Student existingStudent = service.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		service.updateStudent(existingStudent);
		return "redirect:/sms/students";
	}

	@GetMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		service.deleteStudentById(id);
		return "redirect:/sms/students";
	}

}
