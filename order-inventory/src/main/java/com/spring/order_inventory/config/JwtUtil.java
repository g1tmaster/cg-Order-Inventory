package com.spring.order_inventory.config;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtUtil {
	private final String SECRET = "mysecretkeymysecretkeymysecretkey123";
	
	private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

	
	public String generateToken(String email) {
		return Jwts.builder()
				.subject(email)
				.issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
				.signWith(key)
				.compact();
	}
}
