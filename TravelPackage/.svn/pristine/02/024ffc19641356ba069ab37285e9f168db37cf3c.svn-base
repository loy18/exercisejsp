package kr.or.ddit.app.pkg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;
import kr.or.ddit.app.pkg.service.IPkgService;
import kr.or.ddit.app.pkg.service.PkgServiceImpl;
import kr.or.ddit.app.pkg.vo.PkgVO;
import kr.or.ddit.app.pkg.vo.SearchVO;
import kr.or.ddit.app.review.service.IReviewService;
import kr.or.ddit.app.review.service.ReviewServiceImpl;
import kr.or.ddit.app.review.vo.ReviewVO;


@WebServlet("/pkg/pkgSearch.do")
public class SearchPkgController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		// 검색시 받을 파라미터
		String search = req.getParameter("search");
		String pkgDay = req.getParameter("pkgDay");
		String pkgPrice = req.getParameter("pkgPrice");
		String vehcComp = req.getParameter("vehcComp");
		String comPkgDay = req.getParameter("comPkgDay");
		if(search == null) {
			search = "";
		}
		if(pkgDay == null) {
			pkgDay = "";
		}
		if(pkgPrice == null) {
			pkgPrice = "";
		}
		if(vehcComp == null) {
			vehcComp = "";
		}
		if(comPkgDay == null) {
			comPkgDay = "";
		}
		
		SearchVO schVO = new SearchVO();
		schVO.setSearch(search);
		schVO.setComPkgDay(comPkgDay);
		schVO.setPkgDay(pkgDay);
		schVO.setPkgPri(pkgPrice);
		schVO.setVehcComp(vehcComp);
		
		IPkgService pkgService = PkgServiceImpl.getInstance();
		
		
		
		
	      IReviewService reviewService = ReviewServiceImpl.getInstance();
	      List<PkgVO> pvList = pkgService.searchList(schVO);
	      List<String> tagList = new ArrayList<String>();
	      List<ReviewVO> revList = new ArrayList<ReviewVO>();
	      
	      for(int i=0; i<pvList.size(); i++) {
	    	  String[] tag = pvList.get(i).getPkgNm().split("#");
	    	  String fullTag = "";
	    	  
	    	  if(!tag[0].equals("")) {
	    		  for(int j=1; j<tag.length; j++) {
	    			  fullTag += "#" + tag[j];
	    		  }
	    	  }
	    	  revList.add(reviewService.getReviewAvg(
	    			  				String.valueOf(
	    			  						pvList.get(i).getPkgId())));
	    	  tagList.add(fullTag);
	      }
	      
	      
	      
	      IAtchFileService fileService = AtchFileServiceImpl.getInstance();
	      List<List<AtchFileVO>> atchFileList = new ArrayList<List<AtchFileVO>>();
	      for(int i=0; i<pvList.size(); i++) {
		      if(pvList.get(i).getAtchFileId() > 0) { // 첨부파일 존재
		    	  // 1-2. 첨부파일 정보 조회
		    	  AtchFileVO fileVO = new AtchFileVO();
		    	  fileVO.setAtchFileId(pvList.get(i).getAtchFileId());
		    	  
		    	  atchFileList.add(fileService.getAtchFileList(fileVO));
		    	  
		      } else {
		    	  atchFileList.add(null);
		      }
	      }
	      
	      req.setAttribute("search", search);
	      req.setAttribute("pkgDay", pkgDay);
	      req.setAttribute("pkgPrice", pkgPrice);
	      req.setAttribute("vehcComp", vehcComp);
	      req.setAttribute("comPkgDay", comPkgDay);
	      req.setAttribute("pvList", pvList);
	      req.setAttribute("tagList", tagList);
	      req.setAttribute("revList", revList);
	      req.setAttribute("atchFileList", atchFileList);
	      req.getRequestDispatcher("/pkg/pkgSearch.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
