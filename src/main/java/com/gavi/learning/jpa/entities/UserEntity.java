package com.gavi.learning.jpa.entities;

public class UserEntity {

	private Long id;
	
	private String name;
	
	private String role;
	
	protected UserEntity() {
		
	}

	public UserEntity(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
}
