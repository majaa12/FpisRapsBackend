package rs.ac.bg.fon.fpis.raps.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.fpis.raps.domain.Porudzbenica;
import rs.ac.bg.fon.fpis.raps.domain.StavkaPorudzbeniceID;
import rs.ac.bg.fon.fpis.raps.domain.StavkaPorudzbenice;
import rs.ac.bg.fon.fpis.raps.dto.PorudzbenicaDTO;
import rs.ac.bg.fon.fpis.raps.dto.StavkaPorudzbeniceDTO;
import rs.ac.bg.fon.fpis.raps.services.PorudzbenicaService;

@RestController
@CrossOrigin
@RequestMapping("/porudzbenica/*")
public class PorudzbenicaController {

	@Autowired
	private PorudzbenicaService porudzbenicaService;

	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping("/getAll/{id}")
	public List<PorudzbenicaDTO> getAll(@PathVariable Long id) {
		List<Porudzbenica> porudzbenice = porudzbenicaService.getAll(id);
		return porudzbenice.stream().map(porudzbenica -> mapirajPorudzbenicu(porudzbenica))
				.collect(Collectors.toList());
	}

	private PorudzbenicaDTO mapirajPorudzbenicu(Porudzbenica porudzbenica) {
		PorudzbenicaDTO porudzbenicaDTO = modelMapper.map(porudzbenica, PorudzbenicaDTO.class);

		if (porudzbenica.getStavkePor() != null) {
			for (StavkaPorudzbeniceDTO stavkaDTO : porudzbenicaDTO.getStavkePor()) {
				StavkaPorudzbenice stavkaPorudzbenice =  porudzbenica.getStavkePor()
						.get(porudzbenicaDTO.getStavkePor().indexOf(stavkaDTO));
				StavkaPorudzbeniceID id = stavkaPorudzbenice.getId();
				stavkaDTO.setId(id);
			}
		}
		
		return porudzbenicaDTO;
	}
}
