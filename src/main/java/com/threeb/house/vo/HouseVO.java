package com.threeb.house.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("houseVO")
public class HouseVO {
	
	private int house_id; //숙소게시물번호
	private String member_id; //등록자
	private String house_type; //숙소유형
	private int house_person; //숙박최대인원
	private int house_room; //침실개수
	private int house_bed; //침대개수
	private String house_bed_type; //침대유형
	private int house_bath; //욕실개수
	private String house_location; //숙소위치
	private String house_facility; //숙소시설
	private String house_content; //숙소소개
	private String house_title; //숙소명
	private int house_charge; //1박요금
	private Date house_writedate; //등록일자
	
	public HouseVO() {
		super();
	}

	public HouseVO(String member_id, String house_type, int house_person, int house_room, int house_bed,
			String house_bed_type, int house_bath, String house_location, String house_facility, String house_content,
			String house_title, int house_charge) {
		super();
		this.member_id = member_id;
		this.house_type = house_type;
		this.house_person = house_person;
		this.house_room = house_room;
		this.house_bed = house_bed;
		this.house_bed_type = house_bed_type;
		this.house_bath = house_bath;
		this.house_location = house_location;
		this.house_facility = house_facility;
		this.house_content = house_content;
		this.house_title = house_title;
		this.house_charge = house_charge;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getHouse_type() {
		return house_type;
	}

	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}

	public int getHouse_person() {
		return house_person;
	}

	public void setHouse_person(int house_person) {
		this.house_person = house_person;
	}

	public int getHouse_room() {
		return house_room;
	}

	public void setHouse_room(int house_room) {
		this.house_room = house_room;
	}

	public int getHouse_bed() {
		return house_bed;
	}

	public void setHouse_bed(int house_bed) {
		this.house_bed = house_bed;
	}

	public String getHouse_bed_type() {
		return house_bed_type;
	}

	public void setHouse_bed_type(String house_bed_type) {
		this.house_bed_type = house_bed_type;
	}

	public int getHouse_bath() {
		return house_bath;
	}

	public void setHouse_bath(int house_bath) {
		this.house_bath = house_bath;
	}

	public String getHouse_location() {
		return house_location;
	}

	public void setHouse_location(String house_location) {
		this.house_location = house_location;
	}

	public String getHouse_facility() {
		return house_facility;
	}

	public void setHouse_facility(String house_facility) {
		this.house_facility = house_facility;
	}

	public String getHouse_content() {
		return house_content;
	}

	public void setHouse_content(String house_content) {
		this.house_content = house_content;
	}

	public String getHouse_title() {
		return house_title;
	}

	public void setHouse_title(String house_title) {
		this.house_title = house_title;
	}

	public int getHouse_charge() {
		return house_charge;
	}

	public void setHouse_charge(int house_charge) {
		this.house_charge = house_charge;
	}

	public Date getHouse_writedate() {
		return house_writedate;
	}

	public void setHouse_writedate(Date house_writedate) {
		this.house_writedate = house_writedate;
	}
}
