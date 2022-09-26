package kr.or.ddit.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.util.MyBatisUtil;

public class MemberDAOImpl implements IMemberDAO{
	private static IMemberDAO memDao;
	private SqlSession sqlSession;
	
	private MemberDAOImpl() {
		sqlSession = MyBatisUtil.getInstance(true);
	}
	
	public static IMemberDAO getInstance() {
		if(memDao == null) {
			memDao = new MemberDAOImpl();
		}
		return memDao;
	}
	
	@Override
	public int insertMember(MemberVO mv) {
		return sqlSession.insert("member.insertMember",mv);
	}

	@Override
	public boolean checkMember(String memId) {
		
		int cnt = sqlSession.selectOne("member.checkMember",memId);
		
		boolean chk = false;
		if(cnt > 0) {
			chk = true;
		}
		
		return chk;
	}

	@Override
	public int updateMember(MemberVO mv) {
		return sqlSession.update("member.updateMember",mv);
	}

	@Override
	public int deleteMember(String memId) {
		return sqlSession.delete("member.deleteMember",memId);
	}

	@Override
	public List<MemberVO> getAllMemberList() {
		return sqlSession.selectList("member.memberAllList");
	}

	@Override
	public List<MemberVO> SearchMemberList(MemberVO mv) {
		return sqlSession.selectList("member.searchMemberList",mv);
	}
	
	@Override
	public MemberVO getMember(String memId) {
		return sqlSession.selectOne("member.getMember", memId);
	}
	
}
