package kr.or.ddit.app.rsv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.compkg.vo.ComPkgVO;
import kr.or.ddit.app.rsv.vo.RsvVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class RsvDAOImpl implements IRsvDAO {
	private static IRsvDAO rsvDao;

	private SqlSession sqlSession;

	private RsvDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}

	public static IRsvDAO getInstace() {
		if (rsvDao == null) {
			rsvDao = new RsvDAOImpl();
		}
		return rsvDao;
	}

	@Override
	public int insertRsv(RsvVO rv) {
		int cnt = sqlSession.insert("rsv.insertRsv", rv);
		return cnt;
	}

	@Override
	public int updateRsv(RsvVO rv) {
		int cnt = sqlSession.update("rsv.updateRsv", rv);
		return cnt;
	}
	@Override
	public int updateRsv2(RsvVO rv) {
		int cnt = sqlSession.update("rsv.updateRsv2",rv);
		return cnt;
	}

	@Override
	public int deleteRsv(String RsvId) {
		int cnt = sqlSession.delete("rsv.deleteRsv", RsvId);
		return cnt;
	}

	@Override
	public List<RsvVO> getAllRsvList() {
		List<RsvVO> rsvList = sqlSession.selectList("rsv.listRsv");
		return rsvList;
	}

	@Override
	public List<RsvVO> getRsvList(RsvVO rv) {
		List<RsvVO> rsvList2 = sqlSession.selectList("rsv.listRsv2", rv);
		return rsvList2;
	}

	@Override
	public String getComPkgId(ComPkgVO cpv) {
		String pkgId = sqlSession.selectOne("rsv.selectComId", cpv);
		return pkgId;
	}

}
