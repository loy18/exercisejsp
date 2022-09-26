package mvc.board.vo;

import java.util.Date;

/**
 * DB 테이블에 있는 컬럼을 기준으로 데이터를 객체화한 클래스이다.
 * <p>
 * 	DB테이블의 '컬럼'이 이클래스의 '멤버변수'가 된다.<br>
 * 	DB테이블의 컬럼과 이 클래스의 멤버변수를 매핑하는 역할을 수행한다.
 * </p>
 * @author PC-04
 *
 */
public class BoardVO {
	private String boardNo;
	private String boardTitle;
	private String boardWriter;
	private String date;
	private String boardContents;
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	@Override
	public String toString() {
		return "MemberVO [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter
				+ ", date=" + date + ", boardContents=" + boardContents + "]";
	}
	
}
