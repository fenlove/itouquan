package com.project.kernel.support.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <pre>
 * 该实体记录对数据库操作的创建人、创建时间及修改操作时的修改人、修改时间、备注
 * 是否删除
 * </pre>
 * 
 * @author fenlove
 */
@MappedSuperclass
public abstract class AbstractEntity extends AbstractPersistable implements EntityRecyclable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1327198790530653756L;

	/**
	 * 该实体的名称，或标题等
	 */
	@Column(name = "C_NAME")
	private String name;

	/**
	 * <pre>
	 * 该记录的创建者的Id。
	 * 一般不需要显示创建者ID，只显示创建者的登录名creatorName。
	 * </pre>
	 */
	@Column(name = "C_CREATORID")
	private Long creatorId;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C_CREATEAT", nullable = false)
	private Date createAt;

	/**
	 * <pre>
	 * 创建人的名称，登录账号。
	 * 一般可用于直接显示，如列表或查看的页面等。
	 * 一般creatorName不作为关联关系，关联关系请使用createrId。
	 * </pre>
	 */
	@Column(name = "C_CREATORNAME")
	private String creatorName;

	/**
	 * 最后一次的更新时间，如果人第一次添加，更新时间可以为空也可以为创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C_UPDATEAT")
	private Date updateAt;

	/**
	 * 最后一次更新的账号
	 */
	@Column(name = "C_UPDATERNAME")
	private String updaterName;

	/**
	 * <pre>
	 * 最后的修改者的ID，用于关联。
	 * 在做修改时，如果该业务需要用到当前修改者的权限信息，可以通过这个字段取得。
	 * 
	 * </pre>
	 */
	@Column(name = "C_UPDATERID")
	private Long updaterId;

	/**
	 * 备注信息
	 */
	@Column(name = "C_REMARK", length = 600)
	private String remark;

	@Column(name = "C_DELETED")
	private boolean deleted;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getUpdaterName() {
		return updaterName;
	}

	public void setUpdaterName(String updaterName) {
		this.updaterName = updaterName;
	}

	public Long getUpdaterId() {
		return updaterId;
	}

	public void setUpdaterId(Long updaterId) {
		this.updaterId = updaterId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

}
