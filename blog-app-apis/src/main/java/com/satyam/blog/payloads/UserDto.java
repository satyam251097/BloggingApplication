package com.satyam.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min=4, message="Name must be minimim 4 characters long")
	private String name;
	
	@Email(message = "Email is invalid!")
	private String email;
	
	@NotEmpty
	@Size(min=3, max=10, message = "Password must be between 3-10 character length")
	private String password;
	
	@NotEmpty
	private String about;
}
