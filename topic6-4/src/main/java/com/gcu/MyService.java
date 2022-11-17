package com.gcu;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Add a new REST service class named MyService to the project. The class should
 * be marked with the @RestController annotation and @RequestMapping(“/service”)
 * annotation. Add an API named test() that is marked with
 * the @GetMapping(“/test”) annotation, takes a Principal as a method argument.
 * Make sure the Principle class is imported from the java.security package. The
 * implementation should print a "hello" method that also prints the
 * authenticated user's name (by calling the getName() on the Principal method
 * argument).
 *
 * @author jjk14
 *
 */

@RestController
@RequestMapping("/service")
public class MyService {

	@GetMapping("/test")
	public String test(Principal principal) {
		return "hello " + principal.getName();
	}
}
