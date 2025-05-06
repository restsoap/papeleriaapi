package co.variedades.magicas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.variedades.magicas.repositories.IUserRepository;

@Service
public class UserService {
	
	private IUserRepository userRepo;
	@Autowired

	//Instanciamos nuestro repositorio
	public UserService(IUserRepository userRepo ) {
		this.userRepo = userRepo;
	}
}
