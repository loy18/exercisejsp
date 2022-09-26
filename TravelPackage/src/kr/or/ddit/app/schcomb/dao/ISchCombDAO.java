package kr.or.ddit.app.schcomb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.schcomb.vo.SchCombVO;

public interface ISchCombDAO {
	
	// 등록
	public int insertSchComb(SqlSession sqlSession, SchCombVO scv);

	// 수정
	public int updateSchComb(SqlSession sqlSession, SchCombVO scv);
	
	// 삭제
	public int deleteSchComb(SqlSession sqlSession, SchCombVO scv);
	
	// 모든 리스트 
	public List<SchCombVO> getPkgSchCombList(SqlSession sqlSession, String pkgId);
	
	// 검색 리스트
	public List<SchCombVO> searchSchCombList(SqlSession sqlSession, SchCombVO scv);
}
