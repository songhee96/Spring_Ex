package com.ja.ex.vo;

public class BoardVo {
	
	private int Board_no;
	private int member_no;
	private String Board_title;
	private String Board_Content;
	private String Board_ReadCount;
	private String Board_WriteDate;
	public BoardVo() {
		super();
	}
	public BoardVo(int board_no, int member_no, String board_title, String board_Content, String board_ReadCount,
			String board_WriteDate) {
		super();
		Board_no = board_no;
		this.member_no = member_no;
		Board_title = board_title;
		Board_Content = board_Content;
		Board_ReadCount = board_ReadCount;
		Board_WriteDate = board_WriteDate;
	}
	public int getBoard_no() {
		return Board_no;
	}
	public void setBoard_no(int board_no) {
		Board_no = board_no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getBoard_title() {
		return Board_title;
	}
	public void setBoard_title(String board_title) {
		Board_title = board_title;
	}
	public String getBoard_Content() {
		return Board_Content;
	}
	public void setBoard_Content(String board_Content) {
		Board_Content = board_Content;
	}
	public String getBoard_ReadCount() {
		return Board_ReadCount;
	}
	public void setBoard_ReadCount(String board_ReadCount) {
		Board_ReadCount = board_ReadCount;
	}
	public String getBoard_WriteDate() {
		return Board_WriteDate;
	}
	public void setBoard_WriteDate(String board_WriteDate) {
		Board_WriteDate = board_WriteDate;
	}
	
	
	

}
