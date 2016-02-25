package com.project.kernel.support.entities;

public interface EntityStatus extends Persistable {

	/**
	 * 草稿状态，即新添加的数据，未进行处理
	 */
	int DRAFT = 0;

	/**
	 * 正常状态
	 */
	int NORMAL = 1;

	/**
	 * 不可用状态
	 */
	int FORBID = -1;

	int getStatus();

	void setStatus(int status);
}
