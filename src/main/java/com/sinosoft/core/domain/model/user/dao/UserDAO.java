package com.sinosoft.core.domain.model.user.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinosoft.core.domain.model.user.base.BaseUserDAO;

@Repository
public class UserDAO extends BaseUserDAO {

	public UserDAO() {
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}