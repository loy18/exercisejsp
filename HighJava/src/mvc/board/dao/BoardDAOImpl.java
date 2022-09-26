package mvc.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mvc.util.JDBCUtil3;
import mvc.board.vo.BoardVO;

public class BoardDAOImpl implements IBoardDAO{
	
	private static IBoardDAO boardDao;
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private BoardDAOImpl() {
		
	}
	
	public static IBoardDAO getInstance() {
		if(boardDao == null) {
			boardDao = new BoardDAOImpl();
		}
		return boardDao;
	}
	
	@Override
	public int insertBoard(BoardVO bv){
		int cnt = 0;
		 try {
				conn = JDBCUtil3.getConnection();
				
				String sql = "INSERT INTO jdbc_board (\n" + 
						"    board_no,\n" + 
						"    board_title,\n" + 
						"    board_writer,\n" + 
						"    board_content,\n" + 
						"    board_date\n" + 
						") VALUES (\n" + 
						"    board_seq.nextVal,\n" + 
						"    ?,\n" + 
						"    ?,\n" + 
						"    ?,\n" + 
						"    sysdate)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bv.getBoardTitle());
				pstmt.setString(2, bv.getBoardWriter());
				pstmt.setString(3, bv.getBoardContents());
				
				cnt = pstmt.executeUpdate();

			} catch (SQLException ex) {
				ex.printStackTrace();
				throw new RuntimeException("회원등록 과정중 예외발생",ex);
			}finally {
				JDBCUtil3.close(conn, stmt, pstmt, rs);
			}
		return cnt;
	}

	@Override
	public boolean checkBoard(String boardNo) {
		boolean chk = false;
		try {
			conn = JDBCUtil3.getConnection();
			
			String sql = " select count(*) as cnt from jdbc_board\n" + 
					" where board_no = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardNo);
			
			rs = pstmt.executeQuery();
			
			int cnt = 0;
			
			if(rs.next()) {
				cnt = rs.getInt("cnt");
			}
			if(cnt > 0) {
				chk = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		return chk;
	}

	@Override
	public int updateBoard(BoardVO mv) {
		int cnt = 0;
		try {
			conn = JDBCUtil3.getConnection();
			
			String sql = " UPDATE jdbc_board\n" + 
					"    SET\n" + 
					"         board_title = ? \n" + 
					"        ,board_writer = ? \n" + 
					"        ,board_content = ? \n" + 
					"	 WHERE \n" + 
					"    board_no =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv.getBoardTitle());
			pstmt.setString(2, mv.getBoardWriter());
			pstmt.setString(3, mv.getBoardContents());
			pstmt.setString(4, mv.getBoardNo());
			
			cnt = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("회원 정보 수정 과정중 예외발생",e);
		}finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		return cnt;
	}

	@Override
	public int deleteBoard(String boardNo) {
		int cnt = 0;
		try {
			conn = JDBCUtil3.getConnection();
			
			String sql = "delete from jdbc_board where board_no = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardNo);
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("회원삭제 과정중 예외발생",e);
		}finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		return cnt;
	}

	@Override
	public List<BoardVO> getAllBoardList() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil3.getConnection();
			
			String sql = "select * from jdbc_board";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BoardVO bv = new BoardVO();
				bv.setBoardNo(rs.getString("board_no"));
				bv.setBoardTitle(rs.getString("board_title"));
				bv.setBoardWriter(rs.getString("board_writer"));
				bv.setBoardContents(rs.getString("board_content"));
				bv.setDate(rs.getString("board_date").substring(0, 10));
				
				boardList.add(bv);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("전체 회원 죄회 과정중 예외발생",e);
		}finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		return boardList;
	}

	@Override
	public List<BoardVO> searchBoardList(BoardVO bv) {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil3.getConnection();
			String sql = "select * from jdbc_board where 1=1";
			if(bv.getBoardNo() != null&& !bv.getBoardNo().equals("")) {
				sql += "and board_no = ?";
				
			}
			if(bv.getBoardTitle() != null&& !bv.getBoardTitle().equals("")) {
				sql += "and board_title = ?";
			}
			if(bv.getBoardWriter() != null&& !bv.getBoardWriter().equals("")) {
				sql += "and board_writer = ?";
			}
			if(bv.getBoardContents() != null&& !bv.getBoardContents().equals("")) {
				sql += "and board_content like '%' || ? || '%' ";
			}
			
			pstmt = conn.prepareStatement(sql);
			int index = 1;
			if(bv.getBoardNo() != null&& !bv.getBoardNo().equals("")) {
				pstmt.setString(index++, bv.getBoardNo());
			}
			if(bv.getBoardTitle() != null&& !bv.getBoardTitle().equals("")) {
				pstmt.setString(index++, bv.getBoardTitle());
			}
			if(bv.getBoardWriter() != null&& !bv.getBoardWriter().equals("")) {
				pstmt.setString(index++, bv.getBoardWriter());
			}
			if(bv.getBoardContents() != null&& !bv.getBoardContents().equals("")) {
				pstmt.setString(index++, bv.getBoardContents());
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO bv1 = new BoardVO();
				bv1.setBoardNo(rs.getString("board_no"));
				bv1.setBoardTitle(rs.getString("board_title"));
				bv1.setBoardWriter(rs.getString("board_writer"));
				bv1.setBoardContents(rs.getString("board_content"));
				bv1.setDate(rs.getString("board_date"));
				
				boardList.add(bv1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil3.close(conn, stmt, pstmt, rs);
		}
		return boardList;
	}

}
