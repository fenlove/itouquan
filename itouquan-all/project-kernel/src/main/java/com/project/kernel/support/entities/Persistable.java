package com.project.kernel.support.entities;

import java.io.Serializable;

/**
 * <pre>
 * 所有数据的实体，都应该继承该接口;
 * 该接口用于定义数据实体的规范。
 * </pre>
 * @author fenlove
 */
public interface Persistable extends Serializable {

	/**
	 * 实体在数据库中的ID,唯一值。
	 * @return ID
	 */
	Long getId();
	
	void setId(Long id);
	
	boolean isNew();
}
