package ly.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.servlet.http.HttpServletRequest;

import ly.entity.User;
import ly.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	//@ResponseBody
	public String excute(String uname,String upassword){
		//调用服务来校验用户名密码是否正确
		Boolean result = userService.login(uname,upassword);
		if(result==true){
			return "forward:showuser.action"; //用forward转发时，这里要加。action后缀
		}
		return "fail";

	}
	
	//注册
	@RequestMapping("/register")
	public String register(){		
		return "register";
	}
	//showUser
	@RequestMapping("/showuser")
	public String showuser(HttpServletRequest http,Model model){
		String username =http.getParameter("uname");
		User user= new User();
		user.setUserName(username);
		System.out.println("/showuser");
		 model.addAttribute(user);
		return "showuser";
	}
}
