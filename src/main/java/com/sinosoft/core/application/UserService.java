package com.sinosoft.core.application;

import java.util.List;
import java.util.Map;

import com.sinosoft.core.domain.model.user.User;
import com.sinosoft.core.interfaces.util.DataGridModel;

/**
 * user admin
 */
public interface UserService {

	List<User> loadUser();

	void addUser(User user);

	void updateUser(User user);

	void saveOrUpdateUser(User user);

	void deleteUser(User user);

	void deleteUser(List<Long> uid);

	void addMenu(String menuName, String menuCode, String url);

	void addMenuGroup(String groupName, String groupCode);

	User findByProperty(String propertyName, Object value) throws Exception;

	Map<String, Object> getPageList(DataGridModel dgm, User user) throws Exception;

}
