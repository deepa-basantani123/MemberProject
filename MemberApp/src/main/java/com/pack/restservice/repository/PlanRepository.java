package com.pack.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;

import com.pack.restservice.entity.Plan;


@RepositoryRestResource(path = "/plans")
public interface PlanRepository extends JpaRepository<Plan, Integer> {

}

