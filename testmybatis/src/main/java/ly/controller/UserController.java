package ly.controller;

import javax.servlet.http.HttpServletRequest;

import ly.model.User;
import ly.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/user",produces="text/html;charset=UTF-8")
//@RequestMapping("/user")

public class UserController {
	private UserService userService ;
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/login")
	@ResponseBody
	public String excute(String uname,String upassword){
		//调用服务来校验用户名密码是否正确
		Boolean result = userService.login(uname,upassword);	
		if(result==true){
			System.out.println("tiaozhuan");
		return "success";
		}else
		return "forward:fail";
	}
	
	@RequestMapping("/register")
	public String register(){
			
		return "register";
	}
}
