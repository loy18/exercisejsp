package mvc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mvc.util.JDBCUtil3;


public class MemberDAOImpl implements IMemberDAO{
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	@Override
	public int insertMember(MemberVO mv) {
		
		int result = 0;
		
		try {
			conn = JDBCUtil3.getConnection();
			
			StringBuilder builder = new StringBuilder();
			builder.append(" INSERT INTO mymember (");
			builder.append("     mem_id,");
			builder.append("     mem_name,");
			builder.append("     mem_tel,");
			builder.append("     mem_addr,");
			builder.append("     reg_dt");
			builder.append(" ) VALUES (");
			builder.append("     ?,");
			builder.append("     ?,");
			builder.append("     ?,");
			builder.append("     ?,");
			builder.append("     sysdate)");
			String sql = builder.toString();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv.getMemId());
			pstmt.setString(2, mv.getMemName());
			pstmt.setString(3, mv.getMemTel());
			pstmt.setString(4, mv.getMemAddr());
			
			result = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("회원등록 과정중 예외발생",e);
		} finally {
			// 자원 반납
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		return result;
	}

	@Override
	public boolean checkMember(String memId) {
		boolean chk = false;
		
		try {
			conn = JDBCUtil3.getConnection();
			
			StringBuilder builder = new StringBuilder();
			builder.append(" SELECT");
			builder.append("     COUNT(*) as cnt");
			builder.append(" FROM");
			builder.append("     mymember");
			builder.append(" WHERE");
			builder.append("     mem_id = ?");
			
			String sql = builder.toString();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int result = rs.getInt("cnt");
				chk = result > 0 ? true : false;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("회원정보 확인중 예외발생",e);
		} finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		
		return chk;
	}

	@Override
	public int updateMember(MemberVO mv) {
		
		int result = 0;
		
		try {
			conn = JDBCUtil3.getConnection();
			
			StringBuilder builder = new StringBuilder();
			builder.append(" UPDATE mymember");
			builder.append("     SET");
			builder.append("         mem_name = ?,");
			builder.append("         mem_tel = ?,");
			builder.append("         mem_addr = ?");
			builder.append(" WHERE");
			builder.append("     mem_id = ?");
			String sql = builder.toString();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv.getMemName());
			pstmt.setString(2, mv.getMemTel());
			pstmt.setString(3, mv.getMemAddr());
			pstmt.setString(4, mv.getMemId());
			
			result = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("회원정보 수정중 예외발생",e);
		} finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		
		return result;
	}

	@Override
	public int deleteMember(String memId) {
		
		int result = 0;
		
		try {
			
			conn = JDBCUtil3.getConnection();
			
			StringBuilder builder = new StringBuilder();
			builder.append(" DELETE FROM mymember WHERE");
			builder.append("     mem_id =?");
			String sql = builder.toString();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			
			result = pstmt.executeUpdate();
			
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("회원정보 삭제중 예외발생",e);
		} finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		
		return result;
	}

	@Override
	public List<MemberVO> getAllMemberList() {
		
		List<MemberVO> memList = new ArrayList<MemberVO>();
		
		try {
			conn = JDBCUtil3.getConnection();
			
			String sql = "select * from mymember";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String memId = rs.getString("mem_id");
				String memName = rs.getString("mem_name");
				String memTel = rs.getString("mem_tel");
				String memAddr = rs.getString("mem_addr");
				
				memList.add(new MemberVO(memId, memName, memTel, memAddr));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("전체회원 조회중 예외발생",e);
		} finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		
		return memList;
	}
	
	@Override
	public List<MemberVO> SearchMemberList(MemberVO mv) {
		
		List<MemberVO> memList = new ArrayList<>();
		try {
			conn = JDBCUtil3.getConnection();
			StringBuilder builder = new StringBuilder();
			builder.append("select * from mymember where 1=1");
			
			if(mv.getMemId() != null && !mv.getMemId().equals("")) {
				builder.append(" and mem_id = ?");
			}
			if(mv.getMemName() != null && !mv.getMemName().equals("")) {
				builder.append(" and mem_name = ?");
			}
			if(mv.getMemTel() != null && !mv.getMemTel().equals("")) {
				builder.append(" and mem_tel = ?");
			}
			if(mv.getMemAddr() != null && !mv.getMemAddr().equals("")) {
				builder.append(" and mem_addr like '%' || ? || '%' ");
			}
			
			String sql = builder.toString();
			pstmt = conn.prepareStatement(sql);
			
			int index = 1;
			
			if(mv.getMemId() != null && !mv.getMemId().equals("")) {
				pstmt.setString(index++, mv.getMemId());
			}
			if(mv.getMemName() != null && !mv.getMemName().equals("")) {
				pstmt.setString(index++, mv.getMemName());
			}
			if(mv.getMemTel() != null && !mv.getMemTel().equals("")) {
				pstmt.setString(index++, mv.getMemTel());
			}
			if(mv.getMemAddr() != null && !mv.getMemAddr().equals("")) {
				pstmt.setString(index++, mv.getMemAddr()); 
			}
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO mv2 = new MemberVO();
				mv2.setMemId(rs.getString("mem_id"));
				mv2.setMemName(rs.getString("mem_name"));
				mv2.setMemTel(rs.getString("mem_tel"));
				mv2.setMemAddr(rs.getString("mem_addr"));
				memList.add(mv2);
			}
			
			
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		return memList;
	}
}
