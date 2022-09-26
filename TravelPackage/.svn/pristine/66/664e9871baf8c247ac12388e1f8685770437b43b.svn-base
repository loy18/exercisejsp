package kr.or.ddit.app.compkg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.compkg.vo.ComPkgVO;

public interface IComPkgDAO {
	
	// 등록
	public int insertComPkg(ComPkgVO spv);

	// 수정
	public int updateComPkg(ComPkgVO spv);
	
	// 삭제
	public int deleteComPkg(ComPkgVO spv);
	
	// 모든 리스트 
	public List<ComPkgVO> getComPkgList(String pkgId);
	
	// 검색 리스트
	public List<ComPkgVO> searchComPkgList(ComPkgVO spv);
}
