package com.spring.order_inventory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.order_inventory.dto.LoginRequestDto;
import com.spring.order_inventory.dto.LoginResponseDto;
import com.spring.order_inventory.service.IAuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final IAuthService authService;

	public AuthController(IAuthService authService) {
		this.authService = authService;
	}

	@PostMapping("/login")
	public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto request) {
		return ResponseEntity.ok(authService.login(request));
	}
}