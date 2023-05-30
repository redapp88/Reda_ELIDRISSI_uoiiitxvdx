package redaElidrissi_uoiiitxvdx.springTest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import redaElidrissi_uoiiitxvdx.springTest.domaine.StudentVo;
import redaElidrissi_uoiiitxvdx.springTest.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
	@Query("Select s from Student s where (s.appClass.name like :className and (s.appClass.teacher.firstName like :firstName and s.appClass.teacher.lastName like :lastName))")
	public Page<Student> getStudentsByFilter(@Param("className") String className,@Param("firstName") String firstName ,@Param("lastName") String lastName,Pageable pageable);

}
