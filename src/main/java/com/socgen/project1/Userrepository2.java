package com.socgen.project1;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface Userrepository2 extends CrudRepository<User,Integer>{
	

}

