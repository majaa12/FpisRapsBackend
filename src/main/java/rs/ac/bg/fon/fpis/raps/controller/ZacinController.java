package rs.ac.bg.fon.fpis.raps.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.fpis.raps.domain.Zacin;
import rs.ac.bg.fon.fpis.raps.dto.ZacinDTO;
import rs.ac.bg.fon.fpis.raps.services.ZacinService;

@RestController
@CrossOrigin
@RequestMapping("/zacin/*")
public class ZacinController {

	@Autowired
	private ZacinService zacinService;

	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping("/getAll")
	public List<ZacinDTO> getAll() {
		List<Zacin> zacini = zacinService.getAll();
		return zacini.stream()
				.map(zacin -> modelMapper.map(zacin, ZacinDTO.class))
				.collect(Collectors.toList());
	}
}
