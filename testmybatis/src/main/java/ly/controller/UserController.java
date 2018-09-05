package ly.controller;

import javax.servlet.http.HttpServletRequest;

import ly.model.User;
import ly.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/userController")
public class UserController {
	private UserService userService ;
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/showUser/{id}")
	public String showUser(@PathVariable Integer id,HttpServletRequest restqust){
		User u =userService.getUserByID(id);
		restqust.setAttribute("user", u.getUserName());
		return "showUser";
	}
}
