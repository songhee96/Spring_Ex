package com.ja.ex.board.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ja.ex.mapper.BoardSQLMapper;
import com.ja.ex.vo.BoardVo;

public class BoardServiceImpl {
	
	private BoardSQLMapper boardSQLMapper;
	
	public List<Map<String,Object>> showBoardList() {
		//List를 리턴하기 위해 선언하기
		List<Map<String,Object>> list = new ArrayList<String>();
		//BoardVo에 b_selectAll()내용을 담기 위해 list를 하나더 만든다.
		
		List<BoardVo> b_list = boardSQLMapper.b_selectAll();   
	
		
		return list;
	}

	
}
