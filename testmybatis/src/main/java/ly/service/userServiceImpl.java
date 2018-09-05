package ly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ly.dao.UserMapper;
import ly.model.User;

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

}
