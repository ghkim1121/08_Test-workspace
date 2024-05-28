package com.kh.spring.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	// 가현 - 240528
	// 회원가입 메소드
	@RequestMapping("insert.me")
	public ModelAndView insertMember(Member m,
									 ModelAndView mv) {
		
		mv.setViewName("redirect:/");
		
		return mv;
	}
	
	// 가현 - 240528
	// 마이페이지 메소드
	public String myPage() {
		
		return "member/myPage";
	}
	
	
}






