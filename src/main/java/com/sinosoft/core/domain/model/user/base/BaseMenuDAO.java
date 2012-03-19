package com.sinosoft.core.domain.model.user.base;

import com.sinosoft.core.domain.model.user.dao.MenuDAO;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseMenuDAO extends com.sinosoft.core.domain.model.user.dao._RootDAO {

	public BaseMenuDAO() {
	}

	// query name references

	public static MenuDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static MenuDAO getInstance() {
		if (null == instance)
			instance = new com.sinosoft.core.domain.model.user.dao.MenuDAO();
		return instance;
	}

	public Class getReferenceClass() {
		return com.sinosoft.core.domain.model.user.Menu.class;
	}

	/**
	 * Cast the object as a com.sinosoft.core.domain.model.user.Menu
	 */
	public com.sinosoft.core.domain.model.user.Menu cast(Object object) {
		return (com.sinosoft.core.domain.model.user.Menu) object;
	}

	public com.sinosoft.core.domain.model.user.Menu load(java.lang.Long key)
			throws org.springframework.dao.DataAccessException {
		return (com.sinosoft.core.domain.model.user.Menu) load(getReferenceClass(), key);
	}

	public com.sinosoft.core.domain.model.user.Menu get(java.lang.Long key)
			throws org.springframework.dao.DataAccessException {
		return (com.sinosoft.core.domain.model.user.Menu) get(getReferenceClass(), key);
	}

	public java.util.List loadAll() throws org.springframework.dao.DataAccessException {
		return loadAll(getReferenceClass());
	}

	/**
	 * Persist the given transient instance, first assigning a generated
	 * identifier. (Or using the current value of the identifier property if the
	 * assigned generator is used.)
	 * 
	 * @param menu
	 *            a transient instance of a persistent class
	 * @return the class identifier
	 */
	public java.lang.Long save(com.sinosoft.core.domain.model.user.Menu menu)
			throws org.springframework.dao.DataAccessException {
		return (java.lang.Long) super.save(menu);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of
	 * its identifier property. By default the instance is always saved. This
	 * behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping.
	 * 
	 * @param menu
	 *            a transient instance containing new or updated state
	 */
	public void saveOrUpdate(com.sinosoft.core.domain.model.user.Menu menu)
			throws org.springframework.dao.DataAccessException {
		saveOrUpdate((Object) menu);
	}

	/**
	 * Update the persistent state associated with the given identifier. An
	 * exception is thrown if there is a persistent instance with the same
	 * identifier in the current session.
	 * 
	 * @param menu
	 *            a transient instance containing updated state
	 */
	public void update(com.sinosoft.core.domain.model.user.Menu menu)
			throws org.springframework.dao.DataAccessException {
		update((Object) menu);
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
	 * @param menu
	 *            the instance to be removed
	 */
	public void delete(com.sinosoft.core.domain.model.user.Menu menu)
			throws org.springframework.dao.DataAccessException {
		delete((Object) menu);
	}

}