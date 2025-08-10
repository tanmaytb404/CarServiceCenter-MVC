package com.example.CarService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class attendentController {

	@GetMapping("/attendent/{attendentId}")
	public String getAttendent(@PathVariable String attendentId, ModelMap mm) {
		mm.addAttribute("name", "Test" + attendentId);
		mm.addAttribute("speciality", "Engine Body etc");
		return "attendent";
	}

}
