package kr.or.ddit.app.sch.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.sch.vo.SchVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class SchDAOImpl implements ISchDAO {
	private static ISchDAO schDao;
	
	
	public static ISchDAO getInstance() {
		if(schDao == null) {
			schDao = new SchDAOImpl();
		}
		return schDao;
	}
	
	
	@Override
	public int insertSch(SqlSession session, SchVO sv) {
		int cnt = session.insert("sch.insertSch", sv);
		return cnt;
	}

	@Override
	public int updateSch(SqlSession session, SchVO sv) {
		int cnt = session.update("sch.update",sv);
		return cnt;
	}

	@Override
	public int deleteSch(SqlSession session, SchVO sv) {
		int cnt = session.delete("sch.deleteForDay", sv);
		return cnt;
	}

	@Override
	public SchVO getSchForDay(SqlSession session, SchVO sv) {
		SchVO schVO = session.selectOne("sch.schForDay", sv);
		return schVO;
	}

	@Override
	public List<SchVO> getSchList(SqlSession session, String pkgId) {
		List<SchVO> schList = session.selectList("sch.schList",pkgId);
		return schList;
	}

	@Override
	public List<String> getTourList(SqlSession session, SchVO sv) {
		List<String> tourList = session.selectList("sch.schToursForDay",sv);
		return tourList;
	}
	
}
