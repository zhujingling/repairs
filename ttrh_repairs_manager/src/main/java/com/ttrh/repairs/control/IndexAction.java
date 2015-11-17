package com.ttrh.repairs.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/indexview")
public class IndexAction extends BaseAction<IndexAction> {

	@RequestMapping(value = "index.do")
	public ModelAndView index(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("indexview/index");
		return mv;
	}
}
