package kr.or.ddit.app.compkg.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.compkg.vo.ComPkgVO;


public interface IComPkgService {

		// Insert
		public int registerComPkg( ComPkgVO spv);
		
		// Delete
		public int removeComPkg( ComPkgVO spv);
		
		// 전체 정보 리스트
		public List<ComPkgVO> getComPkgList( String pkgId);
		
		// 검색 정보 리스트
		public List<ComPkgVO> searchList( ComPkgVO spv);
}
