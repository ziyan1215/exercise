package ly.mapper;

import po.Tuser;

public interface TuserMapper {
	/**
	 * 通过用户ID找用户信息
	 */
	public String findById(int id);
	/**
	 * 添加用户
	 * @param user
	 */
	public int addUser(Tuser user);
	/**
	 * 根据主键删除用户
	 */
	public void deleteUserById(int id);
	
}
