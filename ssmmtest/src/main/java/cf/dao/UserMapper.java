package cf.dao;

import cf.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String stuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String stuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}