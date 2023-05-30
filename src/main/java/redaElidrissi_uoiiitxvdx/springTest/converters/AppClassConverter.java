package redaElidrissi_uoiiitxvdx.springTest.converters;

import java.util.ArrayList;
import java.util.List;

import redaElidrissi_uoiiitxvdx.springTest.domaine.AppClassVo;
import redaElidrissi_uoiiitxvdx.springTest.entities.AppClass;

public class AppClassConverter {

	public static AppClassVo toVo(AppClass bo) {
		AppClassVo vo = new AppClassVo();
		vo.setId(bo.getId());
		vo.setName(bo.getName());
		vo.setTeacher(TeacherConverter.toVo(bo.getTeacher()));
		vo.setStudents(StudentConverter.toListVo(bo.getStudents()));
		return vo;
	}

	public static AppClass toBo(AppClassVo vo) {
		AppClass bo = new AppClass();
		bo.setId(bo.getId());
		bo.setName(bo.getName());
		bo.setTeacher(TeacherConverter.toBo(vo.getTeacher()));
		bo.setStudents(StudentConverter.toListBo(vo.getStudents()));
		return bo;
	}

	public static List<AppClassVo> toListVo(List<AppClass> listBo) {
		List<AppClassVo> listVo = new ArrayList<AppClassVo>();
		listBo.forEach(bo -> {
			listVo.add(toVo(bo));
		});
		return listVo;

	}

	public static List<AppClass> toListBo(List<AppClassVo> listVo) {
		List<AppClass> listBo = new ArrayList<AppClass>();
		listVo.forEach(vo -> {
			listBo.add(toBo(vo));
		});
		return listBo;

	}
	
}
