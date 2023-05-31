package redaElidrissi_uoiiitxvdx.springTest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;

}
