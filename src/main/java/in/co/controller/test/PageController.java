package in.co.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class PageController {
	@RequestMapping({"/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Test PageController Home");
		mv.addObject("userClickHome", true);
		return mv;
	}

}
