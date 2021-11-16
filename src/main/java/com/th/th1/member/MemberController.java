package com.th.th1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//회원가입 폼 이동
	@GetMapping("memberJoin")
	public String setMemberInsert() throws Exception {
		return ("member/memberJoin");
	}
	
	//회원가입 폼 제출
	@PostMapping("memberJoin")
	public String setMemberInsert(MemberVO memberVO) throws Exception {
		int result = memberService.setMemberInsert(memberVO);
		
		return "redirect:../";
	}
	
}
