package com.pg.microservice.consumerservice.bean;

public class ConsumerBean {
	
	private int id;
	
	private String name;
	
	private String college;
	
	private String degree;
	
	private String email;

	private Long contact;

	public ConsumerBean(int id, String name, String college, String degree, String email, Long contact) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.degree = degree;
		this.email = email;
		this.contact = contact;
	}

	public ConsumerBean() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

}
