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
import com.jwt.model.TipoContrato;
import com.jwt.service.TipoContratoService;

@Controller
public class TipoContratoController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public TipoContratoController() {
		System.out.println("Entro a TipoContratoController");
	}

	@Autowired
	private TipoContratoService tipoContratoService;
	
	@RequestMapping(value = "/tipoContrato")
	public ModelAndView listTipoContrato(ModelAndView model) throws IOException {
		List<TipoContrato> listTipoContrato = tipoContratoService.getAllTipoContrato();
		model.addObject("listTipoContrato", listTipoContrato);
		model.setViewName("TipoContratoPage");
		return model;
	}

	@RequestMapping(value = "/nuevoTipoContrato", method = RequestMethod.GET)
	public ModelAndView nuevoTipoCliente(ModelAndView model) {
		TipoContrato tipoContrato = new TipoContrato();
		model.addObject("tipoContrato", tipoContrato);
		model.setViewName("TipoContratoForm");
		return model;
	}

	@RequestMapping(value = "/guardarTipoContrato", method = RequestMethod.POST)
	public ModelAndView guardarTipoContrato(@ModelAttribute TipoContrato tipoContrato) {
		if (tipoContrato.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			tipoContratoService.addTipoContrato(tipoContrato);
		} else {
			tipoContratoService.updateTipoContrato(tipoContrato);
		}
		return new ModelAndView("redirect:/tipoContrato");
	}

	@RequestMapping(value = "/borrarTipoContrato", method = RequestMethod.GET)
	public ModelAndView borrarTipoContrato(HttpServletRequest request) {
		int tipoContratoId = Integer.parseInt(request.getParameter("id"));
		tipoContratoService.deleteTipoContrato(tipoContratoId);
		return new ModelAndView("redirect:/tipoContratoId");
	}

	@RequestMapping(value = "/editarTipoContrato", method = RequestMethod.GET)
	public ModelAndView editarTipoContrato(HttpServletRequest request) {
		int tipoContratoId = Integer.parseInt(request.getParameter("id"));
		TipoContrato tipoContrato = tipoContratoService.getTipoContrato(tipoContratoId);
		ModelAndView model = new ModelAndView("TipoContratoForm");
		model.addObject("tipoContrato", tipoContrato);

		return model;
	}

}