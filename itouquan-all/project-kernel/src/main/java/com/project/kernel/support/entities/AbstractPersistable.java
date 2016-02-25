package com.project.kernel.support.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
/**
 * <pre>
 * 数据库实体的基类
 * </pre>
 * @author fenlove
 */
@MappedSuperclass
public abstract class AbstractPersistable implements Persistable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8153022617085245201L;

	@Id
	@Column(name = "C_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean isNew() {
		return null == id || id == 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("实体  %s : %s", this.getClass().getName(), getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (null == obj) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!getClass().equals(obj.getClass())) {
			return false;
		}
		AbstractPersistable that = (AbstractPersistable) obj;
		return null == this.getId() ? false : this.getId().equals(that.getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int hashCode = 17;
		hashCode += null == getId() ? 0 : getId().hashCode() * 31;
		return hashCode;
	}
}
