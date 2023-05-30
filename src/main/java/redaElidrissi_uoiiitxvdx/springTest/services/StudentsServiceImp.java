package redaElidrissi_uoiiitxvdx.springTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import redaElidrissi_uoiiitxvdx.springTest.converters.StudentConverter;
import redaElidrissi_uoiiitxvdx.springTest.dao.StudentRepository;
import redaElidrissi_uoiiitxvdx.springTest.domaine.StudentVo;
import redaElidrissi_uoiiitxvdx.springTest.entities.Student;

@Service
public class StudentsServiceImp implements StudentService {
@Autowired
private StudentRepository studentRepository;
	@Override
	public Page<Student> studentsByFilter(String className, String teacherFullName, int page, int size) {
		String effectiveClassName = className;
		String effectiveTeacherFullName = teacherFullName;
		String effectiveFirstName="";
		String effectiveLastName="";
		if(className.equals(""))
			effectiveClassName="%";
		
		if(teacherFullName.equals("")){
			effectiveFirstName="%";
			effectiveLastName = "%";
		}

		else {
			String[] names =teacherFullName.split(" ");
			if (names.length == 2) {
				effectiveFirstName = names[0];
				effectiveLastName= names[1];
				System.out.println(effectiveFirstName);
				System.out.println(effectiveLastName);
			}
			
			
		}
		
					
		
		Page<Student> returnedPage = this.studentRepository.getStudentsByFilter( effectiveClassName,effectiveFirstName,effectiveLastName, PageRequest.of(page,size));
		
		return returnedPage;
		
	}

}
