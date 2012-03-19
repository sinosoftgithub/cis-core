package com.sinosoft.core.domain.model.user.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinosoft.core.domain.model.user.base.BaseUser2menugroupDAO;

@Repository
public class User2menugroupDAO extends BaseUser2menugroupDAO {

	public User2menugroupDAO() {
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}