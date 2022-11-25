package com.dev4j.auth.model.dto;

public class TokenDto {

	private String token;

	public TokenDto(String token) {
		super();
		this.token = token;
	}

	public TokenDto() {

	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
