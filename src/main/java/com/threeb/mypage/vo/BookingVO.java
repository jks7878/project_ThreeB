package com.threeb.mypage.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("bookingVO")
public class BookingVO {
	private int booking_id; //예약번호
	private String member_id; //예약자
	private int house_id; //숙소게시물번호
	private String house_title; //숙소명
	private String house_location; //숙소위치
	private double review_score; //평점
	private int review_count; //리뷰갯수
	private Date checkin; //체크인날짜
	private Date checkout; //체크아웃날짜
	private int booking_total; //예약인원
	private String booking_detail; //인원세부사항(성인,청소년,소아)
	private int booking_amount; //총결제금액
	private String memo; //요청사항
	private long diffDay;
	private int reviewCheck;
	
	public BookingVO() {
		
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public String getHouse_title() {
		return house_title;
	}

	public void setHouse_title(String house_title) {
		this.house_title = house_title;
	}

	public String getHouse_location() {
		return house_location;
	}

	public void setHouse_location(String house_location) {
		this.house_location = house_location;
	}
	
	public double getReview_score() {
		return review_score;
	}

	public void setReview_score(double review_score) {
		this.review_score = review_score;
	}

	public int getReview_count() {
		return review_count;
	}

	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public int getBooking_total() {
		return booking_total;
	}

	public void setBooking_total(int booking_total) {
		this.booking_total = booking_total;
	}

	public String getBooking_detail() {
		return booking_detail;
	}

	public void setBooking_detail(String booking_detail) {
		this.booking_detail = booking_detail;
	}

	public int getBooking_amount() {
		return booking_amount;
	}

	public void setBooking_amount(int booking_amount) {
		this.booking_amount = booking_amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public long getDiffDay() {
		return diffDay;
	}

	public void setDiffDay(long diffDay) {
		this.diffDay = diffDay;
	}

	public int getReviewCheck() {
		return reviewCheck;
	}

	public void setReviewCheck(int reviewCheck) {
		this.reviewCheck = reviewCheck;
	}

}
