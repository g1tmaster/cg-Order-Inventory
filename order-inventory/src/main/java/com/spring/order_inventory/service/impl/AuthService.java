package com.spring.order_inventory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.order_inventory.config.JwtUtil;
import com.spring.order_inventory.dto.LoginRequestDto;
import com.spring.order_inventory.entity.User;
import com.spring.order_inventory.exception.ResourceNotFoundException;
import com.spring.order_inventory.repository.UserRepository;
import com.spring.order_inventory.service.IAuthService;

@Service
public class AuthService implements IAuthService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JwtUtil jwtUtil;

	public String login(LoginRequestDto request) {
		User user = userRepository.findByEmail(request.getEmail())
					.orElseThrow(() -> new RuntimeException("User not found"));
		
		if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
			throw new RuntimeException("Invalid Password");
		}
		
		return jwtUtil.generateToken(user.getEmail());
	}

}
