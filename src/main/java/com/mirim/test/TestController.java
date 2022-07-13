package com.mirim.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller					// annotation
@RequestMapping("/board")    // 기본 URL이 되어버림 ex: board + write, board + reply로 board가 기본값이 되어버림
public class TestController {
	
	@RequestMapping(value = "/write")   //value는 잡아올 요청값, views에서 jsp파일 만들어줘야함
	public String write(Model model) {			// value값과 일치하지 않아도 됨, model 객체를 통해 view를 전달
		
		model.addAttribute("id", "tiger");   // (name, value)
		
		
		return "write";			// view의 이름 -> jsp파일의 이름
	}
	
	@RequestMapping("/reply")   // value는 지워도 됨
	public ModelAndView reply() {			// 반환값 변경
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("age", 30);
		mv.setViewName("board/reply");
		
		return mv;	// jsp파일이 폴더에 들어있는 경우 jsp파일명 앞에 폴더적 적어줘야함
	}
	
	  
}
