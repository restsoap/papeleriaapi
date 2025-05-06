package co.variedades.magicas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.variedades.magicas.models.User;


public interface IUserRepository extends JpaRepository<User, Long>{
	
	List<User> findByName (String name);   

}
