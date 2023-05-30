package redaElidrissi_uoiiitxvdx.springTest.domaine;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherVo extends AppUserVo {
	@OneToMany(mappedBy = "teacher")
	private List<AppClassVo> appClasses;

}
