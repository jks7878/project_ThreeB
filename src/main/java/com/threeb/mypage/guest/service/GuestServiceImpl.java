package com.threeb.mypage.guest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.threeb.mypage.guest.dao.GuestDAO;
import com.threeb.mypage.vo.BookingVO;
import com.threeb.mypage.vo.ReviewVO;

@Service("guestService")
@Transactional(propagation = Propagation.REQUIRED)
public class GuestServiceImpl implements GuestService {
	
	@Autowired GuestDAO guestDAO;
	
	//예정예약 리스트
	@Override
	public List listBookingFuture(String member_id) throws Exception {
		List<BookingVO> listBooking=guestDAO.selectListBookingFuture(member_id);
		return listBooking;
	}
	
	//지난예약 리스트
	@Override
	public List listBookingPast(String member_id) throws Exception {
		List<BookingVO> listBooking=guestDAO.selectListBookingPast(member_id);
		return listBooking;
	}
	
	//후기 리스트
	@Override
	public List listReview(String member_id) throws Exception {
		List<ReviewVO> listReview=guestDAO.selectListReview(member_id);
		return listReview;
	}
	
	//숙소 평점
	@Override
	public double reviewAvg(int house_id) throws DataAccessException {
		return guestDAO.selectReviewAvg(house_id);
	}
	
	//숙소 후기갯수
	@Override
	public int reviewCount(int house_id) throws DataAccessException {
		return guestDAO.selectReviewCount(house_id);
	}
	
	//선택 예약
	@Override
	public BookingVO bookingInfo(int booking_id) throws Exception {
		BookingVO bookingVO=guestDAO.selectBookingInfo(booking_id);
		return bookingVO;
	}
	
	//예약 취소
	@Override
	public void cancelBooking(int booking_id) throws DataAccessException {
		guestDAO.deleteBooking(booking_id);
	}
	
	//나의후기 갯수
	@Override
	public int reviewCnt(String member_id) throws DataAccessException {
		return guestDAO.selectReviewCnt(member_id);
	}
	
	//후기 작성
	@Override
	public void writeReview(ReviewVO review) throws DataAccessException {
		guestDAO.insertReview(review);
	}
	
	//후기 보기
	@Override
	public ReviewVO reviewInfo(int review_id) throws Exception {
		ReviewVO reviewVO=guestDAO.selectReviewInfo(review_id);
		return reviewVO;
	}
	
	//후기 수정
	@Override
	public void modReview(ReviewVO review) throws DataAccessException {
		guestDAO.updateReview(review);
	}

	//후기 삭제
	@Override
	public void deleteReview(int review_id) throws DataAccessException {
		guestDAO.deleteReview(review_id);
	}
	
}
