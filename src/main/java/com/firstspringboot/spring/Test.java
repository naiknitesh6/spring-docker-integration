package com.firstspringboot.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller
//@ResponseBody
//public class Test 
//{
//	@RequestMapping("/test")
//	public String Testing()
//	{
//	return "Connected0----)ewkqw";
//	}
//
//}
@RestController
public class Test
{@GetMapping("/home")
	public String home()
	{
		return "Docker project";
	}
}