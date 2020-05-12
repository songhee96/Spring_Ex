package com.ja.ex.mapper;

import org.apache.ibatis.annotations.Insert;

import com.ja.ex.vo.MemberVo;

public interface MemberSQLMapper {
	
	
	public void m_insert(MemberVo memberVo);
	
	public MemberVo m_selectIdAndPw(MemberVo aaa);
	
	
	
	

}
