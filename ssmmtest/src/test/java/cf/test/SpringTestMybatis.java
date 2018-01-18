package cf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cf.model.User;
import cf.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class SpringTestMybatis {

	private UserService userSI;
	public UserService getUserSI() {
		return userSI;
	}
	@Autowired
	public void setUserSI(UserService userSI) {
		this.userSI = userSI;
	}
	
	@Test
	public void test1() {
		User user = userSI.getUserById("2");
		System.out.println(user.getStuaddress());
	}
}
