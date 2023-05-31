package redaElidrissi_uoiiitxvdx.springTest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redaElidrissi_uoiiitxvdx.springTest.dao.ManagerRepository;
import redaElidrissi_uoiiitxvdx.springTest.entities.Manager;

@Service
public class ManagerServiceImp implements ManagerService {
@Autowired
ManagerRepository managerRepository;
	@Override
	public Manager getUser(String username) {
		Optional<Manager> userOpt = this.managerRepository.findByUsername(username);
		if (!userOpt.isPresent())
			return null;
		else
			return userOpt.get();
	}
	@Override
	public Manager getByUsername(String username) {
	return this.managerRepository.getByUsername(username);
	}

}
