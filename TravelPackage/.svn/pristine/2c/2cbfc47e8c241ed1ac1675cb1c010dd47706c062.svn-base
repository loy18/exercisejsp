package kr.or.ddit.app.compkg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.compkg.vo.ComPkgVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class ComPkgDAOImpl implements IComPkgDAO {
	private static IComPkgDAO comPkgDao;
	private SqlSession sqlSession;
	
	private ComPkgDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}
	
	public static IComPkgDAO getInstance() {
		if(comPkgDao == null) {
			comPkgDao = new ComPkgDAOImpl();
		}
		return comPkgDao;
	}
	
	
	@Override
	public int insertComPkg( ComPkgVO spv) {
		int cnt = 0;
		try {
			cnt = sqlSession.insert("comPkg.insertComPkg", spv);
		} catch(Exception e) { 
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateComPkg( ComPkgVO spv) {
		int cnt = sqlSession.update("comPkg.update",spv);
		return cnt;
	}

	@Override
	public int deleteComPkg( ComPkgVO spv) {
		int cnt = sqlSession.delete("comPkg.delete", spv);
		return cnt;
	}

	@Override
	public List<ComPkgVO> getComPkgList( String pkgId) {
		List<ComPkgVO> comPkgList = sqlSession.selectList("comPkg.comPkgList", pkgId);
		return comPkgList;
	}

	@Override
	public List<ComPkgVO> searchComPkgList( ComPkgVO spv) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
