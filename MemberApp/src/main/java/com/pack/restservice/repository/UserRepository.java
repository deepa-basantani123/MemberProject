package com.pack.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;

import com.pack.restservice.entity.Member1;


@RepositoryRestResource(path = "/members")
public interface UserRepository extends JpaRepository<Member1, String> {

}
