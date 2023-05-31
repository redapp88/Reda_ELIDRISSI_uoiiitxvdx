package redaElidrissi_uoiiitxvdx.springTest.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import lombok.Data;

@Data
public class ExtendedUser extends User {
	private String name;


	public ExtendedUser(String username, String password, String name,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		this.name = name;


	}

}
