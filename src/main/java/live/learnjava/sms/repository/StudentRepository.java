package live.learnjava.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import live.learnjava.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
