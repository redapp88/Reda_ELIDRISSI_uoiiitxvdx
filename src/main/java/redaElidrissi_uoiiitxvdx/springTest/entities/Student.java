package redaElidrissi_uoiiitxvdx.springTest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student extends AppUser {
	@ManyToOne
	private AppClass appClass;

}
