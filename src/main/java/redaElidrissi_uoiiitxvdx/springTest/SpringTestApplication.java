package redaElidrissi_uoiiitxvdx.springTest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import redaElidrissi_uoiiitxvdx.springTest.dao.AppCLassRepository;
import redaElidrissi_uoiiitxvdx.springTest.dao.AppRoleRepository;
import redaElidrissi_uoiiitxvdx.springTest.dao.StudentRepository;
import redaElidrissi_uoiiitxvdx.springTest.dao.TeacherRepository;
import redaElidrissi_uoiiitxvdx.springTest.entities.AppClass;
import redaElidrissi_uoiiitxvdx.springTest.entities.AppRole;
import redaElidrissi_uoiiitxvdx.springTest.entities.Student;
import redaElidrissi_uoiiitxvdx.springTest.entities.Teacher;
import redaElidrissi_uoiiitxvdx.springTest.services.StudentService;

@SpringBootApplication
public class SpringTestApplication implements CommandLineRunner {
@Autowired
private StudentService studentService;
@Autowired
private AppCLassRepository appClassRepository;
@Autowired
private TeacherRepository teacherRepository;
@Autowired
private AppRoleRepository appRoleRepository;
@Autowired
private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		// Creation des roles utilisateurs (utilisé par Spring Security)
		AppRole role1 = new AppRole(null,"USER");
		AppRole role2 = new AppRole(null,"ADMIN");
		this.appRoleRepository.save(role1);
		this.appRoleRepository.save(role2);
		
		
		
		
		//
		Teacher teacher1 = new Teacher(null,"Jean","DUPONT",role1,new ArrayList<AppClass>());
		Teacher teacher2 = new Teacher(null,"Marie","RINNEAU",role1,new ArrayList<AppClass>());
		Teacher teacher3 = new Teacher(null,"Florus","BEAUDOIN",role1,new ArrayList<AppClass>());
		teacher1=this.teacherRepository.save(teacher1);
		teacher2=this.teacherRepository.save(teacher2);
		teacher3=this.teacherRepository.save(teacher3);
		
		//
		AppClass classe1 =  new AppClass(null,"CP1", teacher1, new ArrayList<Student>());
		AppClass classe2 =  new AppClass(null,"CE1", teacher2,  new ArrayList<Student>());
		AppClass classe3 =  new AppClass(null,"CP2", teacher2,  new ArrayList<Student>()); 
		AppClass classe4 =  new AppClass(null,"CE2", teacher3,  new ArrayList<Student>());
		AppClass classe5 =  new AppClass(null,"CM1", teacher1,  new ArrayList<Student>());
		
		classe1=this.appClassRepository.save(classe1);
		classe2=this.appClassRepository.save(classe2);
		classe3=this.appClassRepository.save(classe3);
		classe4=this.appClassRepository.save(classe4);
		classe5=this.appClassRepository.save(classe5);
		
		//
		
		Student student1 = new Student(null,"Noel","GUY",role1,classe1);
		Student student2 = new Student(null,"Nicolas","Aubert",role1,classe1);
		Student student3 = new Student(null,"Hortense","Legendre-Renault",role1,classe1);
		Student student4 = new Student(null,"Philippine","Bourdon",role1,classe2);
		Student student5 = new Student(null,"Océane","Martineau",role1,classe2);
		Student student6 = new Student(null,"Aurélie","Jacquet",role1,classe2);
		Student student7 = new Student(null,"Karim","JABRI",role1,classe3);
		Student student8 = new Student(null,"Jean","Pigeon",role1,classe3);
		Student student9 = new Student(null,"Julian","cousin",role1,classe3);
		Student student10 = new Student(null,"William","Caron",role1,classe4);
		Student student11 = new Student(null,"Henri","Adam-Lesage",role1,classe4);
		Student student12 = new Student(null,"Henriette","Blondel",role1,classe5);
		Student student13 = new Student(null,"Corinne","Diaz",role1,classe5);
		
				
		student1= this.studentRepository.save(student1);
		student2= this.studentRepository.save(student2);
		student3= this.studentRepository.save(student3);
		student4= this.studentRepository.save(student4);
		student5= this.studentRepository.save(student5);
		student6= this.studentRepository.save(student6);
		student7= this.studentRepository.save(student7);
		student8= this.studentRepository.save(student8);
		student9= this.studentRepository.save(student9);
		student10= this.studentRepository.save(student10);
		student11= this.studentRepository.save(student11);
		student12= this.studentRepository.save(student12);
		student13= this.studentRepository.save(student13);
		 

		
		
		
	}
	
	

}
