package pe.edu.upeu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.service.VentasService;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	private VentasService ventasService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return ventasService.readAll();
	}
}
