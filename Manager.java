package com.cooguo.cooguohome.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_manager")
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/**
	 * 管理员ID，唯一主键
	 */
	private int id;

	@Column(name = "username")
	/**
	 * 登录用户名，唯一
	 */
	private String username;

	@Column(name="account_name")
	/**
	 * 用户名, 例如开发者姓名
	 */
	private String accountname;
	
	@Column(name = "password")
	/**
	 * 登录密码
	 */
	private String password;
	
	@Column(name="menus")
	/**
	 * 菜单权限，如：1,2,8
	 */
	private String menus;
	@Column(name="usertype")
	/**
	 * 用户类型 1:管理员, 2:客户, 3:商务人员, 4:广告平台客户 默认1
	 */
	private int usertype;
	
	/**
	 * 1:内部员工, 2:手机厂家
	 */
	@Column(name="userscope")
	private int userscope=1;
	
	/**
	 * 项目ID(;分隔),如100008;100034
	 */
	@Column(name="projectids")
	private String projectIds;
	/**
	 * 广告平台客户包名
	 */
	@Column(name="package_name")
	private String packageName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMenus() {
		return menus;
	}

	public void setMenus(String menus) {
		this.menus = menus;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public int getUserscope() {
		return userscope;
	}

	public void setUserscope(int userscope) {
		this.userscope = userscope;
	}

	public String getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(String projectIds) {
		this.projectIds = projectIds;
	}
}
