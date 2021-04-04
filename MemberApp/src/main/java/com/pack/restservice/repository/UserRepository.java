package com.pack.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;

import com.pack.restservice.entity.Member1;


@RepositoryRestResource(path = "/members")
public interface UserRepository extends JpaRepository<Member1, Integer> {
	//@Query("SELECT SubscriptionID,Relationship from Plan p RIGHT JOIN Member1 m on p.id=m.id")
	//public List<Member1>FindAllWithDescriptionQuery();

	

}
