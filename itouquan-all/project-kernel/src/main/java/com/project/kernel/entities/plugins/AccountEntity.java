package com.project.kernel.entities.plugins;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.project.kernel.support.entities.AbstractEntity;
import com.project.kernel.support.entities.EntityStatus;

/**
 * <pre>
 * 账号,用户用于登录系统的账号.可以对应的用户有个人,机构,公司等.
 * 只用于登录,不记录用户相关的其它信息.
 * </pre>
 * 
 * @author fenlove
 * 
 */
@Entity
@Table(name = "T_ACCOUNT")
@Inheritance(strategy = InheritanceType.JOINED)
public class AccountEntity extends AbstractEntity implements EntityStatus {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1611691856001661214L;

	@Column(name = "C_TYPENAME", length = 50)
	protected String typeName = "系统用户";
	
	/**
	 * 登录名
	 */
	@Column(name = "C_LOGINNAME")
	private String loginName;
	
	/**
	 * 登录密码
	 */
	@Column(name = "C_LOGINPWD")
	private String loginPwd;

	/**
	 * 1:正常   -1:禁止  0:草稿
	 */
	@Column(name = "C_STATUS")
	private int status;

	/**
	 * 扩展状态,扩展状态是由子系统或插件决定的,这里对该状态没有定义
	 */
	@Column(name = "C_EXTSTATUS")
	private int extStatus;

	/**
	 * 0,访客 1,普通用户 2,一般管理员,10000:超级管理帐号
	 */
	@Enumerated
	@Column(name = "C_FLAG")
	private FlagType flag;

	/**
	 * 地区级别（省、市、区）
	 */
	@Column(name = "C_EXTFLAG")
	private long extFlag;

	/**
	 * 强制修改密码，如果是，则在用户登录时去到强制修改密码的界面
	 */
	@Column(name = "C_FORCEDCHANGEPWD", nullable = false)
	private boolean forcedChangePwd;

	/**
	 * 指示该账户是否有被登录过.
	 */
	@Column(name = "C_HASLOGON")
	private boolean hasLogon;

	/**
	 * <pre>
	 * 是否设置了密码过期,如果有,这里指定的是密码过期的时间.
	 * 如果时间这null,则表示永不过期
	 * </pre>
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C_EXPIREDAT")
	private Date expiredAt;

	/**
	 * 最后一次登录的IP
	 */
	@Column(name = "C_LASTLOGONIP", length = 32)
	private String lastLogonIp;

	/**
	 * 最后一次登录系统的时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C_LASTLOGONAT")
	private Date lastLogonAt;

	@Column(name = "C_CURRENTLOGONIP", length = 32)
	private String currentLogonIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C_CURRENTLOGONAT")
	private Date currentLogonAt;

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public FlagType getFlag() {
		return flag;
	}

	public void setFlag(FlagType flag) {
		this.flag = flag;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isForcedChangePwd() {
		return forcedChangePwd;
	}

	public void setForcedChangePwd(boolean forcedChangePwd) {
		this.forcedChangePwd = forcedChangePwd;
	}

	public boolean isHasLogon() {
		return hasLogon;
	}

	public void setHasLogon(boolean hasLogon) {
		this.hasLogon = hasLogon;
	}

	public Date getExpiredAt() {
		return expiredAt;
	}

	public void setExpiredAt(Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	public String getLastLogonIp() {
		return lastLogonIp;
	}

	public void setLastLogonIp(String lastLogonIp) {
		this.lastLogonIp = lastLogonIp;
	}

	public Date getLastLogonAt() {
		return lastLogonAt;
	}

	public void setLastLogonAt(Date lastLogonAt) {
		this.lastLogonAt = lastLogonAt;
	}

	public int getExtStatus() {
		return extStatus;
	}

	public void setExtStatus(int extStatus) {
		this.extStatus = extStatus;
	}

	public long getExtFlag() {
		return extFlag;
	}

	public void setExtFlag(long extFlag) {
		this.extFlag = extFlag;
	}

	public String getCurrentLogonIp() {
		return currentLogonIp;
	}

	public void setCurrentLogonIp(String currentLogonIp) {
		this.currentLogonIp = currentLogonIp;
	}

	public Date getCurrentLogonAt() {
		return currentLogonAt;
	}

	public void setCurrentLogonAt(Date currentLogonAt) {
		this.currentLogonAt = currentLogonAt;
	}
}
