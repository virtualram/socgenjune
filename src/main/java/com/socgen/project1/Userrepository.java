package com.socgen.project1;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface Userrepository extends JpaRepository<User,Integer>{
	
	

}
