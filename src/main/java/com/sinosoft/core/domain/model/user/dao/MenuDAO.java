package com.sinosoft.core.domain.model.user.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinosoft.core.domain.model.user.base.BaseMenuDAO;

@Repository
public class MenuDAO extends BaseMenuDAO {

	public MenuDAO() {
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}