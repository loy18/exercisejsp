package kr.or.ddit.app.review.service;

import java.util.List;

import kr.or.ddit.app.review.dao.IReviewDAO;
import kr.or.ddit.app.review.dao.ReviewDAOImpl;
import kr.or.ddit.app.review.vo.ReviewVO;

public class ReviewServiceImpl implements IReviewService {

	private static IReviewService reviewService;
	private IReviewDAO reviewDao;
	
	private ReviewServiceImpl() {
		reviewDao = ReviewDAOImpl.getinstance();
	}
	
	public static IReviewService getInstance() {
		if(reviewService == null) {
			reviewService = new ReviewServiceImpl();
		}
		return reviewService;
	}
	
	@Override
	public int registerReview(ReviewVO rv) {
		int cnt = reviewDao.insertReview(rv);
		return cnt;
	}

	@Override
	public int removeReview(String reviewId) {
		int cnt = reviewDao.deleteReview(reviewId);
		return cnt;
	}

	@Override
	public ReviewVO getReview(String reviewId) {
		ReviewVO rv = reviewDao.getReview(reviewId);
		return rv;
	}

	@Override
	public List<ReviewVO> getAllReviewList() {
		List<ReviewVO> rvList = reviewDao.getAllReviewList();
		return rvList;
	}

	@Override
	public List<ReviewVO> searchList(String rv) {
		List<ReviewVO> rvList = reviewDao.searchReview(rv);
		return rvList;
	}

	@Override
	public List<ReviewVO> pkgList(String sch) {
		List<ReviewVO> rvList = reviewDao.searchReview(sch);
		return rvList;
	}

	@Override
	public ReviewVO getReviewAvg(String pkgId) {
		ReviewVO reviewAvg = reviewDao.getReviewAvg(pkgId);
		return reviewAvg;
	}
}
