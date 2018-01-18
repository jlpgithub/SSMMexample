package cf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cf.dao.UserMapper;
import cf.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}



	@Override
	public User getUserById(String stuid) {
		return userMapper.selectByPrimaryKey(stuid);

	}

}
