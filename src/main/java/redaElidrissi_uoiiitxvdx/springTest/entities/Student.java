package redaElidrissi_uoiiitxvdx.springTest.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	public Student(Long id, String firstName, String lastName, AppClass appClass) {
		super(id, firstName, lastName);
		this.appClass = appClass;
	}
	
	

}
