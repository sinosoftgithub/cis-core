package com.sinosoft.core.domain.model.user.base;

import com.sinosoft.core.domain.model.user.dao.Menugroup2menuDAO;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseMenugroup2menuDAO extends
		com.sinosoft.core.domain.model.user.dao._RootDAO {

	public BaseMenugroup2menuDAO() {
	}

	// query name references

	public static Menugroup2menuDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static Menugroup2menuDAO getInstance() {
		if (null == instance)
			instance = new com.sinosoft.core.domain.model.user.dao.Menugroup2menuDAO();
		return instance;
	}

	public Class getReferenceClass() {
		return com.sinosoft.core.domain.model.user.Menugroup2menu.class;
	}

	/**
	 * Cast the object as a com.sinosoft.core.domain.model.user.Menugroup2menu
	 */
	public com.sinosoft.core.domain.model.user.Menugroup2menu cast(Object object) {
		return (com.sinosoft.core.domain.model.user.Menugroup2menu) object;
	}

	public com.sinosoft.core.domain.model.user.Menugroup2menu load(java.lang.Long key)
			throws org.springframework.dao.DataAccessException {
		return (com.sinosoft.core.domain.model.user.Menugroup2menu) load(getReferenceClass(), key);
	}

	public com.sinosoft.core.domain.model.user.Menugroup2menu get(java.lang.Long key)
			throws org.springframework.dao.DataAccessException {
		return (com.sinosoft.core.domain.model.user.Menugroup2menu) get(getReferenceClass(), key);
	}

	public java.util.List loadAll() throws org.springframework.dao.DataAccessException {
		return loadAll(getReferenceClass());
	}

	/**
	 * Persist the given transient instance, first assigning a generated
	 * identifier. (Or using the current value of the identifier property if the
	 * assigned generator is used.)
	 * 
	 * @param menugroup2menu
	 *            a transient instance of a persistent class
	 * @return the class identifier
	 */
	public java.lang.Long save(com.sinosoft.core.domain.model.user.Menugroup2menu menugroup2menu)
			throws org.springframework.dao.DataAccessException {
		return (java.lang.Long) super.save(menugroup2menu);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of
	 * its identifier property. By default the instance is always saved. This
	 * behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping.
	 * 
	 * @param menugroup2menu
	 *            a transient instance containing new or updated state
	 */
	public void saveOrUpdate(com.sinosoft.core.domain.model.user.Menugroup2menu menugroup2menu)
			throws org.springframework.dao.DataAccessException {
		saveOrUpdate((Object) menugroup2menu);
	}

	/**
	 * Update the persistent state associated with the given identifier. An
	 * exception is thrown if there is a persistent instance with the same
	 * identifier in the current session.
	 * 
	 * @param menugroup2menu
	 *            a transient instance containing updated state
	 */
	public void update(com.sinosoft.core.domain.model.user.Menugroup2menu menugroup2menu)
			throws org.springframework.dao.DataAccessException {
		update((Object) menugroup2menu);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an
	 * instance associated with the receiving Session or a transient instance
	 * with an identifier associated with existing persistent state.
	 * 
	 * @param id
	 *            the instance ID to be removed
	 */
	public void delete(java.lang.Long id) throws org.springframework.dao.DataAccessException {
		delete((Object) load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an
	 * instance associated with the receiving Session or a transient instance
	 * with an identifier associated with existing persistent state.
	 * 
	 * @param menugroup2menu
	 *            the instance to be removed
	 */
	public void delete(com.sinosoft.core.domain.model.user.Menugroup2menu menugroup2menu)
			throws org.springframework.dao.DataAccessException {
		delete((Object) menugroup2menu);
	}

}