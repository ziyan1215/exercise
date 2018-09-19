package ly.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import po.UserMysql;

public class ItemList2 implements HttpRequestHandler  {

	@Override
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<UserMysql> itemsList = new ArrayList<UserMysql>();
		
		UserMysql user = new UserMysql();
		user.setUser_id(123);
		user.setUser_name("admin");
		
		UserMysql user2 = new UserMysql();
		user2.setUser_id(123);
		user2.setUser_name("xuziyan");
	
		
		itemsList.add(user);
		itemsList.add(user2);
		
		// 填充数据
		request.setAttribute("itemsList", itemsList);
		
		// 视图
		request.getRequestDispatcher("WEB-INF/jsp/itermsList.jsp").forward(request, response);
		
		
/*		从上边可以看出此适配器器的handleRequest方法没有返回ModelAndView，可通过response修改定义响应内容，比如返回json数据：

		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("json串");*/
		
	}
	
	

/*	@Override
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
			
	}*/

}
