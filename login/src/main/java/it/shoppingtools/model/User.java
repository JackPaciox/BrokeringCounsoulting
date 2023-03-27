package it.shoppingtools.model;

import javax.persistence.Entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
	
	private String password;

	private Usertype usertype;
	
}
