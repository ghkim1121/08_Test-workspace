package com.kh.spring.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring.member.model.vo.Member;

@Controller
public class MemberController {
	
	// 무진 - 240528
	// 로그인 메소드
	@RequestMapping("login.me")
	public String loginMember(Member m) {
		
		return "redirect:/";
	}

	// 무진 - 240528
	// 로그아웃 메소드
	@RequestMapping("logout.me")
	public String logoutMember(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	// 무진 - 240529
	// 회원탈퇴 메소드
	public String deleteMember(String userId, String userPwd) {
		
		return "redirect:/";
	}
	
	// 무진 - 240529
	// 아이디 중복체크 메소드
	@ResponseBody
	@RequestMapping(value="idCheck.me", produces="text/html; charset=UTF-8")
	public String idCheck() {
		
		return "체크값";
	}

}
