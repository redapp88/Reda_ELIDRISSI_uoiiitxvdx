package redaElidrissi_uoiiitxvdx.springTest.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manager {

	@Id
	private String username;
	private String password;
	private String name;
	@ManyToOne
	private AppRole role;
	
	
}
