package rs.ac.bg.fon.fpis.raps.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.fpis.raps.domain.Porudzbenica;
import rs.ac.bg.fon.fpis.raps.domain.Racun;
import rs.ac.bg.fon.fpis.raps.domain.StavkaRacuna;
import rs.ac.bg.fon.fpis.raps.domain.StavkaRacunaID;
import rs.ac.bg.fon.fpis.raps.dto.RacunDTO;
import rs.ac.bg.fon.fpis.raps.dto.RacunRequestDTO;
import rs.ac.bg.fon.fpis.raps.dto.StavkaRacunaDTO;
import rs.ac.bg.fon.fpis.raps.dto.StavkaRacunaIdDTO;
import rs.ac.bg.fon.fpis.raps.services.PorudzbenicaService;
import rs.ac.bg.fon.fpis.raps.services.RacunService;
import rs.ac.bg.fon.fpis.raps.services.ZacinService;

@RestController
@CrossOrigin
@RequestMapping("/racun/*")
public class RacunController {

	@Autowired
	private RacunService racunService;
	
	@Autowired
	private PorudzbenicaService porudzbenicaService;
	
	@Autowired
	private ZacinService zacinService;

	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping("/getAll")
	public List<RacunDTO> getAll() {
		List<Racun> racuni = racunService.getAll();
		if (racuni.isEmpty()) return new ArrayList<>();
		return racuni.stream()
				.map(racun -> mapirajRacun(racun))
				.collect(Collectors.toList());
	}

	@RequestMapping("/get/{id}")
	public RacunDTO getRacun(@PathVariable Long id) {
		Racun racun = racunService.getRacun(id);
		return mapirajRacun(racun);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public RacunDTO addRacun(@RequestBody RacunRequestDTO racunDTO) {
		Racun racun = mapirajRacun(racunDTO);
		
		racun = racunService.addRacun(racun);
		
		return mapirajRacun(racun);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
	public RacunDTO updateRacun(@RequestBody RacunRequestDTO racunDTO, @PathVariable Long id) {
		Racun racun = mapirajRacun(racunDTO);

		racun = racunService.updateRacun(id, racun);
		
		return mapirajRacun(racun);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void deleteRacun(@PathVariable Long id) {
		racunService.deleteRacun(id);
	}

	private RacunDTO mapirajRacun(Racun racun) {
		if (racun == null) return null;
		RacunDTO racunDTO = modelMapper.map(racun, RacunDTO.class);

		if (racun.getStavkeRac() != null) {
			for (StavkaRacunaDTO stavkaDTO : racunDTO.getStavkeRac()) {
				StavkaRacuna stavkaRacuna =  racun.getStavkeRac()
						.get(racunDTO.getStavkeRac().indexOf(stavkaDTO));
				StavkaRacunaID id = stavkaRacuna.getId();
				stavkaDTO.setId(modelMapper.map(id, StavkaRacunaIdDTO.class));
			}
		}
		
		return racunDTO;
	}
	
	private Racun mapirajRacun(RacunRequestDTO racunDTO) {
		Porudzbenica porudzbenica = porudzbenicaService.getById(racunDTO.getPorudzbenicaId());
		List<StavkaRacuna> stavke = new ArrayList<>();
		for (StavkaRacunaDTO stavka : racunDTO.getStavkeRac()) {
			StavkaRacuna s = modelMapper.map(stavka, StavkaRacuna.class);
			stavke.add(s);
		}
		Racun racun = modelMapper.map(racunDTO, Racun.class);
		racun.setPorudzbenica(porudzbenica);
		racun.setStavkeRac(stavke);
		
		return racun;
	}
}
