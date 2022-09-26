package kr.or.ddit.app.schcomb.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.schcomb.dao.ISchCombDAO;
import kr.or.ddit.app.schcomb.dao.SchCombDAOImpl;
import kr.or.ddit.app.schcomb.vo.SchCombVO;


public class SchCombServiceImpl implements ISchCombService {
	private static ISchCombService schCombService;
	private ISchCombDAO schCombDao;
	
	private SchCombServiceImpl() {
		schCombDao = SchCombDAOImpl.getInstance();
	}
	
	public static ISchCombService getInstance() {
		if(schCombService == null) {
			schCombService = new SchCombServiceImpl();
		}
		return schCombService;
	}

	@Override
	public int registerSchComb(SqlSession sqlSession, SchCombVO sv) {
		int cnt = schCombDao.insertSchComb(sqlSession, sv);
		return cnt;
	}

	@Override
	public int modifySchComb(SqlSession sqlSession, SchCombVO sv) {
		int cnt = schCombDao.updateSchComb(sqlSession, sv);
		return cnt;
	}

	@Override
	public int removeSchComb(SqlSession sqlSession, SchCombVO sv) {
		int cnt = schCombDao.deleteSchComb(sqlSession, sv);
		return cnt;
	}


	@Override
	public List<SchCombVO> getPkgSchCombList(SqlSession sqlSession, String pkgId) {
		List<SchCombVO> SchCombList = schCombDao.getPkgSchCombList(sqlSession, pkgId);
		return SchCombList;
	}

	@Override
	public List<SchCombVO> searchList(SqlSession sqlSession, SchCombVO sv) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
