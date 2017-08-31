package career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CivilController {
@RequestMapping(value= {"/","/Home","/index"})
public ModelAndView m()
{
	ModelAndView mv=new ModelAndView("page");
	return mv;
}
}
