package kr.or.ddit.app.review.service;

import java.util.List;

import kr.or.ddit.app.review.vo.ReviewVO;


public interface IReviewService {

	// Insert
	public int registerReview(ReviewVO rv);
		
	// Delete
	public int removeReview(String reviewId);
		
	// 정보 확인
	public ReviewVO getReview(String reviewId);
		
	// 전체 정보 리스트
	public List<ReviewVO> getAllReviewList();
		
	// 검색 정보 리스트
	public List<ReviewVO> searchList(String sch);
	
	// 상품 리뷰 리스트
	public List<ReviewVO> pkgList(String sch);
	
	// 리뷰 수 및 평점 조회
	public ReviewVO getReviewAvg(String pkgId);
}
