package live.learnjava.sms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import live.learnjava.sms.entity.Student;
import live.learnjava.sms.repository.StudentRepository;
import live.learnjava.sms.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	private StudentRepository studentRepo;

	public StudentServiceImpl(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {

		// use repo
		List<Student> students = studentRepo.findAll();
		return students;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long studentId) {
		
		studentRepo.deleteById(studentId);
	}

}
