package redaElidrissi_uoiiitxvdx.springTest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
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
	@JsonIgnore
	@ManyToOne
	private AppRole role;
}
