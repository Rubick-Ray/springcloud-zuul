package com.init.springCloud;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@RequestMapping(value = "/search/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Person searchPerson(@PathVariable Integer id){
		Person person = new Person();
		person.setId(id);
		person.setName("Spirit");
		return person;
	}
	
}
