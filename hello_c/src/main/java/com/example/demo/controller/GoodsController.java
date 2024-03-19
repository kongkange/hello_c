package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

	@GetMapping("/listgoods")
	public String listGoods() {
		return "상품목록";
	}
}
