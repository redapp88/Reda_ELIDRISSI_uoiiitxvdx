package redaElidrissi_uoiiitxvdx.springTest.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentVo extends AppUserVo {
	@ManyToOne
	private AppClassVo appClass;

}
