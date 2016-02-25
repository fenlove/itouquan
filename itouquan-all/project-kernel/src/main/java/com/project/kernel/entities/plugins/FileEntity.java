package com.project.kernel.entities.plugins;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * <pre>
 * 文件实体。
 * 可以用来保存上传到系统的文件信息，一般只有比较重要的文件才使用。
 * 
 * <font color='red'>
 * 注意:其它实体如果需要使用文件的,可以使用一对多或多对多的关联关系单向关联，
 * 不管是一对多还是多对多，都需要生成中间的关系表。这样如果关联多的话，才不会
 * 在文件表里添加过多的字段。
 * </font>
 * </pre>
 * 
 * @author fenlove
 * 
 */
@Entity
@Table(name = "T_FILE")
public class FileEntity extends AbstractFileEntity {

	private static final long serialVersionUID = -1976902043525620843L;

	/**
	 * 文件的扩展名
	 */
	@Column(name = "C_EXT")
	private String ext;

	/**
	 * 所在的目录的ID
	 */
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "R_DIRECTORY_ID")
	private DirectoryEntity directory;

	/**
	 * 扩展属性
	 */
	@Column(name = "C_EXTATTR")
	private String extendedAttributes;

	/**
	 * <pre>
	 * 附件属于哪一个级别的,用户提交上来的附件应该属于默认级别,
	 * 如果是系统添加的,应该属于其它级别,具体级别的意义由实现的子类来定义
	 * </pre>
	 */
	@Column(name = "C_LEVEL")
	private int level = 0;

	public void setExtendedAttributes(String extendedAttributes) {
		this.extendedAttributes = extendedAttributes;
	}

	public String getExtendedAttributes() {
		return extendedAttributes;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public DirectoryEntity getDirectory() {
		return directory;
	}

	public void setDirectory(DirectoryEntity directory) {
		this.directory = directory;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

}
