package ly.service;

import ly.model.User;

public interface UserService {
	public User getUserByID(Integer id);
	public Boolean login(String uname,String upassword);
}
