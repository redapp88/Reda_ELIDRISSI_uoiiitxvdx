package redaElidrissi_uoiiitxvdx.springTest.domaine;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class AppUserVo {
	private Long id;
	private String firsName;
	private String lastName;
	private AppRoleVo role;
}
