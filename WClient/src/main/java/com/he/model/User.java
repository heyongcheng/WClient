package com.he.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
	private Long id;
	private String name;
	private String password;
	private Date birthDay;
	private Integer age;
}
