package kr.or.ddit.app.basic.controller;

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


@WebServlet("/index.do")
public class IndexController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	      // 1. 서비스 객체 생성하기
	      IPkgService pkgService = PkgServiceImpl.getInstance();
	      
	      List<PkgVO> pkgList = pkgService.getAllPkgList();
	      List<PkgVO> pkgList2 = pkgService.getAllPkgList2();
	      IAtchFileService fileService = AtchFileServiceImpl.getInstance();
	      List<List<AtchFileVO>> atchFileList = new ArrayList<List<AtchFileVO>>();
	      List<List<AtchFileVO>> atchFileList2 = new ArrayList<List<AtchFileVO>>();
	      for(int i=0; i<pkgList.size(); i++) {
		      if(pkgList.get(i).getAtchFileId() > 0) { // 첨부파일 존재
		    	  // 1-2. 첨부파일 정보 조회
		    	  AtchFileVO fileVO = new AtchFileVO();
		    	  fileVO.setAtchFileId(pkgList.get(i).getAtchFileId());
		    	  
		    	  atchFileList.add(fileService.getAtchFileList(fileVO));
		    	  
		      } else {
		    	  atchFileList.add(null);
		      }
	      }
	      
	      for(int i=0; i<pkgList2.size(); i++) {
	    	  if(pkgList2.get(i).getAtchFileId() > 0) { // 첨부파일 존재
	    		  // 1-2. 첨부파일 정보 조회
	    		  AtchFileVO fileVO = new AtchFileVO();
	    		  fileVO.setAtchFileId(pkgList2.get(i).getAtchFileId());
	    		  
	    		  atchFileList2.add(fileService.getAtchFileList(fileVO));
	    		  
	    	  } else {
	    		  atchFileList2.add(null);
	    	  }
	      }
	      
	      req.setAttribute("pkgList", pkgList);
	      req.setAttribute("pkgList2", pkgList2);
	      req.setAttribute("atchFileList", atchFileList);
	      req.setAttribute("atchFileList2", atchFileList2);
	      req.getRequestDispatcher("/recomm.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
