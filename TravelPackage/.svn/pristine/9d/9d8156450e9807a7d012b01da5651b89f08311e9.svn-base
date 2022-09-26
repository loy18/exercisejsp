package kr.or.ddit.app.pkg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import kr.or.ddit.app.pkg.vo.DetailTourVO;
import kr.or.ddit.app.pkg.vo.DtPkgVO;
import kr.or.ddit.app.pkg.vo.PkgVO;
import kr.or.ddit.app.pkg.vo.SearchVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class PkgDAOImpl implements IPkgDAO {
	private static IPkgDAO pkgDao;
	
	private SqlSession sqlSession;
	
	private PkgDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}
	
	public static IPkgDAO getInstance() {
		if(pkgDao == null) {
			pkgDao = new PkgDAOImpl();
		}
		return pkgDao;
	}
	
	
	@Override
	public int insertPkg(PkgVO pv) {
		int cnt = sqlSession.insert("pkg.insertPkg", pv);
		return cnt;
	}

	@Override
	public int updatePkg(PkgVO pv) {
		int cnt = sqlSession.update("pkg.update",pv);
		return cnt;
	}

	@Override
	public int deletePkg(String pkgId) {
		int cnt = sqlSession.delete("pkg.delete", pkgId);
		return cnt;
	}

	@Override
	public PkgVO getPkg(String pkgId) {
		PkgVO pkgVO = sqlSession.selectOne("pkg.getPkg", pkgId);
		return pkgVO;
	}

	@Override
	public List<PkgVO> getAllPkgList() {
		List<PkgVO> pkgList = sqlSession.selectList("pkg.pkgList");
		return pkgList;
	}

	@Override
	public List<PkgVO> searchPkgList(SearchVO schVO) {
		List<PkgVO> pkgList = sqlSession.selectList("pkg.search",schVO);
		return pkgList;
	}

	@Override
	public List<DtPkgVO> selectDtPkg(String pkgId) {
		List<DtPkgVO> dtPkgList = sqlSession.selectList("pkg.dtSelectList", pkgId);
		return dtPkgList;
	}

	@Override
	public List<PkgVO> getAllPkgList2() {
		List<PkgVO> pkgList = sqlSession.selectList("pkg.pkgList2");
		return pkgList;
	}

	@Override
	public List<DetailTourVO> selectDtTour(DetailTourVO dt) {
		List<DetailTourVO> dtTourList = sqlSession.selectList("pkg.dtTourSelectList", dt);
		return dtTourList;
	}
	
}
