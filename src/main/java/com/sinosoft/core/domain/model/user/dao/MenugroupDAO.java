package com.sinosoft.core.domain.model.user.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinosoft.core.domain.model.user.base.BaseMenugroupDAO;

@Repository
public class MenugroupDAO extends BaseMenugroupDAO {

	public MenugroupDAO() {
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}