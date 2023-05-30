package redaElidrissi_uoiiitxvdx.springTest.services;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import redaElidrissi_uoiiitxvdx.springTest.domaine.StudentVo;
import redaElidrissi_uoiiitxvdx.springTest.entities.Student;

@Service
public interface StudentService {

	public Page<Student> studentsByFilter(String className,String teacherName,int page,int size);
	
}
