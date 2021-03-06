package com.cdc.cdccmc.domain;

import java.sql.Timestamp;

/** 
 * 承运商表  T_CAR_SHIPPER
 * @author ZhuWen
 * @date 2017-12-28
 */
public class CarShipper {

	private String shipperId; //承运商ID
	private String shipperName; //承运商名称
	private String shipperAddress; //地址
	private String shipperContactName; //联系人
	private String shipperContactNumber; //联系电话
	private Timestamp createTime; //创建时间
	private String createAccount; //创建账号
	private String createRealName;//创建账号的姓名
	private String createOrgId;//创建组织ID
	private String createOrgName;//创建组织名称
	private Timestamp modifyTime; //修改时间
	private String modifyAccount; //修改账号
	private String modifyRealName;//修改账号的姓名
	private String modifyOrgId;//创建组织ID
	private String modifyOrgName;//创建组织名称
	
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getShipperName() {
		return shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public String getShipperAddress() {
		return shipperAddress;
	}
	public void setShipperAddress(String shipperAddress) {
		this.shipperAddress = shipperAddress;
	}
	public String getShipperContactName() {
		return shipperContactName;
	}
	public void setShipperContactName(String shipperContactName) {
		this.shipperContactName = shipperContactName;
	}
	public String getShipperContactNumber() {
		return shipperContactNumber;
	}
	public void setShipperContactNumber(String shipperContactNumber) {
		this.shipperContactNumber = shipperContactNumber;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getCreateAccount() {
		return createAccount;
	}
	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}
	public String getCreateRealName() {
		return createRealName;
	}
	public void setCreateRealName(String createRealName) {
		this.createRealName = createRealName;
	}
	public Timestamp getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifyAccount() {
		return modifyAccount;
	}
	public void setModifyAccount(String modifyAccount) {
		this.modifyAccount = modifyAccount;
	}
	public String getModifyRealName() {
		return modifyRealName;
	}
	public void setModifyRealName(String modifyRealName) {
		this.modifyRealName = modifyRealName;
	}
	public String getCreateOrgId() {
		return createOrgId;
	}
	public void setCreateOrgId(String createOrgId) {
		this.createOrgId = createOrgId;
	}
	public String getCreateOrgName() {
		return createOrgName;
	}
	public void setCreateOrgName(String createOrgName) {
		this.createOrgName = createOrgName;
	}
	public String getModifyOrgId() {
		return modifyOrgId;
	}
	public void setModifyOrgId(String modifyOrgId) {
		this.modifyOrgId = modifyOrgId;
	}
	public String getModifyOrgName() {
		return modifyOrgName;
	}
	public void setModifyOrgName(String modifyOrgName) {
		this.modifyOrgName = modifyOrgName;
	}
	
}
