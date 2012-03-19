package com.sinosoft.core.domain.model.user.base;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * This is an object that contains data related to the user2menugroup table. Do
 * not modify this class because it will be overwritten if the configuration
 * file related to this class is modified.
 * 
 * @hibernate.class table="user2menugroup"
 */

public abstract class BaseUser2menugroup implements Serializable {

	public static String REF = "User2menugroup";

	public static String PROP_USER = "User";

	public static String PROP_ID = "Id";

	public static String PROP_MENUGROUP = "Menugroup";

	// constructors
	public BaseUser2menugroup() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUser2menugroup(java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// many to one
	private com.sinosoft.core.domain.model.user.User user;

	private com.sinosoft.core.domain.model.user.Menugroup menugroup;

	/**
	 * Return the unique identifier of this class
	 * 
	 * @hibernate.id generator-class="native" column="id"
	 */
	public java.lang.Long getId() {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * 
	 * @param id
	 *            the new ID
	 */
	public void setId(java.lang.Long id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
	 * Return the value associated with the column: user_id
	 */
	public com.sinosoft.core.domain.model.user.User getUser() {
		return user;
	}

	/**
	 * Set the value related to the column: user_id
	 * 
	 * @param user
	 *            the user_id value
	 */
	public void setUser(com.sinosoft.core.domain.model.user.User user) {
		this.user = user;
	}

	/**
	 * Return the value associated with the column: menugroup_id
	 */
	public com.sinosoft.core.domain.model.user.Menugroup getMenugroup() {
		return menugroup;
	}

	/**
	 * Set the value related to the column: menugroup_id
	 * 
	 * @param menugroup
	 *            the menugroup_id value
	 */
	public void setMenugroup(com.sinosoft.core.domain.model.user.Menugroup menugroup) {
		this.menugroup = menugroup;
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof com.sinosoft.core.domain.model.user.User2menugroup))
			return false;
		else {
			com.sinosoft.core.domain.model.user.User2menugroup user2menugroup = (com.sinosoft.core.domain.model.user.User2menugroup) obj;
			if (null == this.getId() || null == user2menugroup.getId())
				return false;
			else
				return (this.getId().equals(user2menugroup.getId()));
		}
	}

	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public String toString() {
		return super.toString();
	}

}