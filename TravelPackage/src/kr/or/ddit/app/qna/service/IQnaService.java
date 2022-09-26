package kr.or.ddit.app.qna.service;

import java.util.List;

import kr.or.ddit.app.qna.vo.QnaVO; 



public interface IQnaService {
	// Insert
	public int registerQna(QnaVO qv);
	
	// Update
	public int modifyQna(QnaVO qv);
	
	// Delete
	public int removeQna(String qnaNo);
	
	// 정보 확인
	public QnaVO getQna(String qnaNo);
	
	// 전체 정보 리스트
	public List<QnaVO> getAllQnaList();
	
	// 찾는 정보 리스트
	public List<QnaVO> getEachQnaList(String memMail);
	
	// 검색 정보 리스트
	public List<QnaVO> searchList(QnaVO qv);
}
