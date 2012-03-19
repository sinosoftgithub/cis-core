package com.sinosoft.core.interfaces.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.core.application.UserService;
import com.sinosoft.core.domain.model.user.User;
import com.sinosoft.core.interfaces.util.DataGridModel;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	protected final transient Log log = LogFactory.getLog(UserController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		model.addAttribute("userList", userService.loadUser());
		return "user/list";
	}

	@RequestMapping(value = "/queryList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> queryList(DataGridModel dgm, User user) throws Exception {
		// spring可以自动装配两个对象 会自动的装返回的Map转换成JSON对象
		return userService.getPageList(dgm, user);
	}

	@RequestMapping(value = "/popWindow", method = RequestMethod.GET)
	public String popWindow() throws Exception {
		return "user/popWindow";
	}

	@RequestMapping(value = "/addOrUpdate", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> addOrUpdate(User user) throws Exception {
		// spring会利用jackson自动将返回值封装成JSON对象，比struts2方便了很多
		Map<String, String> map = new HashMap<String, String>();
		try {
			userService.saveOrUpdateUser(user);
			map.put("mes", "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("mes", "操作失败");
			throw e;
		}
		return map;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> delete(@RequestParam("uid") List<Long> uid) throws Exception {
		// spring mvc 还可以将参数绑定为list类型
		Map<String, String> map = new HashMap<String, String>();
		try {

			userService.deleteUser(uid);
			map.put("mes", "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("mes", "删除失败");
			throw e;
		}
		return map;// 重定向
	}
}
