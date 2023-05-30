package redaElidrissi_uoiiitxvdx.springTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import redaElidrissi_uoiiitxvdx.springTest.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
