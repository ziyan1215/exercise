package ly.service;

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
	

}
