package kr.or.ddit.app.review.vo;

import java.sql.Date;

public class ReviewVO {
	private String reviewId;		// 게시물ID
	private String reviewTitle;		// 제목
	private Date reviewDate;		// 날짜
	private String reviewCont;		// 내용
	private String reviewRat;		// 평점
	private String memMail;			// 이메일
	private String pkgId;			// 패키지ID
	private long atchFileId = -1;	// 첨부파일ID
	
	private String reviewCount;
	

	public String getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewCont() {
		return reviewCont;
	}

	public void setReviewCont(String reviewCont) {
		this.reviewCont = reviewCont;
	}

	public String getReviewRat() {
		return reviewRat;
	}

	public void setReviewRat(String reviewRat) {
		this.reviewRat = reviewRat;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getPkgId() {
		return pkgId;
	}

	public void setPkgId(String pkgId) {
		this.pkgId = pkgId;
	}

	public long getAtchFileId() {
		return atchFileId;
	}

	public void setAtchFileId(long atchFileId) {
		this.atchFileId = atchFileId;
	}

	@Override
	public String toString() {
		return "ReviewVO [reviewId=" + reviewId + ", reviewTitle=" + reviewTitle + ", reviewDate=" + reviewDate
				+ ", reviewCont=" + reviewCont + ", reviewRat=" + reviewRat + ", memMail=" + memMail + ", pkgId="
				+ pkgId + ", atchFileId=" + atchFileId + "]";
	}
}
