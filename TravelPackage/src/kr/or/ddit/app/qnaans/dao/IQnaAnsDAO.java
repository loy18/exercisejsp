package kr.or.ddit.app.qnaans.dao;

import java.util.List;

import kr.or.ddit.app.qnaans.vo.QnaAnsVO;

public interface IQnaAnsDAO {

	public int insertQnaAns(QnaAnsVO qnsv);
	
	public int deleteQnaAns(String qnaAnsId);
	
	public int updateQnaAns(QnaAnsVO qnsv);
	
	public QnaAnsVO getQnaAns(String qnaAnsId);
	
	public List<QnaAnsVO> getQnaAnsList();
	
}
