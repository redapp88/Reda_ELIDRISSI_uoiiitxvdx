package redaElidrissi_uoiiitxvdx.springTest.domaine;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manager extends AppUserVo {
	private String username;
	private String password;
}
