package br.com.emersonluiz.https.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldResource {

	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		return "Hello World!!!";
	}
}
