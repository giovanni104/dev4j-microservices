package com.devs4j.gateway.model;

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
