package ly.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import po.UserMysql;

public class ItemList1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//商品列表
				List<UserMysql> itemsList = new ArrayList<UserMysql>();
				
				UserMysql user = new UserMysql();
				user.setUser_id(123);
				user.setUser_name("admin");
				
				UserMysql user2 = new UserMysql();
				user2.setUser_id(123);
				user2.setUser_name("xuziyan");
			
				
				itemsList.add(user);
				itemsList.add(user2);
				
				//创建modelAndView准备填充数据、设置视图
				ModelAndView modelAndView = new ModelAndView();
				
				//填充数据
				modelAndView.addObject("itemsList", itemsList);
				//视图
				modelAndView.setViewName("WEB-INF/jsp/itermsList");
				
				return modelAndView;
			
	}

}
