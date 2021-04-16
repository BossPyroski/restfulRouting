package com.BossPyroski.restfulRouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping("/{variableInput}")
	public String showLocation(@PathVariable("variableInput") String variableInput) {
		System.out.println(variableInput);
		if(variableInput.equals("dojo")) {
			return "The Dojo is awesomesace!";
		
		}else if (variableInput.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		
		}else if (variableInput.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}else {
			return "You need to specify what you're looking for in the input route!";
		}
	}
}
	

		
		


	


	

//@RequestMapping("/m/{track}/{module}/{lesson}")
//public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
//	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;