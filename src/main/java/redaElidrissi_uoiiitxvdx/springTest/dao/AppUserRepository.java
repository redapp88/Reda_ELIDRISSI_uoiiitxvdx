package redaElidrissi_uoiiitxvdx.springTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import redaElidrissi_uoiiitxvdx.springTest.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

}
