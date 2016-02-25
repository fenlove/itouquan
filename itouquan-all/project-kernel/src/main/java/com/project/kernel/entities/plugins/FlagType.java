package com.project.kernel.entities.plugins;

/**
 * <pre>
 * 账户的身份，一般账户的身份确定了将不允许修改
 * </pre>
 * @author fenlove
 *
 */
public enum FlagType {
	/**
	 * 一般的访客("访客")
	 */
	GUEST,
	/**
	 * 客户
	 */
	CUSTOM,
	/**
	 * 一般用户("普通用户")
	 */
	USER,
	/**
	 * 普通的管理员("管理员")
	 */
	ADMIN,
	/**
	 * 超级管理员("超级管理员")
	 */
	SUPER,
	/**
	 * 扩展一
	 */
	EXT_ONE,
	/**
	 * 扩展二
	 */
	EXT_TWO,
	/**
	 * 扩展三
	 */
	EXT_THREE,
	/**
	 * 其他用户("其他用户")
	 */
	OTHER
	
}
