package kr.or.ddit.app.sch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.acm.dao.AcommodationDAOImpl;
import kr.or.ddit.app.acm.service.AcommodationServiceImpl;
import kr.or.ddit.app.acm.service.IAcommodationService;
import kr.or.ddit.app.acm.vo.AcommodationVO;
import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;
import kr.or.ddit.app.sch.service.ISchService;
import kr.or.ddit.app.sch.service.SchServiceImpl;
import kr.or.ddit.app.sch.vo.SchVO;
import kr.or.ddit.app.tour.service.ITourService;
import kr.or.ddit.app.tour.service.TourServiceImpl;
import kr.or.ddit.app.tour.vo.TourVO;
import kr.or.ddit.app.vehc.service.IVehcService;
import kr.or.ddit.app.vehc.service.VehcServiceImpl;
import kr.or.ddit.app.vehc.vo.VehcVO;


@WebServlet("/sch/schDetail.do")
public class DetailSchController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String pkgId = req.getParameter("pkgId");
		 String schDay = req.getParameter("schDay");
		 
	      
	      // 1. 서비스 객체 생성하기
	      ISchService schService = SchServiceImpl.getInstance();
	      IAtchFileService fileService = AtchFileServiceImpl.getInstance();
	      IVehcService vehcService = VehcServiceImpl.getInstance();
	      IAcommodationService acmService = AcommodationServiceImpl.getInstance();
	      ITourService tourService = TourServiceImpl.getInstance();
	      
	      SchVO sv = new SchVO();
	      sv.setPkgId(pkgId);
	      sv.setSchDay(Integer.parseInt(schDay));
	      
	      sv = schService.getSchForDay(sv);
	      List<String> tourIdList = schService.getTourList(sv);
	      
	      
	      // 각 VO에 데이터 저장
	      VehcVO vehcVO = vehcService.getVehc(sv.getVehcId());
	      AcommodationVO acmVO = acmService.getAcm(sv.getAcmId());
	      
	      
	      // acm 첨부파일 가져오기
	      if(acmVO.getAtchFileId() > 0) { // 첨부파일 존재
	    	  // 1-2. 첨부파일 정보 조회
	    	  AtchFileVO fileVO = new AtchFileVO();
	    	  fileVO.setAtchFileId(acmVO.getAtchFileId());
	    	  
	    	  List<AtchFileVO> atchFileList = 
	    			  fileService.getAtchFileList(fileVO);
	    	  
	    	  req.setAttribute("acmFileList", atchFileList);
	      }
	      
	      
	      
	      // 반복문 결과값 저장을 위한 외부 선언
	      List<TourVO> tourList = new ArrayList<TourVO>();
	      List<List<AtchFileVO>> tourFileList = new ArrayList<List<AtchFileVO>>();
	      for(int i=0; i<tourIdList.size(); i++) {
	    	  TourVO tourVO = tourService.getTour(tourIdList.get(i));
	    	  tourList.add(tourVO);
	    	  
	    	  
	    	  if(tourVO.getAtchFileId() > 0) { // 첨부파일 존재
		    	  // 1-2. 첨부파일 정보 조회
		    	  AtchFileVO fileVO = new AtchFileVO();
		    	  fileVO.setAtchFileId(acmVO.getAtchFileId());
		    	  
		    	  List<AtchFileVO> atchFileList = 
		    			  fileService.getAtchFileList(fileVO);
		    	  
		    	  tourFileList.add(atchFileList);
		      } else {
		    	  tourFileList.add(null);
		      }
	      }
	      
	      req.setAttribute("sv", sv);
	      req.setAttribute("vehcVO", vehcVO);
	      req.setAttribute("acmVO", acmVO);
	      req.setAttribute("tourList", tourList);
	      req.setAttribute("tourFileList", tourFileList);
	      
	      // 	sv
	      //	vehcVO
	      // 	acmVO
	      // 	acmFileList
	      // 	tourList
	      // 	tourFileList
	 
	      req.getRequestDispatcher("/sch/schDetail.jsp").forward(req, resp);
	      
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
