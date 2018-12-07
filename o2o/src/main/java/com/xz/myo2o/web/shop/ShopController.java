package com.xz.myo2o.web.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author 作者
* @version 创建时间：2018年12月6日 下午5:03:43
* 类说明
*/
@Controller
@RequestMapping("/shop")
public class ShopController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/json")
	@ResponseBody
	public String json(Model model,String name) {
		model.addAttribute(name, "sss");
		return "index";
		
	}
	
}
