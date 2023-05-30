package redaElidrissi_uoiiitxvdx.springTest.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manager extends AppUser {
	private String username;
	private String password;
}
