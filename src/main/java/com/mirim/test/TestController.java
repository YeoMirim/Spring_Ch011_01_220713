package com.mirim.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller					// annotation
@RequestMapping("/board")    // �⺻ URL�� �Ǿ���� ex: board + write, board + reply�� board�� �⺻���� �Ǿ����
public class TestController {
	
	@RequestMapping(value = "/write")   //value�� ��ƿ� ��û��, views���� jsp���� ����������
	public String write(Model model) {			// value���� ��ġ���� �ʾƵ� ��, model ��ü�� ���� view�� ����
		
		model.addAttribute("id", "tiger");   // addAttribute(name, value), ������ ����
		
		
		return "write";			// view�� �̸� -> jsp������ �̸�
	}
	
	@RequestMapping("/reply")   // value�� ������ ��
	public ModelAndView reply() {			// ��ȯ�� ����
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("age", 30);
		mv.setViewName("board/reply");
		
		return mv;	// jsp������ ������ ����ִ� ��� jsp���ϸ� �տ� ������ ���������
	}
	
	  
}
