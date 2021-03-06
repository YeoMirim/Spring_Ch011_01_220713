package com.mirim.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller						// annotation
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)	// method=get 방식은 생략가능, 요청을 잡아줌
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();		// 현재 데이터
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);  // 현재 시간
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );    // 현재 시간을 serverTime이라는 이름으로 model에 심음
		
		return "helloworld";  // view의 이름 -> jsp파일의 이름
	}
	
}
