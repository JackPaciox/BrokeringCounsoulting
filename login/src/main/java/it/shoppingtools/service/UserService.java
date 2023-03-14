package it.shoppingtools.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.shoppingtools.dao.UserRepository;
import it.shoppingtools.dto.UserDTO;
import it.shoppingtools.mapper.UtenzaMapper;

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
