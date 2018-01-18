package cf.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cf.model.User;
import cf.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	private static final Logger logger =Logger.getLogger(UserController.class);
	
	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	//localhost:8080/ssmmtest/user/getuserinfo2.do?stuid=2
	@RequestMapping("/getuserinfo2")
	public String getUserInfo2(String stuid,HttpServletRequest request) {
		User user = userService.getUserById(stuid);
		request.setAttribute("user", user);
		
		return "getUserInfo";
	}
	
	//localhost:8080/ssmmtest/user/1/getuserinfo.do
	@RequestMapping("/{stuid}/getuserinfo")
	public String getUserInfo(@PathVariable String stuid,HttpServletRequest request) {
		User user = userService.getUserById(stuid);
		request.setAttribute("user", user);
		
		logger.info("**********"+user.getStuname());
		
		return "getUserInfo";
	}
	

}
