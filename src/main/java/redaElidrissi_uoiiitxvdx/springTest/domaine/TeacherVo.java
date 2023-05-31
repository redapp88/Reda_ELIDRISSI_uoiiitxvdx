package redaElidrissi_uoiiitxvdx.springTest.domaine;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherVo extends AppUserVo {
	private List<AppClassVo> appClasses;

}
