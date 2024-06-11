package com.SpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Repository.UserDao;
import com.SpringBoot.User.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDao ud;
	
	//to insert user
	public User insert(User u) {
		User u1 = ud.save(u);
		return u1;
	}
	
	//to get user using email
	public List<User> getuserbyemail(String em) {
		List<User> u2 = ud.getByUserEmail(em);
		return u2;
	}

}
