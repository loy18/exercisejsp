package kr.or.ddit.app.compkg.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.compkg.vo.ComPkgVO;
import kr.or.ddit.app.compkg.dao.IComPkgDAO;
import kr.or.ddit.app.compkg.dao.ComPkgDAOImpl;


public class ComPkgServiceImpl implements IComPkgService {
	private static IComPkgService comPkgService;
	private IComPkgDAO comPkgDao;
	
	private ComPkgServiceImpl() {
		comPkgDao = ComPkgDAOImpl.getInstance();
	}
	
	public static IComPkgService getInstance() {
		if(comPkgService == null) {
			comPkgService = new ComPkgServiceImpl();
		}
		return comPkgService;
	}

	@Override
	public int registerComPkg( ComPkgVO cpv) {
		int cnt = comPkgDao.insertComPkg( cpv);
		return cnt;
	}


	@Override
	public int removeComPkg( ComPkgVO cpv) {
		int cnt = comPkgDao.deleteComPkg( cpv);
		return cnt;
	}


	@Override
	public List<ComPkgVO> getComPkgList( String pkgId) {
		List<ComPkgVO> ComPkgList = comPkgDao.getComPkgList( pkgId);
		return ComPkgList;
	}

	@Override
	public List<ComPkgVO> searchList( ComPkgVO cpv) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
