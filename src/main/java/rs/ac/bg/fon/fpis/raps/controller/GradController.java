package rs.ac.bg.fon.fpis.raps.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.fpis.raps.domain.Grad;
import rs.ac.bg.fon.fpis.raps.dto.GradDTO;
import rs.ac.bg.fon.fpis.raps.services.GradService;

@RestController
@CrossOrigin
@RequestMapping("/grad/*")
public class GradController {
	
	@Autowired
	private GradService gradService;

	@Autowired
	private ModelMapper modelMapper;
	
	@RequestMapping("/getAll")
	public List<GradDTO> getAll() {
		List<Grad> gradovi = gradService.getAll();		
		return gradovi.stream()
				.map(grad -> modelMapper.map(grad, GradDTO.class))
				.collect(Collectors.toList());
	}
}
