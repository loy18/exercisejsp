package kr.or.ddit.app.qna.dao;

import java.util.List;  

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.qna.vo.QnaVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class QnaDAOImpl implements IQnaDAO {

	private static IQnaDAO qvDao;
	private SqlSession sqlSession;
	
	private QnaDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}
	public static IQnaDAO getInsetance() {
		if(qvDao == null) {
			qvDao = new QnaDAOImpl();
		}
		return qvDao;
	}
	@Override
	public int insertQna(QnaVO qv) {
		int cnt = sqlSession.insert("qna.insertQna", qv);
		return cnt;
	}
	@Override
	public int updateQna(QnaVO qv) {
		int cnt = sqlSession.update("qna.updateQna", qv);
		return cnt;
	}
	@Override
	public int deleteQna(String qnaNo) {
		int cnt = sqlSession.delete("qna.deleteQna", qnaNo);
		return cnt;
	}
	@Override
	public QnaVO getQna(String qnaNo) {
		QnaVO qtVo = sqlSession.selectOne("qna.getQna", qnaNo); 
		return qtVo;
	}
	@Override
	public List<QnaVO> getQnaList() {
		List<QnaVO> qtList = sqlSession.selectList("qna.qnaAllList");
		return qtList;
	}
	
	@Override
	public List<QnaVO> getQnaEachList(String memMail) {
		List<QnaVO> qtEachList = sqlSession.selectList("qna.qnaEachList", memMail);
		return qtEachList;
	}
	@Override
	public List<QnaVO> searchQnaList(QnaVO qv) {
		List<QnaVO> qtList = sqlSession.selectList("qna.searchList", qv);
		return qtList;
	}
	

}
