package com.Flight.springwebflight;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("flight")
public class FlightController {
	
	@Autowired
	private FlightRepository repo;
	
	@GetMapping("/")
	public ModelAndView getFlight() {
		List<Flight> flight = repo.findAll();
		HashMap<String, List<Flight>> model = new HashMap<>();
		model.put("list", flight);
		return new ModelAndView("flightList", model);
	}

}
