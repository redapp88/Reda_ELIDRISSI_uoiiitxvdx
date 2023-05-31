package redaElidrissi_uoiiitxvdx.springTest.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import redaElidrissi_uoiiitxvdx.springTest.entities.Manager;



public interface ManagerRepository extends JpaRepository<Manager, Long> {
	
	public Optional<Manager> findByUsername(String username);

	public Manager getByUsername(String username);

}
