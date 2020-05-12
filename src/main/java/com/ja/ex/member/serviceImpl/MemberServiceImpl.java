package com.ja.ex.member.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.ex.mapper.MemberSQLMapper;
import com.ja.ex.vo.MemberVo;

@Service
public class MemberServiceImpl {
	
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	public void joinMember(MemberVo memberVo) {
		memberSQLMapper.m_insert(memberVo);
	}
	
	public MemberVo login(MemberVo memberVo) {
		
		return memberSQLMapper.m_selectIdAndPw(memberVo);
		
	}
	
}
