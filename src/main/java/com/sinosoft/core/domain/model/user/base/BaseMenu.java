package com.sinosoft.core.domain.model.user.base;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * This is an object that contains data related to the menu table. Do not modify
 * this class because it will be overwritten if the configuration file related
 * to this class is modified.
 * 
 * @hibernate.class table="menu"
 */

public abstract class BaseMenu implements Serializable {

	public static String REF = "Menu";

	public static String PROP_URL = "Url";

	public static String PROP_MENUNAME = "Menuname";

	public static String PROP_ID = "Id";

	public static String PROP_MENUCODE = "Menucode";

	// constructors
	public BaseMenu() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenu(java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.lang.String menucode;

	private java.lang.String menuname;

	private java.lang.String url;

	// collections
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
	 * Return the value associated with the column: menucode
	 */
	public java.lang.String getMenucode() {
		return menucode;
	}

	/**
	 * Set the value related to the column: menucode
	 * 
	 * @param menucode
	 *            the menucode value
	 */
	public void setMenucode(java.lang.String menucode) {
		this.menucode = menucode;
	}

	/**
	 * Return the value associated with the column: menuname
	 */
	public java.lang.String getMenuname() {
		return menuname;
	}

	/**
	 * Set the value related to the column: menuname
	 * 
	 * @param menuname
	 *            the menuname value
	 */
	public void setMenuname(java.lang.String menuname) {
		this.menuname = menuname;
	}

	/**
	 * Return the value associated with the column: url
	 */
	public java.lang.String getUrl() {
		return url;
	}

	/**
	 * Set the value related to the column: url
	 * 
	 * @param url
	 *            the url value
	 */
	public void setUrl(java.lang.String url) {
		this.url = url;
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
		if (!(obj instanceof com.sinosoft.core.domain.model.user.Menu))
			return false;
		else {
			com.sinosoft.core.domain.model.user.Menu menu = (com.sinosoft.core.domain.model.user.Menu) obj;
			if (null == this.getId() || null == menu.getId())
				return false;
			else
				return (this.getId().equals(menu.getId()));
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