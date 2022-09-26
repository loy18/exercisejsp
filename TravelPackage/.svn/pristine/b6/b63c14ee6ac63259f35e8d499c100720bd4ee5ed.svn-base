package kr.or.ddit.app.qna.dao;

import java.util.List; 

import kr.or.ddit.app.qna.vo.QnaVO;

public interface IQnaDAO {

	// 등록
	public int insertQna(QnaVO qv);

	// 수정
	public int updateQna(QnaVO qv);

	// 삭제
	public int deleteQna(String qnaNo);

	// 정보 가져오기
	public QnaVO getQna(String qnaNo);

	// 모든 리스트
	public List<QnaVO> getQnaList();
	
	// 개별 리스트
	public List<QnaVO> getQnaEachList(String memMail);

	// 검색 리스트
	public List<QnaVO> searchQnaList(QnaVO qv);

}
