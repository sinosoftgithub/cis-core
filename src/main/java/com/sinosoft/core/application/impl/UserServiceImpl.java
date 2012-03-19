package com.sinosoft.core.application.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.plexus.util.StringUtils;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinosoft.core.application.UserService;
import com.sinosoft.core.domain.model.user.User;
import com.sinosoft.core.domain.model.user.dao.UserDAO;
import com.sinosoft.core.interfaces.util.DataGridModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO = new UserDAO();

	@Transactional
	public List<User> loadUser() {
		return (List<User>) userDAO.loadAll();
	}

	@Transactional
	public Map<String, Object> getPageList(DataGridModel dgm, User user) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>(2);
		String countQuery = "select count(*) from User user where 1=1 ";
		String fullQuery = "select new map(user as user,user.id as uid) from User user where 1=1 ";
		// 这里需要用new map()，jquery easyui datagrid有一个小bug，必须把idField单独列出来，要不然不能多选
		String orderString = "";
		if (StringUtils.isNotBlank(dgm.getSort()))
			orderString = " order by " + dgm.getSort() + " " + dgm.getOrder(); // 排序
		// 增加条件
		StringBuffer sb = new StringBuffer();
		Map<String, Object> params = new HashMap<String, Object>();

		if (user != null) {
			if (StringUtils.isNotBlank(user.getUsername())) {
				sb.append(" and user.Username like :Username");
				params.put("Username", "%" + user.getUsername() + "%");
			}
			if (StringUtils.isNotBlank(user.getUsercode())) {
				sb.append(" and user.Usercode = :Usercode");
				params.put("Usercode", user.getUsercode());
			}
		}
		// 查询总数可以用getHibernateTemplate()，我下面用的是createQuery
		// Hibernate的动态条件查询用DetachedCriteria是一个比较好的解决
		// List totalList = getHibernateTemplate().findByNamedParam(countQuery,
		// params.keySet().toArray(new String[0]), params.values().toArray());
		// int total = ((Long)totalList.iterator().next()).intValue();

		Query queryTotal = userDAO.getSessionFactory().getCurrentSession()
				.createQuery(countQuery + sb.toString());
		Query queryList = userDAO.getSessionFactory().getCurrentSession()
				.createQuery(fullQuery + sb.toString() + orderString)
				.setFirstResult((dgm.getPage() - 1) * dgm.getRows()).setMaxResults(dgm.getRows());
		if (params != null && !params.isEmpty()) {
			Iterator<String> it = params.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				queryTotal.setParameter(key, params.get(key));
				queryList.setParameter(key, params.get(key));
			}
		}
		int total = ((Long) queryTotal.uniqueResult()).intValue(); // 这里必须先转成Long再取intValue，不能转成Integer

		List list = queryList.list();
		result.put("total", total);
		result.put("rows", list);

		return result;
	}

	@Transactional
	public User findByProperty(String propertyName, Object value) throws Exception {
		List<User> list = userDAO.findByNamedQuery(propertyName, value);
		return list == null || list.size() == 0 ? null : (User) list.get(0);
	}

	@Transactional
	public void addUser(User user) {
		userDAO.save(user);
	}

	@Transactional
	public void updateUser(User user) {
		userDAO.update(user);
	}

	@Transactional
	public void saveOrUpdateUser(User user) {
		userDAO.saveOrUpdate(user);
	}

	@Transactional
	public void deleteUser(User user) {
		userDAO.delete(user);
	}

	@Transactional
	public void deleteUser(List<Long> uid) {
		for (Long id : uid) {
			User user = new User();
			user.setId(id);
			userDAO.delete(user);
		}

	}

	@Transactional
	public void addMenu(String menuName, String menuCode, String url) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void addMenuGroup(String groupName, String groupCode) {
		// TODO Auto-generated method stub

	}

}
