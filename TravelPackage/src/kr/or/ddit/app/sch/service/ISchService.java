package kr.or.ddit.app.sch.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.sch.vo.SchVO;


public interface ISchService {

		// Insert
		public int registerSch(SchVO sv);
		
		// Update
		public int modifySch(SchVO sv);
		
		// Delete
		public int removeSch(SchVO sv);
		
		// 정보 확인
		public SchVO getSchForDay(SchVO sv);
		
		// 전체 정보 리스트
		public List<SchVO> getSchList(String pkgId);
		
		public List<String> getTourList(SchVO sv);
}
