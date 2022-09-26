package kr.or.ddit.app.review.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;
import kr.or.ddit.app.review.service.IReviewService;
import kr.or.ddit.app.review.service.ReviewServiceImpl;
import kr.or.ddit.app.review.vo.ReviewVO;

@WebServlet("/review/reviewList.do")
public class ListReviewController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IReviewService reviewService = ReviewServiceImpl.getInstance();
		
		List<ReviewVO> reviewList = reviewService.getAllReviewList();

		List<List<AtchFileVO>> atchFileList = new ArrayList<List<AtchFileVO>>();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();
		
		
	    for(int i=0; i<reviewList.size(); i++) {
		      if(reviewList.get(i).getAtchFileId() > 0) { // 첨부파일 존재
		    	  // 1-2. 첨부파일 정보 조회
		    	  AtchFileVO fileVO = new AtchFileVO();
		    	  fileVO.setAtchFileId(reviewList.get(i).getAtchFileId());
		    	  atchFileList.add(fileService.getAtchFileList(fileVO));
		    	  
		      } else {
		    	  atchFileList.add(null);
		      }
	    }
		
		
		
		req.setAttribute("reviewList", reviewList);
		req.setAttribute("atchFileList", atchFileList);
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/review/reviewList.jsp");
		
		dispatcher.forward(req, resp); 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
