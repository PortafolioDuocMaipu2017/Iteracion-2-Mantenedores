package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {


	@RequestMapping(value = "/")
	public ModelAndView inicio(ModelAndView model) throws IOException {
		model.setViewName("inicio");
		return model;
	}
	
	@RequestMapping(value = "/wea")
	public ModelAndView inicio2(ModelAndView model) throws IOException {
		model.setViewName("inicio");
		return model;
	}
}
