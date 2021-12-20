package rs.ac.bg.fon.fpis.raps.controller;

import rs.ac.bg.fon.fpis.raps.domain.Kupac;
import rs.ac.bg.fon.fpis.raps.dto.KupacDTO;
import rs.ac.bg.fon.fpis.raps.services.KupacService;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/kupac/*")
public class KupacController {

	@Autowired
	private KupacService kupacService;

	@Autowired
    private ModelMapper modelMapper;

	@RequestMapping("/getAll")
	public List<KupacDTO> getAll() {
		List<Kupac> kupci = kupacService.getAll();
		return kupci.stream()
				.map(kupac -> modelMapper.map(kupac, KupacDTO.class))
				.collect(Collectors.toList());
	}
	
	@RequestMapping("/getByNaziv")
	public List<KupacDTO> getAll(@RequestParam String naziv) {
		List<Kupac> kupci = kupacService.findByNaziv(naziv);
		return kupci.stream()
				.map(kupac -> modelMapper.map(kupac, KupacDTO.class))
				.collect(Collectors.toList());
	}

	@RequestMapping("/get/{id}")
	public KupacDTO getKupac(@PathVariable Long id) {
		Kupac kupac = kupacService.getKupac(id);
		if(kupac !=null) {
			return modelMapper.map(kupac, KupacDTO.class);		
		}
		
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public KupacDTO addKupac(@RequestBody KupacDTO kupacDTO) {
		Kupac kupac = modelMapper.map(kupacDTO, Kupac.class);
		kupac = kupacService.addKupac(kupac);
		
		return modelMapper.map(kupac, KupacDTO.class);		
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
	public KupacDTO updateKupac(@RequestBody KupacDTO kupacDTO, @PathVariable Long id) {
		Kupac kupac = modelMapper.map(kupacDTO, Kupac.class);
		kupac = kupacService.updateKupac(id, kupac);

		return modelMapper.map(kupac, KupacDTO.class);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void deleteKupac(@PathVariable Long id) {
		kupacService.deleteKupac(id);
	}

}
