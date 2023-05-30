package redaElidrissi_uoiiitxvdx.springTest.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher extends AppUser {
	@OneToMany(mappedBy = "teacher")
	private List<AppClass> appClasses ;

	public Teacher(Long id, String firstName, String lastName, AppRole role, List<AppClass> list) {
		super(id, firstName, lastName, role);
		this.appClasses = list;
	}
	

}
