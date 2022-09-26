package kr.or.ddit.app.pkg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.acm.service.AcommodationServiceImpl;
import kr.or.ddit.app.acm.service.IAcommodationService;
import kr.or.ddit.app.acm.vo.AcommodationVO;
import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;
import kr.or.ddit.app.compkg.service.ComPkgServiceImpl;
import kr.or.ddit.app.compkg.service.IComPkgService;
import kr.or.ddit.app.compkg.vo.ComPkgVO;
import kr.or.ddit.app.pkg.service.IPkgService;
import kr.or.ddit.app.pkg.service.PkgServiceImpl;
import kr.or.ddit.app.pkg.vo.DetailTourVO;
import kr.or.ddit.app.pkg.vo.DtPkgVO;
import kr.or.ddit.app.pkg.vo.PkgVO;
import kr.or.ddit.app.review.service.IReviewService;
import kr.or.ddit.app.review.service.ReviewServiceImpl;
import kr.or.ddit.app.review.vo.ReviewVO;
import kr.or.ddit.app.sch.service.ISchService;
import kr.or.ddit.app.sch.service.SchServiceImpl;
import kr.or.ddit.app.sch.vo.SchVO;
import kr.or.ddit.app.tour.service.ITourService;
import kr.or.ddit.app.tour.service.TourServiceImpl;
import kr.or.ddit.app.tour.vo.TourVO;
import kr.or.ddit.app.vehc.service.IVehcService;
import kr.or.ddit.app.vehc.service.VehcServiceImpl;
import kr.or.ddit.app.vehc.vo.VehcVO;

@WebServlet("/pkg/pkgDt.do")
public class DetailSelectController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pkgID = req.getParameter("pkgId"); // 패키지 아이디
		
		IComPkgService comService = ComPkgServiceImpl.getInstance();
		
		ISchService schService = SchServiceImpl.getInstance();
		IPkgService pkgService = PkgServiceImpl.getInstance();
		IVehcService vehcService = VehcServiceImpl.getInstance();
		IAtchFileService atchService = AtchFileServiceImpl.getInstance();
		IAcommodationService acmService = AcommodationServiceImpl.getInstance();
		ITourService tourService = TourServiceImpl.getInstance();
		
		PkgVO pkg = pkgService.getPkg(pkgID);
		List<ComPkgVO> comPkgList = comService.getComPkgList(pkgID); 
		
		AtchFileVO fileVO = new AtchFileVO();
		fileVO.setAtchFileId(pkg.getAtchFileId());
		AtchFileVO pkgFile = atchService.getAtchFileDetail(fileVO);
		
		List<SchVO> schList = schService.getSchList(pkgID);
		List<List<String>> tourIdList = new ArrayList<>();
		
		
		
		for(int i=0; i< schList.size(); i++) {
			SchVO sv = new SchVO();
			sv.setPkgId(pkgID);
			sv.setSchDay(1);
			
			tourIdList.add(schService.getTourList(sv));
		}
		
		List<AcommodationVO> acmList = new ArrayList<AcommodationVO>();
		List<VehcVO> vehcList = new ArrayList<VehcVO>();
		List<List<TourVO>> tourList = new ArrayList<>();
		List<AtchFileVO> acmFile = new ArrayList<AtchFileVO>();
		List<List<AtchFileVO>> tourFileList = new ArrayList<List<AtchFileVO>>(); 
		
		for(int i=0; i< schList.size(); i++) {
			AcommodationVO acmVo = acmService.getAcm(schList.get(i).getAcmId());
			acmList.add(acmVo);
			VehcVO vehc = vehcService.getVehc(schList.get(i).getVehcId());
			vehcList.add(vehc);
			
			AtchFileVO atch = new AtchFileVO();
			atch.setAtchFileId(acmVo.getAtchFileId());
			acmFile.add(atchService.getAtchFileDetail(atch));
			
			List<AtchFileVO> tourFile = new ArrayList<AtchFileVO>();
			List<TourVO> tourlt = new ArrayList<TourVO>();
			for(int j=0; j<tourIdList.size(); j++) {
				TourVO tourVO = tourService.getTour(tourIdList.get(i).get(j));
				AtchFileVO atch2 = new AtchFileVO();
				atch2.setAtchFileId(tourVO.getAtchFileId());
				tourFile.add(atchService.getAtchFileDetail(atch2));
				tourlt.add(tourVO);
			}
			tourList.add(tourlt);
			tourFileList.add(tourFile);
		}
		
		
		req.setAttribute("comPkgList", comPkgList);
		req.setAttribute("schList", schList);
		req.setAttribute("pkgVO", pkg);
		req.setAttribute("pkgFile", pkgFile);
		req.setAttribute("acmList", acmList);
		req.setAttribute("acmFile", acmFile);
		req.setAttribute("vehcList", vehcList);
		req.setAttribute("tourList", tourList);
		req.setAttribute("tourFileList", tourFileList);
		
		
		
		// 여기부터 리뷰
		IReviewService reviewService = ReviewServiceImpl.getInstance();
		
		List<ReviewVO> reviewList = reviewService.getAllReviewList();

		List<List<AtchFileVO>> atchFileList = new ArrayList<List<AtchFileVO>>();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();
		
		
	    for(int i=0; i<reviewList.size(); i++) {
		      if(reviewList.get(i).getAtchFileId() > 0) { // 첨부파일 존재
		    	  // 1-2. 첨부파일 정보 조회
		    	  AtchFileVO fileVO2 = new AtchFileVO();
		    	  fileVO2.setAtchFileId(reviewList.get(i).getAtchFileId());
		    	  atchFileList.add(fileService.getAtchFileList(fileVO2));
		    	  
		      } else {
		    	  atchFileList.add(null);
		      }
	    }
		
		
		req.setAttribute("reviewList", reviewList);
		req.setAttribute("atchFileList", atchFileList);
		
		
		
		
		req.getRequestDispatcher("/detailPage4.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	
	}
	
	
	
}
