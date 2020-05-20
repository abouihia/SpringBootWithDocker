package org.java.courses.service;

import java.util.Optional;

import org.java.courses.auth.MyUserDetail;
import org.java.courses.entity.User;
import org.java.courses.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository  userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User>   user  = userRepo.findByUserName(username);
		
		return user.map(MyUserDetail::new)
						.orElseThrow(() -> new UsernameNotFoundException("this User is not founded"+ username));
		
	}
}