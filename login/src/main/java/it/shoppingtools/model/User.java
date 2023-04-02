package it.shoppingtools.model;

import javax.management.relation.Role;
import javax.persistence.Entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
	public enum Usertype {
		ADMIN,
		CONSULENT,
		COMPANY
	}
	@Id
	private String id;
	
	@Column(unique = true)
	private String username;

	private Set<Role> roles;

	private String password;

	private Usertype usertype;

	private String email;

	private String phoneNumber;
}
