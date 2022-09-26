package kr.or.ddit.app.prodpkg.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.prodpkg.vo.ProdPkgVO;


public interface IProdPkgService {

	// Insert
		public int registerProdPkg(SqlSession sqlSession, ProdPkgVO ppv);
		
		// Update
		public int modifyProdPkg(SqlSession sqlSession, ProdPkgVO ppv);
		
		// Delete
		public int removeProdPkg(SqlSession sqlSession, ProdPkgVO ppv);
		
		// 전체 정보 리스트
		public List<String> getPkgTourList(SqlSession sqlSession, String pkgId);
		
		// 검색 정보 리스트
		public List<ProdPkgVO> searchList(SqlSession sqlSession, String sch);
}
