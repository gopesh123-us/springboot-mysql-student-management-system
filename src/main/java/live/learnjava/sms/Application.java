package live.learnjava.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import live.learnjava.sms.entity.Student;
import live.learnjava.sms.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student();
//		s1.setFirstName("Guru");
//		s1.setLastName("Bhagwaan");
//		s1.setEmail("gurujipuri@hotmail.com");
//		studentRepository.save(s1); 
//		
//		Student s2 = new Student();
//		s2.setFirstName("Keshav");
//		s2.setLastName("Narayan");
//		s2.setEmail("narayan@gmail.com");
//		studentRepository.save(s2);
//		
//		Student s3 = new Student();
//		s3.setFirstName("Sonia");
//		s3.setLastName("Bhargav");
//		s3.setEmail("sonia@gmail.com");
//		studentRepository.save(s3);
	}

}
