package redaElidrissi_uoiiitxvdx.springTest.converters;

import java.util.ArrayList;
import java.util.List;

import redaElidrissi_uoiiitxvdx.springTest.domaine.TeacherVo;
import redaElidrissi_uoiiitxvdx.springTest.entities.Teacher;

public class TeacherConverter {

	

	public static TeacherVo toVo(Teacher bo) {
		TeacherVo vo = new TeacherVo();
		vo.setId(bo.getId());
		vo.setFirsName(bo.getFirstName());
		vo.setLastName(bo.getLastName());
		vo.setRole(AppRoleConverter.toVo(bo.getRole()));
		return vo;
	}

	public static Teacher toBo(TeacherVo vo) {
		Teacher bo = new Teacher();
		bo.setId(vo.getId());
		bo.setFirstName(vo.getFirsName());
		bo.setLastName(vo.getLastName());
		bo.setRole(AppRoleConverter.toBo(vo.getRole()));
		return bo;
	}

	public static List<TeacherVo> toListVo(List<Teacher> listBo) {
		List<TeacherVo> listVo = new ArrayList<TeacherVo>();
		listBo.forEach(bo -> {
			listVo.add(toVo(bo));
		});
		return listVo;

	}

	public static List<Teacher> toListBo(List<TeacherVo> listVo) {
		List<Teacher> listBo = new ArrayList<Teacher>();
		listVo.forEach(vo -> {
			listBo.add(toBo(vo));
		});
		return listBo;

	}
}
