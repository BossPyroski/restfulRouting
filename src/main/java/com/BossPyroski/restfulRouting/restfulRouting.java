package com.BossPyroski.restfulRouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class restfulRouting {
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was dope-a-rope, beez-kneez";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java is weirdly simple and I just think thats neat";
	}
}
//public class DojoController {}
