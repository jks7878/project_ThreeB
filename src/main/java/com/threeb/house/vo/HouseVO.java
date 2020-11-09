package com.threeb.house.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("houseVO")
public class HouseVO {
	private int houseId;
	private String memberId;
	private String houseType;
	private int housePerson;
	private int houseRoom;
	private int houseBed;
	private String houseBedType;
	private int houseBath;
	private String location;
	private String houseFacility;
	private String houseTitle;
	private String houseContent;
	private int houseCharge;
	private Date houseWritedate;
	
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public int getHousePerson() {
		return housePerson;
	}
	public void setHousePerson(int housePerson) {
		this.housePerson = housePerson;
	}
	public int getHouseRoom() {
		return houseRoom;
	}
	public void setHouseRoom(int houseRoom) {
		this.houseRoom = houseRoom;
	}
	public int getHouseBed() {
		return houseBed;
	}
	public void setHouseBed(int houseBed) {
		this.houseBed = houseBed;
	}
	public String getHouseBedType() {
		return houseBedType;
	}
	public void setHouseBedType(String houseBedType) {
		this.houseBedType = houseBedType;
	}
	public int getHouseBath() {
		return houseBath;
	}
	public void setHouseBath(int houseBath) {
		this.houseBath = houseBath;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHouseFacility() {
		return houseFacility;
	}
	public void setHouseFacility(String houseFaciltiy) {
		this.houseFacility = houseFaciltiy;
	}
	public String getHouseTitle() {
		return houseTitle;
	}
	public void setHouseTitle(String houseTitle) {
		this.houseTitle = houseTitle;
	}
	public String getHouseContent() {
		return houseContent;
	}
	public void setHouseContent(String houseContent) {
		this.houseContent = houseContent;
	}
	public int getHouseCharge() {
		return houseCharge;
	}
	public void setHouseCharge(int houseCharge) {
		this.houseCharge = houseCharge;
	}
	public Date getHouseWritedate() {
		return houseWritedate;
	}
	public void setHouseWritedate(Date houseWritedate) {
		this.houseWritedate = houseWritedate;
	}
}
