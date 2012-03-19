package com.sinosoft.core.domain.model.user.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinosoft.core.domain.model.user.base.BaseMenugroup2menuDAO;

@Repository
public class Menugroup2menuDAO extends BaseMenugroup2menuDAO {

	public Menugroup2menuDAO() {
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}