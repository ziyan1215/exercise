package ly.mapper;

import ly.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);
    
    User selectByPrimaryName(String name);
   
   
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}