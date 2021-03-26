package com.pack.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.restservice.entity.Member1;
import com.pack.restservice.repository.UserRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/members")
public class MemberController{

@Autowired
private final UserRepository repository;
MemberController(UserRepository repository){
	this.repository=repository;
}

@GetMapping("")
List <Member1> all() {
return repository.findAll();

}

@GetMapping(path = "/{firstName}")
public Member1 find(@PathVariable("firstName") String firstName) {
return repository.findOne(firstName);
}

@PostMapping(consumes = "application/json")
public Member1 create(@RequestBody Member1 member) {
	return repository.save(member);
}

@DeleteMapping(path = "/{memberID}")
public void delete(@PathVariable("memberID") String firstName) {
repository.delete(firstName);
}

@PutMapping(path = "/{memberID}")
public Member1 update(@PathVariable("memberID") String firstName, @RequestBody Member1 member) throws BadHttpRequest {
if (repository.exists(firstName)) {
member.setFirstName(firstName);
return repository.save(member);
} else
{
	
throw new BadHttpRequest();

}
}

}