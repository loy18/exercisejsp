package kr.or.ddit.app.qnaans.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.qnaans.vo.QnaAnsVO;
import kr.or.ddit.app.util.MyBatisUtil;
import sun.security.jca.GetInstance;

public class QnaAnsDAOImpl implements IQnaAnsDAO{

	private static IQnaAnsDAO qnsDao;
	private SqlSession sqlSession;
	
	private QnaAnsDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}
	
	public static IQnaAnsDAO GetInstance() {
		if(qnsDao == null) {
			qnsDao = new QnaAnsDAOImpl();
		}
		return qnsDao;
	}
	@Override
	public int insertQnaAns(QnaAnsVO qnsv) {
		int cnt = sqlSession.insert("qns.insertQns", qnsv);
		return cnt;
	}

	@Override
	public int deleteQnaAns(String qnaAnsId) {
		int cnt = sqlSession.delete("qns.deleteQns",qnaAnsId);
		return cnt;
	}

	@Override
	public int updateQnaAns(QnaAnsVO qnsv) {
		int cnt = sqlSession.update("qns.updateQns", qnsv);
		return cnt;
	}

	@Override
	public QnaAnsVO getQnaAns(String qnaAnsId) {
		QnaAnsVO qstVO = sqlSession.selectOne("qns.getQns", qnaAnsId);
		return qstVO;
	}

	@Override
	public List<QnaAnsVO> getQnaAnsList() {
		List<QnaAnsVO> qstList = sqlSession.selectList("qns.qnsList");
		return qstList;
	}

}
