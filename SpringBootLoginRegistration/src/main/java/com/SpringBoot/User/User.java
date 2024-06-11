package com.SpringBoot.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	@NotBlank(message = "user name should not be blank")
	@Size(min = 3,max = 20,message = "user name should be in 3-20 characters")
	private String uname;
	private String uemail;
	private String upassword;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String uname, String uemail, String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.upassword = upassword;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword + "]";
	}
	
	
	
}
