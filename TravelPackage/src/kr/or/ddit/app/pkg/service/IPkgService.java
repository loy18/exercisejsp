package kr.or.ddit.app.pkg.service;

import java.util.List;

import kr.or.ddit.app.pkg.vo.DetailTourVO;
import kr.or.ddit.app.pkg.vo.DtPkgVO;
import kr.or.ddit.app.pkg.vo.PkgVO;
import kr.or.ddit.app.pkg.vo.SearchVO;



public interface IPkgService {

	// Insert
		public int registerPkg(PkgVO pv);
		
		// Update
		public int modifyPkg(PkgVO pv);
		
		// Delete
		public int removePkg(String pkgId);
		
		// 정보 확인
		public PkgVO getPkg(String pkgId);
		
		// 전체 정보 리스트
		public List<PkgVO> getAllPkgList();
		
		// 검색 정보 리스트
		public List<PkgVO> searchList(SearchVO schVO);
		
		// 패키지 상세 정보 페이지 조회
		public List<DtPkgVO> selectDtPkg(String pkgId);

		// 전체 정보 리스트
		public List<PkgVO> getAllPkgList2();
		
		// 관광상품 상세 정보 페이지 조회
		public List<DetailTourVO> selectDtTour(DetailTourVO dt);
}
