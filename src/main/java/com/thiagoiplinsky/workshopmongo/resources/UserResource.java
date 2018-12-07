package com.thiagoiplinsky.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagoiplinsky.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users") 
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User thiago = new User("1", "Thiago Iplinsky", "thiago.iplinsky19@hotmail.com");
		User izabel = new User("2", "Ana Izabel", "anaiplinsky@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(thiago, izabel));
		return ResponseEntity.ok().body(list);
	}

}
