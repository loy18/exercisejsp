package kr.or.ddit.app.prodpkg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.prodpkg.vo.ProdPkgVO;
import kr.or.ddit.app.schcomb.vo.SchCombVO;

public interface IProdPkgDAO {
	
	// 등록
	public int insertProdPkg(SqlSession sqlSession, ProdPkgVO ppv);

	// 수정
	public int updateProdPkg(SqlSession sqlSession, ProdPkgVO ppv);
	
	// 삭제
	public int deleteProdPkg(SqlSession sqlSession, ProdPkgVO ppv);
	
	// 패키지의 관광상품 리스트
	public List<String> getPkgTourList(SqlSession sqlSession, String pkgId);
	
	// 검색 리스트
	public List<ProdPkgVO> searchList(SqlSession sqlSession, String sch);
}
