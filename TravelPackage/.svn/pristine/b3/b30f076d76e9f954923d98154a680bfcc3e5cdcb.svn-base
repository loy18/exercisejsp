package kr.or.ddit.app.review.dao;

import java.util.List;

import kr.or.ddit.app.review.vo.ReviewVO;

public interface IReviewDAO {
	// 등록
	public int insertReview(ReviewVO rv);
	
	// 삭제
	public int deleteReview(String reviewId);
	
	// 리뷰 정보 가져오기
	public ReviewVO getReview(String reviewId);
	
	// 모든 리스트 
	public List<ReviewVO> getAllReviewList();
	
	// 검색 리스트
	public List<ReviewVO> searchReview(String rv);

	// 패키지 리스트
	public List<ReviewVO> pkgReview(String rv);
	
	public ReviewVO getReviewAvg(String pkgId);
}
