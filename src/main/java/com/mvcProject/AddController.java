package com.mvcProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddController {
	@RequestMapping("detail")
	public ModelAndView getEmployee(@RequestParam(name ="t1") Integer id) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("view");
		mv.addObject("result",id);
		return mv;
	}
}
