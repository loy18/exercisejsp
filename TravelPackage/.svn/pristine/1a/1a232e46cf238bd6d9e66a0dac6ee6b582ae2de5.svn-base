package kr.or.ddit.app.prodpkg.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.prodpkg.dao.IProdPkgDAO;
import kr.or.ddit.app.prodpkg.dao.ProdPkgDAOImpl;
import kr.or.ddit.app.prodpkg.vo.ProdPkgVO;

public class ProdPkgServiceImpl implements IProdPkgService {
	private static IProdPkgService prodPkgService;
	private IProdPkgDAO prodPkgDao;
	
	private ProdPkgServiceImpl() {
		prodPkgDao = ProdPkgDAOImpl.getInstance();
	}
	
	public static IProdPkgService getInstance() {
		if(prodPkgService == null) {
			prodPkgService = new ProdPkgServiceImpl();
		}
		return prodPkgService;
	}

	@Override
	public int registerProdPkg(SqlSession sqlSession, ProdPkgVO ppv) {
		int cnt = prodPkgDao.insertProdPkg(sqlSession, ppv);
		return cnt;
	}

	@Override
	public int modifyProdPkg(SqlSession sqlSession, ProdPkgVO ppv) {
		int cnt = prodPkgDao.updateProdPkg(sqlSession, ppv);
		return cnt;
	}

	@Override
	public int removeProdPkg(SqlSession sqlSession, ProdPkgVO ppv) {
		int cnt = prodPkgDao.deleteProdPkg(sqlSession, ppv);
		return cnt;
	}

	@Override
	public List<String> getPkgTourList(SqlSession sqlSession, String pkgId) {
		List<String> prodPkgList = prodPkgDao.getPkgTourList(sqlSession, pkgId);
		return prodPkgList;
	}

	@Override
	public List<ProdPkgVO> searchList(SqlSession sqlSession, String sch) {
		List<ProdPkgVO> prodPkgList = prodPkgDao.searchList(sqlSession, sch);
		return prodPkgList;
	}
	
	
}
