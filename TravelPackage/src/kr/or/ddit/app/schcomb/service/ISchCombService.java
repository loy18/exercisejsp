package kr.or.ddit.app.schcomb.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.schcomb.vo.SchCombVO;


public interface ISchCombService {

	// Insert
		public int registerSchComb(SqlSession sqlSession, SchCombVO scv);
		
		// Update
		public int modifySchComb(SqlSession sqlSession, SchCombVO scv);
		
		// Delete
		public int removeSchComb(SqlSession sqlSession, SchCombVO scv);
		
		// 전체 정보 리스트
		public List<SchCombVO> getPkgSchCombList(SqlSession sqlSession, String pkgId);
		
		// 검색 정보 리스트
		public List<SchCombVO> searchList(SqlSession sqlSession, SchCombVO scv);
}
