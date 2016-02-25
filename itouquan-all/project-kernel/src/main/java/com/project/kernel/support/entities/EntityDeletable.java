package com.project.kernel.support.entities;

public interface EntityDeletable extends Persistable {

	boolean isDeleted();

	void setDeleted(boolean deleted);
}
