package com.sinosoft.core.domain.model.user.base;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * This is an object that contains data related to the menugroup table. Do not
 * modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * 
 * @hibernate.class table="menugroup"
 */

public abstract class BaseMenugroup implements Serializable {

	public static String REF = "Menugroup";

	public static String PROP_GROUPCODE = "Groupcode";

	public static String PROP_ID = "Id";

	public static String PROP_GROUPNAME = "Groupname";

	// constructors
	public BaseMenugroup() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenugroup(java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.lang.String groupcode;

	private java.lang.String groupname;

	// collections
	private java.util.Set<com.sinosoft.core.domain.model.user.User2menugroup> user2menugroups;

	private java.util.Set<com.sinosoft.core.domain.model.user.Menugroup2menu> menugroup2menus;

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
	 * Return the value associated with the column: groupcode
	 */
	public java.lang.String getGroupcode() {
		return groupcode;
	}

	/**
	 * Set the value related to the column: groupcode
	 * 
	 * @param groupcode
	 *            the groupcode value
	 */
	public void setGroupcode(java.lang.String groupcode) {
		this.groupcode = groupcode;
	}

	/**
	 * Return the value associated with the column: groupname
	 */
	public java.lang.String getGroupname() {
		return groupname;
	}

	/**
	 * Set the value related to the column: groupname
	 * 
	 * @param groupname
	 *            the groupname value
	 */
	public void setGroupname(java.lang.String groupname) {
		this.groupname = groupname;
	}

	@JsonIgnore
	/**
	 * Return the value associated with the column: User2menugroups
	 */
	public java.util.Set<com.sinosoft.core.domain.model.user.User2menugroup> getUser2menugroups() {
		return user2menugroups;
	}

	/**
	 * Set the value related to the column: User2menugroups
	 * 
	 * @param user2menugroups
	 *            the User2menugroups value
	 */
	public void setUser2menugroups(
			java.util.Set<com.sinosoft.core.domain.model.user.User2menugroup> user2menugroups) {
		this.user2menugroups = user2menugroups;
	}

	public void addToUser2menugroups(
			com.sinosoft.core.domain.model.user.User2menugroup user2menugroup) {
		if (null == getUser2menugroups())
			setUser2menugroups(new java.util.TreeSet<com.sinosoft.core.domain.model.user.User2menugroup>());
		getUser2menugroups().add(user2menugroup);
	}

	@JsonIgnore
	/**
	 * Return the value associated with the column: Menugroup2menus
	 */
	public java.util.Set<com.sinosoft.core.domain.model.user.Menugroup2menu> getMenugroup2menus() {
		return menugroup2menus;
	}

	/**
	 * Set the value related to the column: Menugroup2menus
	 * 
	 * @param menugroup2menus
	 *            the Menugroup2menus value
	 */
	public void setMenugroup2menus(
			java.util.Set<com.sinosoft.core.domain.model.user.Menugroup2menu> menugroup2menus) {
		this.menugroup2menus = menugroup2menus;
	}

	public void addToMenugroup2menus(
			com.sinosoft.core.domain.model.user.Menugroup2menu menugroup2menu) {
		if (null == getMenugroup2menus())
			setMenugroup2menus(new java.util.TreeSet<com.sinosoft.core.domain.model.user.Menugroup2menu>());
		getMenugroup2menus().add(menugroup2menu);
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof com.sinosoft.core.domain.model.user.Menugroup))
			return false;
		else {
			com.sinosoft.core.domain.model.user.Menugroup menugroup = (com.sinosoft.core.domain.model.user.Menugroup) obj;
			if (null == this.getId() || null == menugroup.getId())
				return false;
			else
				return (this.getId().equals(menugroup.getId()));
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