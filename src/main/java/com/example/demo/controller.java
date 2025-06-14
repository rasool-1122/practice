package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class controller {

	@GetMapping("test1")
	@PreAuthorize("hasRole('user')")
	public String test1() {
		return "test1";
	}
	@GetMapping("test2")
	@PreAuthorize("hasRole('admin')")
	public String test2() {
		return "test2";
	}
	@PreAuthorize("hasRole('manager')")
	@GetMapping("test3")
	public String test3() {
		return "test3";
	}
}
