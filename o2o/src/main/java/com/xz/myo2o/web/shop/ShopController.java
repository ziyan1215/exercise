package com.xz.myo2o.web.shop;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		String resultString = "{\"result\":true}"; //注意一定是双引号 "{\"result\":\"success\"}"
		return resultString;
	}
	
	@RequestMapping("/uploadtest")
	public String uploadTest(MultipartFile file, HttpSession session) {
		System.out.println("upload");
		/*// 文件不为空
	    if(!file.isEmpty()) {
	        // 文件存放路径
	        String path = request.getServletContext().getRealPath("/");
	        // 文件名称
	        String name = String.valueOf(new Date().getTime()+"_"+file.getOriginalFilename());
	        File destFile = new File(path,name);
	        // 转存文件
	        try {
	            file.transferTo(destFile);
	        } catch (IllegalStateException | IOException e) {
	            e.printStackTrace();
	        }
	        // 访问的url
	        String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ request.getContextPath() + "/" + name; 
	    }        
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("uploadSuccess");*/
	    return "index";
		
		
	}
	
}
