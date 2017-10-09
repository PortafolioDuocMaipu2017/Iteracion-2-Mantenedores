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
import com.jwt.model.TipoCliente;
import com.jwt.service.TipoClienteService;

@Controller
public class TipoClienteController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public TipoClienteController() {
		System.out.println("Entro a TipoClienteController");
	}

	@Autowired
	private TipoClienteService tipoClienteService;
	
	@RequestMapping(value = "/tipoCliente")
	public ModelAndView listTipoCliente(ModelAndView model) throws IOException {
		List<TipoCliente> listTipoCliente = tipoClienteService.getAllTipoCliente();
		model.addObject("listTipoCliente", listTipoCliente);
		model.setViewName("TipoClientePage");
		return model;
	}

	@RequestMapping(value = "/nuevoTipoCliente", method = RequestMethod.GET)
	public ModelAndView nuevoTipoCliente(ModelAndView model) {
		TipoCliente tipoCliente = new TipoCliente();
		model.addObject("tipoCliente", tipoCliente);
		model.setViewName("TipoClienteForm");
		return model;
	}

	@RequestMapping(value = "/guardarTipoCliente", method = RequestMethod.POST)
	public ModelAndView guardarTipoCliente(@ModelAttribute TipoCliente tipoCliente) {
		if (tipoCliente.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			tipoClienteService.addTipoCliente(tipoCliente);
		} else {
			tipoClienteService.updateTipoCliente(tipoCliente);
		}
		return new ModelAndView("redirect:/tipoCliente");
	}

	@RequestMapping(value = "/borrarTipoCliente", method = RequestMethod.GET)
	public ModelAndView borrarTipoCliente(HttpServletRequest request) {
		int tipoClienteId = Integer.parseInt(request.getParameter("id"));
		tipoClienteService.deleteTipoCliente(tipoClienteId);
		return new ModelAndView("redirect:/tipoClienteId");
	}

	@RequestMapping(value = "/editarTipoCliente", method = RequestMethod.GET)
	public ModelAndView editarTipoCliente(HttpServletRequest request) {
		int tipoClienteId = Integer.parseInt(request.getParameter("id"));
		TipoCliente tipoCliente = tipoClienteService.getTipoCliente(tipoClienteId);
		ModelAndView model = new ModelAndView("TipoActividadForm");
		model.addObject("tipoCliente", tipoCliente);

		return model;
	}

}