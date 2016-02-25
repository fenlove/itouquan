package com.project.kernel.support.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 * <pre>
 * 树形结构数据库实体的基类
 * </pre>
 * @author fenlove
 */
@MappedSuperclass
public abstract class AbstractTreeEntity<N extends AbstractTreeEntity<N>> extends AbstractEntity {

	private static final long serialVersionUID = 3550269972801490073L;
	
	@ManyToOne
	@JoinColumn(name = "R_PARENT_ID")
	private N parent;
	@OneToMany(mappedBy = "parent")
	private List<N> children;
	@Column(name = "C_XPATH")
	private String xpath;
	@Column(name = "C_FULLNAME")
	private String fullName;
	
	public N getParent() {
		return parent;
	}
	public void setParent(N parent) {
		this.parent = parent;
	}
	public List<N> getChildren() {
		return children;
	}
	public void setChildren(List<N> children) {
		this.children = children;
	}
	public String getXpath() {
		return xpath;
	}
	public void setXpath(String xpath) {
		this.xpath = xpath;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
