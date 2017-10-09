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
import com.jwt.model.TipoServicio;
import com.jwt.service.TipoServicioService;

@Controller
public class TipoServicioController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public TipoServicioController() {
		System.out.println("Entro a TipoServicioController");
	}

	@Autowired
	private TipoServicioService tipoServicioService;
	
	@RequestMapping(value = "/tipoServicio")
	public ModelAndView listTipoServicio(ModelAndView model) throws IOException {
		List<TipoServicio> listTipoServicio = tipoServicioService.getAllTipoServicio();
		model.addObject("listTipoServicio", listTipoServicio);
		model.setViewName("TipoServicioPage");
		return model;
	}

	@RequestMapping(value = "/nuevoTipoServicio", method = RequestMethod.GET)
	public ModelAndView nuevoTipoServicio(ModelAndView model) {
		TipoServicio tipoServicio = new TipoServicio();
		model.addObject("tipoServicio", tipoServicio);
		model.setViewName("TipoServicioForm");
		return model;
	}

	@RequestMapping(value = "/guardarTipoServicio", method = RequestMethod.POST)
	public ModelAndView guardarTipoServicio(@ModelAttribute TipoServicio tipoServicio) {
		if (tipoServicio.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			tipoServicioService.addTipoServicio(tipoServicio);
		} else {
			tipoServicioService.updateTipoServicio(tipoServicio);
		}
		return new ModelAndView("redirect:/tipoServicio");
	}

	@RequestMapping(value = "/borrarTipoServicio", method = RequestMethod.GET)
	public ModelAndView borrarTipoServicio(HttpServletRequest request) {
		int tipoServicioId = Integer.parseInt(request.getParameter("id"));
		tipoServicioService.deleteTipoServicio(tipoServicioId);
		return new ModelAndView("redirect:/tipoServicio");
	}

	@RequestMapping(value = "/editarTipoServicio", method = RequestMethod.GET)
	public ModelAndView editarTipoServicio(HttpServletRequest request) {
		int tipoServicioId = Integer.parseInt(request.getParameter("id"));
		TipoServicio tipoServicio = tipoServicioService.getTipoServicio(tipoServicioId);
		ModelAndView model = new ModelAndView("TipoServicioForm");
		model.addObject("tipoServicio", tipoServicio);

		return model;
	}

}
