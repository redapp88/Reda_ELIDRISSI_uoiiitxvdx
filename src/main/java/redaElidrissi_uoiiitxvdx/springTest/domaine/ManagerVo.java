package redaElidrissi_uoiiitxvdx.springTest.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ManagerVo extends AppUserVo {
	private String username;
	private String password;
}
