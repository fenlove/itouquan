package com.project.kernel.entities.plugins;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.project.kernel.support.entities.AbstractEntity;

@MappedSuperclass
public abstract class AbstractFileEntity extends AbstractEntity {

	private static final long serialVersionUID = 7779353128972711982L;

	/**
	 * 在文件系统中的目录结构的路径 文件或文件夹的路径
	 */
	@Column(name = "C_MAPPATH")
	private String mapPath;
	
	/**
	 * 已经使用的空间或者文件的大小
	 */
	@Column(name = "C_LENGTH")
	private long length;
	/**
	 * <pre>
	 * 不允许修改,在对文件或目录修改完提交的时候,需要判断该字段, 
	 * 该字段指明了文件或目录是否允许被修改.如果不允许修改,则返回异常信息.
	 * </pre>
	 */
	@Column(name = "C_DISEDIT")
	private boolean disedit;

	@Column(name = "C_ORDINAL")
	private int ordinal;

	public boolean isDisedit() {
		return disedit;
	}

	public void setDisedit(boolean disedit) {
		this.disedit = disedit;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public String getMapPath() {
		return mapPath;
	}

	public void setMapPath(String mapPath) {
		this.mapPath = mapPath;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

}
