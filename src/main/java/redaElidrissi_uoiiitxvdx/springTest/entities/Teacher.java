package redaElidrissi_uoiiitxvdx.springTest.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

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

	public Teacher(Long id, String firstName, String lastName, List<AppClass> list) {
		super(id, firstName, lastName);
		this.appClasses = list;
	}
	

}
