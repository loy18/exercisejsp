package mvc.member;

import java.util.List;


public class MemberServiceImpl implements IMemberService {

	private IMemberDAO memDao;
	
	 public MemberServiceImpl() {
		 memDao = new MemberDAOImpl();
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
	
}
