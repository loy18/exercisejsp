package kr.or.ddit.app.prodpkg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.prodpkg.vo.ProdPkgVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class ProdPkgDAOImpl implements IProdPkgDAO {
	private static IProdPkgDAO prodPkgDao;
	
	private SqlSession sqlSession;
	
	private ProdPkgDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}
	
	public static IProdPkgDAO getInstance() {
		if(prodPkgDao == null) {
			prodPkgDao = new ProdPkgDAOImpl();
		}
		return prodPkgDao;
	}
	
	
	@Override
	public int insertProdPkg(SqlSession sqlSession, ProdPkgVO ppv) {
		int cnt = 0;
		try {
			cnt = sqlSession.insert("prodPkg.insert", ppv);						
		} catch(Exception e) { }
		return cnt;
	}

	@Override
	public int updateProdPkg(SqlSession sqlSession, ProdPkgVO ppv) {
		int cnt = 0;
		try {
			cnt = sqlSession.update("prodPkg.update",ppv);
		} catch(Exception e) { }
		return cnt;
	}

	@Override
	public int deleteProdPkg(SqlSession sqlSession, ProdPkgVO ppv) {
		int cnt = sqlSession.delete("prodPkg.delete", ppv);
		return cnt;
	}

	
	@Override
	public List<String> getPkgTourList(SqlSession sqlSession, String pkgId) {
		List<String> pkgTourList = sqlSession.selectList("prodPkg.pkgTourList", pkgId);
		return pkgTourList;
	}

	@Override
	public List<ProdPkgVO> searchList(SqlSession sqlSession, String sch) {
		List<ProdPkgVO> prodPkgList = sqlSession.selectList("prodPkg.search",sch);
		return prodPkgList;
	}
	
}
