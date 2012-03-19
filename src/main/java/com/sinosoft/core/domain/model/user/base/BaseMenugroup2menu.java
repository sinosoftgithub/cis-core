package com.sinosoft.core.domain.model.user.base;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * This is an object that contains data related to the menugroup2menu table. Do
 * not modify this class because it will be overwritten if the configuration
 * file related to this class is modified.
 * 
 * @hibernate.class table="menugroup2menu"
 */

public abstract class BaseMenugroup2menu implements Serializable {

	public static String REF = "Menugroup2menu";

	public static String PROP_MENU = "Menu";

	public static String PROP_ID = "Id";

	public static String PROP_MENUGROUP = "Menugroup";

	// constructors
	public BaseMenugroup2menu() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenugroup2menu(java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// many to one
	private com.sinosoft.core.domain.model.user.Menu menu;

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
	 * Return the value associated with the column: menu_id
	 */
	public com.sinosoft.core.domain.model.user.Menu getMenu() {
		return menu;
	}

	/**
	 * Set the value related to the column: menu_id
	 * 
	 * @param menu
	 *            the menu_id value
	 */
	public void setMenu(com.sinosoft.core.domain.model.user.Menu menu) {
		this.menu = menu;
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
		if (!(obj instanceof com.sinosoft.core.domain.model.user.Menugroup2menu))
			return false;
		else {
			com.sinosoft.core.domain.model.user.Menugroup2menu menugroup2menu = (com.sinosoft.core.domain.model.user.Menugroup2menu) obj;
			if (null == this.getId() || null == menugroup2menu.getId())
				return false;
			else
				return (this.getId().equals(menugroup2menu.getId()));
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