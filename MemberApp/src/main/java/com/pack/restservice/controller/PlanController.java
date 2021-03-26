package com.pack.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.restservice.entity.Plan;
import com.pack.restservice.repository.PlanRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/plans")
public class PlanController{

@Autowired
private final PlanRepository repository;

PlanController(PlanRepository repository){
	this.repository=repository;
}

@GetMapping("")
List <Plan> all() {
return repository.findAll();
}

@GetMapping(path = "/{firstName}")
public Plan find(@PathVariable("firstName") String firstName) {
return repository.findOne(firstName);
}
}