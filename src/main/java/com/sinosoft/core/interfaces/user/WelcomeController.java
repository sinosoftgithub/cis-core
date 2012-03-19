package com.sinosoft.core.interfaces.user;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sinosoft.core.application.UserService;
import com.sinosoft.core.domain.model.user.User;
import com.sinosoft.core.interfaces.util.Constants;

@Controller
@RequestMapping("/welcome")
// 将Model中属性名为Constants.USER_INFO_SESSION的属性放到Session属性列表中，以便这个属性可以跨请求访问
@SessionAttributes(Constants.USER_INFO_SESSION)
public class WelcomeController {

	@Autowired
	private UserService userService;

	protected final transient Log log = LogFactory.getLog(WelcomeController.class);

	@RequestMapping(method = RequestMethod.POST)
	public String helloWorld(User user, ModelMap model) throws Exception {
		User user1 = userService.findByProperty("Username", user.getUsername());
		if (user1 == null) {
			model.addAttribute("message", "用户不存在");
			return "relogin";
		} else {
			model.addAttribute(Constants.USER_INFO_SESSION, user1); // 名为Constants.USER_INFO_SESSION的属性放到Session属性列表中
			return "welcome";
		}
	}
}
