package com.google.google;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyConfigurationclass {
//	
	@GetMapping("/form")

	public String main() {
		return "wel.html";
	}
	@GetMapping("/save")
	@ResponseBody
	public String kk(@ModelAttribute Student s)
	{
		return "Student:"+s;
	}
	@GetMapping("/current")
	@ResponseBody
	public String now()
	{
		return"current date";
	}

//	@GetMapping("/Save")
//	@ResponseBody
//	public String save(@RequestParam String name,@RequestParam String email,@RequestParam long phone,@RequestParam String Gender,@RequestParam String select) {
//		return "Name: "+name+"<br>Email: "+email+" <br>Phone: "+phone+"<br>  Gender: "+Gender+"<br> Skills:"+select;
//	}
}
