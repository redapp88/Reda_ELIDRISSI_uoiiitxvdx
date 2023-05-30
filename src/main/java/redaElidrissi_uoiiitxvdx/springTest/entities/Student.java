package redaElidrissi_uoiiitxvdx.springTest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@JsonIgnore
	private AppClass appClass;

	public Student(Long id, String firstName, String lastName, AppRole role, AppClass appClass) {
		super(id, firstName, lastName, role);
		this.appClass = appClass;
	}
	
	

}
