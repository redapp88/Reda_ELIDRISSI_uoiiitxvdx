package redaElidrissi_uoiiitxvdx.springTest.security;


import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import redaElidrissi_uoiiitxvdx.springTest.entities.Manager;
import redaElidrissi_uoiiitxvdx.springTest.services.ManagerService;


@Service
@Transactional

public class UserDetailsServiceImp implements UserDetailsService {
@Autowired
private ManagerService managerService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Manager manager = this.managerService.getByUsername(username);
		
		if (manager== null) throw new UsernameNotFoundException(username);
		Collection<GrantedAuthority> authorities=new ArrayList<>();
	    authorities.add(new SimpleGrantedAuthority(manager.getRole().getRoleName()));
	    ExtendedUser user=new ExtendedUser(
	    		manager.getUsername(),
	    		manager.getPassword(),
	    		manager.getName(),
	    		authorities);
		return user;
	}



}
