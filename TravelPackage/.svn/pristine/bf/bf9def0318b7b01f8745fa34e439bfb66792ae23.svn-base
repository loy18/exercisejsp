package kr.or.ddit.app.review.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.review.vo.ReviewVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class ReviewDAOImpl implements IReviewDAO {

	private static IReviewDAO reviewDao;
	private SqlSession sqlSession;

	private ReviewDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}
	
	public static IReviewDAO getinstance() {
		if(reviewDao == null) {
			reviewDao = new ReviewDAOImpl(); 
		}
		return reviewDao;
	}
	
	@Override
	public int insertReview(ReviewVO rv) {
		int cnt = sqlSession.insert("review.insertReview", rv);
		return cnt;
	}

	@Override
	public int deleteReview(String reviewId) {
		int cnt = sqlSession.delete("review.deleteReview", reviewId);
		return cnt;
	}

	@Override
	public ReviewVO getReview(String reviewId) {
		ReviewVO reviewVO = sqlSession.selectOne("review.getReview", reviewId);
		return reviewVO;
	}

	@Override
	public List<ReviewVO> getAllReviewList() {
		List<ReviewVO> reviewList = sqlSession.selectList("review.reviewList");
		return reviewList;
	}

	@Override
	public List<ReviewVO> searchReview(String rv) {
		List<ReviewVO> reviewList = sqlSession.selectList("review.searchList", rv);
		return reviewList;
	}
	
	@Override
	public ReviewVO getReviewAvg(String pkgId) {
		ReviewVO reviewAvg = sqlSession.selectOne("review.reviewAvg", pkgId);
		return reviewAvg;
	}

	@Override
	public List<ReviewVO> pkgReview(String rv) {
		List<ReviewVO> reviewList = sqlSession.selectList("review.pkgList", rv);
		return reviewList;
	}

}
