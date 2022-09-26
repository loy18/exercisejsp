package kr.or.ddit.app.mem.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.mem.vo.MemberVO;
import kr.or.ddit.app.util.MyBatisUtil;

public class MemDaoImpl implements IMemDao {

	private static IMemDao memDao;

	private SqlSession sql;

	private MemDaoImpl() {
		sql = MyBatisUtil.getInstance(true);
	}

	public static IMemDao getInstance() {
		if (memDao == null) {
			memDao = new MemDaoImpl();
		}

		return memDao;
	}

	@Override
	public int singUp(MemberVO mv) {
		
		int rs = sql.insert("mem.insertMem", mv);
		
		return rs;
	}

	@Override
	public String idCheck(String memMail) {
		
		String rs = sql.selectOne("mem.idCheck",memMail);
		
//		boolean result = false;
//		
//		if(rs != null) {
//			result = true;
//		}else {
//			result = false;
//		}
		
		return rs;
	}

	@Override
	public String changeInfoCheck(String memMail) {
		
		String rs = sql.selectOne("mem.changeInfoCheck", memMail);
		
		return rs;
	}

	@Override
	public int updateMember(MemberVO mv) {
		
		int rs = sql.update("mem.updateInfo", mv);
		
		return rs;
	}
	
	@Override
	public int ranNumPw(MemberVO mv) {
		
		int rs = sql.update("mem.updatePw", mv);
		
		return rs;
	}
	
	@Override
	public List<MemberVO> memberList() {
		
		List<MemberVO> rs = sql.selectList("mem.memberList");
		
		return rs;
	}

	@Override
	public int deleteMem(String memMail) {
		
		int rs = sql.delete("mem.deleteMem", memMail);
		
		return rs;
	}
	
	@Override
	public int delMem(String memMail) {
		
		int rs = sql.delete("mem.delMem", memMail);
		
		return rs;
	}

	@Override
	public MemberVO selectMem(MemberVO mv) {

		MemberVO rs = sql.selectOne("mem.selectMem", mv);
		
		return rs;
	}

	@Override
	public MemberVO searchId(MemberVO mv) {

		MemberVO rs = sql.selectOne("mem.searchId", mv);

		return rs;
	}

	@Override
	public MemberVO searchPw(MemberVO mv) {
		MemberVO rs = sql.selectOne("mem.searchPw", mv);

		return rs;
	}








}
