package ly.service;

import java.util.UUID;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ly.entity.User;
import ly.mapper.UserMapper;

@Service("userService")
public class userServiceImpl implements UserService {

	
	private UserMapper userMapper;
		
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	//通过Spring注入
	@Autowired  
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}



	public User getUserByID(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
	
	public Boolean login(String uname,String upassword){
		String un = uname;
		String pw = upassword;
		System.out.println(un+pw);
		
		User Result =userMapper.selectByPrimaryName(un);
		System.out.println(Result.toString());
		System.out.println(Result.getPassword());
		if(Result.getPassword().equals(pw)){
			return true;
		}
		//System.out.println(Result.toString());
		return false;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		User addUser = new User();
		addUser.setUserName(user.getUserName());
		addUser.setPassword(user.getPassword());
		
		System.out.println(userMapper.insert(addUser));
		
		System.out.println(addUser.getUserId());
		//获取前端传来的注册信息。然后新增用户
		//通过新增后的关联主键来获取主键
		//通过主键关联创建分类用户
		return null;
	}
	

}
