package com.xz.myo2o.web.shop;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/shop")
public class AdminController {
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	private String register() {
		return "shop/register";
	}
	
	@RequestMapping(value = "/ownerlogin")
	public String ownerLogin(HttpServletRequest request) {
		return "shop/ownerlogin";
	}
}
