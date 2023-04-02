package it.shoppingtools.service;

import it.shoppingtools.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import it.shoppingtools.dao.UserRepository;
import it.shoppingtools.dto.UserDTO;
import it.shoppingtools.mapper.UtenzaMapper;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {
	
	 UtenzaMapper utenzaMapper = UtenzaMapper.INSTANCE;
	
	// EX LOGIN method
	public UserDTO findByUsernameAndPassword(String username, String password) {
		return utenzaMapper.toUser((userRepository).findByUsernameAndPassword(username, password));
	}

	//NEW LOGIN METHOD
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
			getAuthorities(user.getRoles()));
	}

	private List<GrantedAuthority> getAuthorities(Set<Role> roles) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		return authorities;
	}
}
