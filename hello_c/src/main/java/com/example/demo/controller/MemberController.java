package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MemberController {
	@GetMapping("/listMember")
	public String listMember() {
		return "회원목록";
	}
}
