package kr.or.ddit.app.qnaans.service;

import java.util.List;

import kr.or.ddit.app.qnaans.dao.IQnaAnsDAO;
import kr.or.ddit.app.qnaans.dao.QnaAnsDAOImpl;
import kr.or.ddit.app.qnaans.vo.QnaAnsVO;

public class QnaAnsServiceImpl implements IQnaAnsService{

	private static IQnaAnsService qstService;
	private IQnaAnsDAO qstDao;
	
	private QnaAnsServiceImpl() {
		qstDao = QnaAnsDAOImpl.GetInstance();
	}
	public static IQnaAnsService getInstance() {
		if(qstService == null) {
			qstService = new QnaAnsServiceImpl();
		}
		return qstService;
	}
	
	@Override
	public int registerQnaAns(QnaAnsVO qnsv) {
		int cnt = qstDao.insertQnaAns(qnsv);
		return cnt;
	}

	@Override
	public int removeQnaAns(String qnaAnsId) {
		int cnt = qstDao.deleteQnaAns(qnaAnsId);
		return cnt;
	}
	@Override
	public int modifyQnaAns(QnaAnsVO qnsv) {
		int cnt = qstDao.updateQnaAns(qnsv);
		return cnt;
	}
	@Override
	public QnaAnsVO getQnaAns(String qnaAnsId) {
		QnaAnsVO qnsv = qstDao.getQnaAns(qnaAnsId);
		return qnsv;
	}
	@Override
	public List<QnaAnsVO> getAllQnaAnsList() {
		List<QnaAnsVO> qsvList = qstDao.getQnaAnsList();
		return qsvList;
	}

}
