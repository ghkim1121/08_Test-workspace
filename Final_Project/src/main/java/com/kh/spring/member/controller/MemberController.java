package com.kh.spring.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
