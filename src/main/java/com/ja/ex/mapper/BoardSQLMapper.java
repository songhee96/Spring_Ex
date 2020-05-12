package com.ja.ex.mapper;

import java.util.List;

import com.ja.ex.vo.BoardVo;

public interface BoardSQLMapper {
	
	
	public void b_insert(BoardVo boardVo);
	
	public BoardVo b_selectByNo(BoardVo board_no);
	
	public List<BoardVo> b_selectAll();
}
