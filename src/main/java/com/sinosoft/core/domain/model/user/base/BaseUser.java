package com.sinosoft.core.domain.model.user.base;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * This is an object that contains data related to the user table. Do not modify
 * this class because it will be overwritten if the configuration file related
 * to this class is modified.
 * 
 * @hibernate.class table="user"
 */

public abstract class BaseUser implements Serializable {

	public static String REF = "User";

	public static String PROP_USERNAME = "Username";

	public static String PROP_ID = "Id";

	public static String PROP_USERCODE = "Usercode";

	// constructors
	public BaseUser() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUser(java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.lang.String usercode;

	private java.lang.String username;

	// collections
	private java.util.Set<com.sinosoft.core.domain.model.user.User2menugroup> user2menugroups;

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
	 * Return the value associated with the column: usercode
	 */
	public java.lang.String getUsercode() {
		return usercode;
	}

	/**
	 * Set the value related to the column: usercode
	 * 
	 * @param usercode
	 *            the usercode value
	 */
	public void setUsercode(java.lang.String usercode) {
		this.usercode = usercode;
	}

	/**
	 * Return the value associated with the column: username
	 */
	public java.lang.String getUsername() {
		return username;
	}

	/**
	 * Set the value related to the column: username
	 * 
	 * @param username
	 *            the username value
	 */
	public void setUsername(java.lang.String username) {
		this.username = username;
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

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof com.sinosoft.core.domain.model.user.User))
			return false;
		else {
			com.sinosoft.core.domain.model.user.User user = (com.sinosoft.core.domain.model.user.User) obj;
			if (null == this.getId() || null == user.getId())
				return false;
			else
				return (this.getId().equals(user.getId()));
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