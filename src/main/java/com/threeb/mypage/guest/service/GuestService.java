package com.threeb.mypage.guest.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.threeb.mypage.vo.BookingVO;
import com.threeb.mypage.vo.ReviewVO;

public interface GuestService {

	public List listBookingFuture(String member_id) throws Exception;
	public List listBookingPast(String member_id) throws Exception;
	public List listReview(String member_id) throws Exception;
	public double reviewAvg(int house_id) throws DataAccessException;
	public int reviewCount(int house_id) throws DataAccessException;
	public BookingVO bookingInfo(int booking_id) throws Exception;
	public void cancelBooking(int booking_id) throws DataAccessException;
	public int reviewCnt(String member_id) throws DataAccessException;
	public void writeReview(ReviewVO review) throws DataAccessException;
	public ReviewVO reviewInfo(int review_id) throws Exception;
	public void modReview(ReviewVO review) throws DataAccessException;
	public void deleteReview(int review_id) throws DataAccessException;

}
