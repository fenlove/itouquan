package com.project.kernel.entities.plugins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.project.kernel.support.entities.AbstractPersistable;

/**
 * <pre>
 * 配置信息
 * 用户自定义的参数信息。
 * 用于存放用户自定义的参数，如果：样式、签名、快速导航等信息
 * 
 * </pre>
 * 
 * @author fenlove
 * 
 */
@Entity
@Table(name = "T_CONFIG")
public class ConfigEntity extends AbstractPersistable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3770633474653021803L;
	/**
	 * <pre>
	 * id=0时,表示该配置信息为系统的配置信息.
	 * 特定的用户，该配置参数信息属于某一个用户.
	 * </pre>
	 */
	@Column(name = "C_UID")
	private long uid;
	
	@Column(name = "C_TYPE", length = 32)
	private String type;
	
	@Column(name = "C_KEY", length = 32)
	private String key;
	
	@Column(name = "C_VALUE")
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}
	
}