package redaElidrissi_uoiiitxvdx.springTest.converters;

import java.util.ArrayList;
import java.util.List;

import redaElidrissi_uoiiitxvdx.springTest.domaine.StudentVo;
import redaElidrissi_uoiiitxvdx.springTest.entities.Student;

public class StudentConverter {

	
	public static StudentVo toVo(Student bo) {
		StudentVo vo = new StudentVo();
		vo.setId(bo.getId());
		vo.setFirsName(bo.getFirstName());
		vo.setLastName(bo.getLastName());
		return vo;
	}

	public static Student toBo(StudentVo vo) {
		Student bo = new Student();
		bo.setId(vo.getId());
		bo.setFirstName(vo.getFirsName());
		return bo;
	}

	public static List<StudentVo> toListVo(List<Student> listBo) {
		List<StudentVo> listVo = new ArrayList<StudentVo>();
		listBo.forEach(bo -> {
			listVo.add(toVo(bo));
		});
		return listVo;

	}

	public static List<Student> toListBo(List<StudentVo> listVo) {
		List<Student> listBo = new ArrayList<Student>();
		listVo.forEach(vo -> {
			listBo.add(toBo(vo));
		});
		return listBo;

	}
}
