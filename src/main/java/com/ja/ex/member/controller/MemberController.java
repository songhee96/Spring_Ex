package com.ja.ex.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.ex.member.serviceImpl.*;
import com.ja.ex.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberServiceImpl memberService ;
	
	@RequestMapping("/login_page.do")
	public String loginPage() {
		
		
		return "member/login_page";
	}
	
	@RequestMapping("/join_member_page.do")
	public String joinMemberPage() {
		return "member/join_member_page";
	}
	
	@RequestMapping("/join_member_process.do")
	public String joinMemberProcess(MemberVo memberVo) {
		
		memberService.joinMember(memberVo);
		
		return "redirect:./login_page.do";
	}
	
	@RequestMapping("/login_process.do")
	public String loginProcess(MemberVo memberVo, HttpSession session) {
		
		MemberVo userData = memberService.login(memberVo);
		
		if(userData == null) {
			return "/member/login_fail";
		}else {
			//로그인 성공
			session.setAttribute("sessionUser", userData);
			return "redirect:/board/main_page.do";
		}
		
		
		
	}
	@RequestMapping("/logout_process.do")
	public String logoutProcess(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/board/main_page.do";
	}
	
	
	

}
