/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.jc.support.supports.dal.dataobject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


import java.io.*;
import java.net.*;
import java.util.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.zeh.jungle.dal.paginator.PageQuery;
import com.zeh.jungle.dal.paginator.PageList;
import com.zeh.jungle.dal.paginator.PageQueryUtils;
/**
 * ExUserDO
 * database table: ex_user
 * database table comments: ExUser
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class ExUserDO implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/**
	 * id 		db_column: id 
	 */
	private long id;
	/**
	 * userName 		db_column: user_name 
	 */
	private String userName;
	/**
	 * userSex 		db_column: user_sex 
	 */
	private int userSex;
	/**
	 * gmtCreate 		db_column: gmt_create 
	 */
	private Date gmtCreate;
	/**
	 * gmtModified 		db_column: gmt_modified 
	 */
	private Date gmtModified;
	/**
	 * createBy 		db_column: create_by 
	 */
	private String createBy;
	/**
	 * modifyBy 		db_column: modify_by 
	 */
	private String modifyBy;

	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	
	public int getUserSex() {
		return this.userSex;
	}
	
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	
	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	
	public Date getGmtModified() {
		return this.gmtModified;
	}
	
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	public String getCreateBy() {
		return this.createBy;
	}
	
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	
	public String getModifyBy() {
		return this.modifyBy;
	}

	public String toString() {
		return new ToStringBuilder(this)
			.append("Id",getId())
			.append("UserName",getUserName())
			.append("UserSex",getUserSex())
			.append("GmtCreate",getGmtCreate())
			.append("GmtModified",getGmtModified())
			.append("CreateBy",getCreateBy())
			.append("ModifyBy",getModifyBy())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(obj instanceof ExUserDO == false) return false;
		ExUserDO other = (ExUserDO)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

