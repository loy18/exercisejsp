package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.dao.IMemberDAO;
import kr.or.ddit.member.dao.MemberDAOImpl;
import kr.or.ddit.member.vo.MemberVO;

public class MemberServiceImpl implements IMemberService {
	private static IMemberService memService;
	private IMemberDAO memDao;
	
	private MemberServiceImpl() {
		 memDao = MemberDAOImpl.getInstance();
	}
	
	public static IMemberService getInstance() {
		if(memService == null) {
			memService = new MemberServiceImpl();
		}
		return memService;
	}
	
	@Override
	public int registerMember(MemberVO mv) {
		return memDao.insertMember(mv);
	}

	@Override
	public boolean checkMember(String memId) {
		return memDao.checkMember(memId);
	}

	@Override
	public int modifyMember(MemberVO mv) {
		return memDao.updateMember(mv);
	}

	@Override
	public int removeMember(String memId) {
		return memDao.deleteMember(memId);
	}

	@Override
	public List<MemberVO> getAllMemberList() {
		return memDao.getAllMemberList();
	}
	
	public void accountTransfer() {
		try {
			// 트랜잭션 시작
			// 계좌 DAO.update(); 인출 
			// 계좌 DAO.update(); 입금
			// 트랜잭션 정상 종료(commit)
		} catch(Exception e) {
			// 롤백처리
		}
		
	}
	
	@Override
	public List<MemberVO> SearchMemberList(MemberVO mv) {
		return memDao.SearchMemberList(mv);
	}
	
	@Override
	public MemberVO getMember(String memId) {
		return memDao.getMember(memId);
	}
	
}
