package com.project.kernel.support.entities;


/**
 * 
 * 可回收的实体，如果定义面可回收的实体则删后会进入回收站， 只有在回收站里删除，才能真正的把数据从数据库里删除
 * 
 * @author fenlove
 * 
 */
public interface EntityRecyclable extends EntityDeletable {

	String getName();
}