package cf.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cf.model.User;
import cf.service.UserService;

public class JunitTestMybatis {	
	
	private ApplicationContext ac;
	private UserService userSI;
	
	@Before
	public void before() {
		if(ac == null) {
			ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
			userSI = (UserService)ac.getBean("userService");
		}
	}

	@Test
	public void test1() {
		User user = userSI.getUserById("1");
		System.out.println(user.getStuaddress());
	}
}
