package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.UserRepository;
import it.contrader.dto.UserDTO;
import it.contrader.mapper.UtenzaMapper;

@Service
public class UserService {
	
	 UtenzaMapper utenzaMapper = UtenzaMapper.INSTANCE;
	 @Autowired
	 UserRepository userRepository;
	
	//LOGIN method
	public UserDTO findByUsernameAndPassword(String username, String password) {
		return utenzaMapper.toUser((userRepository).findByUsernameAndPassword(username, password));
	}

}
