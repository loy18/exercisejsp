package kr.or.ddit.app.pkg.dao;

import java.util.List;

import kr.or.ddit.app.pkg.vo.DetailTourVO;
import kr.or.ddit.app.pkg.vo.DtPkgVO;
import kr.or.ddit.app.pkg.vo.PkgVO;
import kr.or.ddit.app.pkg.vo.SearchVO;


public interface IPkgDAO {
	
	// 등록
	public int insertPkg(PkgVO pv);

	// 수정
	public int updatePkg(PkgVO pv);
	
	// 삭제
	public int deletePkg(String pkgId);
	
	// 관광 정보 가져오기
	public PkgVO getPkg(String pkgId);
	
	// 모든 리스트 
	public List<PkgVO> getAllPkgList();
	// 모든 리스트 
	public List<PkgVO> getAllPkgList2();
	
	// 검색 리스트
	public List<PkgVO> searchPkgList(SearchVO schVO);
	
	// 패키지 상세 정보 페이지 조회
	public List<DtPkgVO> selectDtPkg(String pkgId);
	
	// 관광상품 상세 정보 페이지 조회
	public List<DetailTourVO> selectDtTour(DetailTourVO dt);
}
