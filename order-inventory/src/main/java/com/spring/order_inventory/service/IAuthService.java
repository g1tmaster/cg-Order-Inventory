package com.spring.order_inventory.service;

import com.spring.order_inventory.dto.LoginRequestDto;

public interface IAuthService {
	public String login(LoginRequestDto request);
}
