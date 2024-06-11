 package com.SpringBoot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.SpringBoot.User.User;

public interface UserDao extends CrudRepository<User, Integer> {
	
	//Sql Query (@Query(value = "select * from user u where u.uemail=:e", nativeQuery = true)
	
	@Query(value = "From User u where u.uemail=:e")       //Hql Query
	public List<User> getByUserEmail(@Param("e") String email);

}
