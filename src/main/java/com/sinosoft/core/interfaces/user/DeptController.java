package com.sinosoft.core.interfaces.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinosoft.core.application.UserService;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private UserService userService;

	// @RequestMapping(value="/queryAll")
	// @ResponseBody
	// public Map<String, Object> queryAll() throws Exception{
	// return userService.getAllJson(); // 可以返回map
	// }
	

}
