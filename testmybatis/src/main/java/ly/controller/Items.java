package ly.controller;

import javax.servlet.http.HttpServletRequest;

import ly.model.UserModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/items")
public class Items {
	
	//获取参数的方式
	//测试url： http://localhost:8888/items/query1.action?id=2&name=xuzi
	
	@RequestMapping("query")
	public String query(HttpServletRequest request){
		
		System.out.println(request.getParameter("name"));
		
		return "query/query";
	}
	
	@RequestMapping("query1")
	public String query(String name,Integer id){
		
		System.out.println("get 请求的参数为name:"+name+"id:"+id);
		
		return "query/query";
	}
	
	//这种方式要先讲UserModel装载进上下文中
	@RequestMapping("/query2")
	public String query(UserModel user){
		
		System.out.println(user.toString());
		
		return "query/query";
	}
	
	/**
     * 4、通过@PathVariable获取路径中的参数
      * @param username
     * @param password
     * @return
     * 例如，访问http://localhost/SSMDemo/demo/addUser4/lixiaoxi/111111 路径时，则自动将URL中模板变量{username}和{password}绑定到通过@PathVariable注解的同名参数上，即入参后username=lixiaoxi、password=111111。
     */
	//测试url  http://localhost:8888/items/query3/xuzi/1.action
    @RequestMapping(value="/query3/{name}/{id}",method=RequestMethod.GET)
    public String addUser4(@PathVariable String name,@PathVariable Integer id) {
        System.out.println("username is:"+name);
        System.out.println("password is:"+id);
        return "query/query";
    }
	
    
	@RequestMapping("queryForm")
	public String queryForm(){	
		return "query/form";
	}
    
	/**
     * 5、使用@ModelAttribute注解获取POST请求的FORM表单数据
      * @param user
     * @return
     */
    @RequestMapping(value="/queryformpost",method=RequestMethod.POST)
    public String addUser5(@ModelAttribute("user") UserModel user) {
    	System.out.println("queryformpost");
        System.out.println("username is:"+user.getName());
        System.out.println("password is:"+user.getId());
        return "success";  
    }
    
    /**
     * 6、用注解@RequestParam绑定请求参数到方法入参
      * @param username
     * @param password
     * @return
     * http://localhost:8888/items/query5.action?name=xuzi&id=4
     */
    @RequestMapping(value="/query5",method=RequestMethod.GET)
    public String addUser6(@RequestParam("name" ) String name,@RequestParam(value="id" ,required=false) Integer id) {
        System.out.println("username is:"+name);
        System.out.println("password is:"+id);
        return "/success";
    }
    

}
