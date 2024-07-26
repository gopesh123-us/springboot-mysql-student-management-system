package live.learnjava.sms.service;

import java.util.List;

import live.learnjava.sms.entity.Student;

public interface IStudentService {
	
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteStudentById(Long studentId);
	
}
