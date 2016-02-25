package com.project.kernel.support.entities;


/**
 * <pre>
 * 对树形结构的定义应该使用完成的定义；在对树形节点进行操作（增、删、改、移动）的处理将会比较复杂
 * 
 * 关于xpath，主要是用来定义树形结构的路径，标准格式都是以"/"号结束，如：
 * 1/
 * 1/3/
 * 1/3/7/
 * 查找的时候可以使用1/%来查找该节点下的所有子节点
 * </pre>
 * @author fenlove
 *
 */
public interface EntityTree<E extends EntityTree<E>> extends Persistable {

	E getParent();
	void setParent(E parent);
	
	/**
	 * <pre>
	 * xpath是用来存放节点的路径，支持父子节点的树和xpath树。
	 * xpath树的优点：
	 * 1.可以判断上下级关系，简单化处理树循环的问题。
	 * 2.直接通过xpath查看所有子节点，包括子节点的子节点。
	 * 
	 * xpath的格式，直接使用节点的id使用xpath路径的节点名。
	 * 如：43/56/444
	 * </pre>
	 * @return
	 */
	String getXpath();
	
	/**
	 * 表示该节点的子节点的数量，如果为0，则表示是叶子节点
	 * @return
	 */
	int getSize();
	
	/**
	 * 树节点的名称
	 * @return
	 */
	String getName();
	
	/**
	 * <pre>
	 * 树型结构完整的名字表述，如：
	 * 广东省广州市天河区
	 * 节点结构应该是：
	 * 广东省->广州市->天河区
	 * </pre>
	 * @return
	 */
	String getFullName();
	
	void setXpath(String xpath);
	
	void setSize(int size);
	
	void setFullName(String fullName);
	
}
