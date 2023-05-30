package redaElidrissi_uoiiitxvdx.springTest.domaine;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppClassVo {
	private Long id;
	private String name;
	private TeacherVo teacher;
	private List<StudentVo> students;
}
