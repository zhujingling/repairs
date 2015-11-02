package com.ttrh.repairs.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/index")
public class IndexAction extends BaseAction<IndexAction> {

	@RequestMapping(value = "index.html")
	public ModelAndView index(Model model) {
		ModelAndView mv = new ModelAndView();
		return mv;
	}
}
