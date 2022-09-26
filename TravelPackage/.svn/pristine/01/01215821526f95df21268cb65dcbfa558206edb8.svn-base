package kr.or.ddit.app.qna.service;

import java.util.List;

import kr.or.ddit.app.notice.vo.NoticeVO;
import kr.or.ddit.app.qna.dao.IQnaDAO;
import kr.or.ddit.app.qna.dao.QnaDAOImpl;
import kr.or.ddit.app.qna.vo.QnaVO; 


public class QnaServiceImpl implements IQnaService {

	private static IQnaService qtService;
	private IQnaDAO qtDao;
	
	private QnaServiceImpl() {
		qtDao = QnaDAOImpl.getInsetance();
	}
	
	public static IQnaService getInstance() {
		if(qtService == null) {
			qtService = new QnaServiceImpl();
		}
		return qtService;
	}

	@Override
	public int registerQna(QnaVO qv) {
		int cnt = qtDao.insertQna(qv);
		return cnt;
	}

	@Override
	public int modifyQna(QnaVO qv) {
		int cnt = qtDao.updateQna(qv);
		return cnt;
	}

	@Override
	public int removeQna(String qnaNo) {
		int cnt = qtDao.deleteQna(qnaNo);
		return cnt;
	}

	@Override
	public QnaVO getQna(String qnaNo) {
		QnaVO qv = qtDao.getQna(qnaNo); 
		return qv;
	}

	@Override
	public List<QnaVO> getAllQnaList() {
		List<QnaVO> qvList = qtDao.getQnaList();
		return qvList;
	}

	@Override
	public List<QnaVO> getEachQnaList(String memMail) {
		List<QnaVO> qvEachList = qtDao.getQnaEachList(memMail);
		return qvEachList;
	}

	@Override
	public List<QnaVO> searchList(QnaVO qv) {
		List<QnaVO> qvList = qtDao.searchQnaList(qv); 
		return qvList;
	}


}
