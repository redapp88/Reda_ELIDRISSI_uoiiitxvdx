package redaElidrissi_uoiiitxvdx.springTest.services;

import org.springframework.stereotype.Service;

import redaElidrissi_uoiiitxvdx.springTest.entities.Manager;



@Service
public interface ManagerService {
	public Manager getUser(String username);

	public Manager getByUsername(String username);

}
