package rs.ac.bg.fon.fpis.raps.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.bg.fon.fpis.raps.domain.Racun;
import rs.ac.bg.fon.fpis.raps.domain.Status;
import rs.ac.bg.fon.fpis.raps.domain.StavkaRacuna;
import rs.ac.bg.fon.fpis.raps.domain.StavkaRacunaID;
import rs.ac.bg.fon.fpis.raps.repositories.RacunRepository;
import rs.ac.bg.fon.fpis.raps.repositories.StavkaRacunaRepository;
import rs.ac.bg.fon.fpis.raps.services.RacunService;

@Service
@Transactional
public class RacunServiceImpl implements RacunService{

	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired
	private StavkaRacunaRepository stavkaRacunaRepository;

	public List<Racun> getAll() {
		List<Racun> racun = new ArrayList<>();
		racunRepository.findAll().forEach(racun::add);
		for (Racun r : racun) {
			if (r.getStavkeRac() != null) {
				r.setStavkeRac(r.getStavkeRac().stream().filter(s -> s.getStatus() != Status.D).collect(Collectors.toList()));
			}
		}
		return racun;
	}

	public Racun getRacun(Long id) {
		Optional<Racun> racunOptional = racunRepository.findById(id);
		Racun racun = null;
		if (racunOptional.isPresent()) {
			racun = racunOptional.get();
			if (racun.getStavkeRac() != null) {
				racun.setStavkeRac(racun.getStavkeRac().stream().filter(s -> s.getStatus() != Status.D).collect(Collectors.toList()));
			}
		}
		return racun;
	}

	public Racun addRacun(Racun racun) {
		racun = racunRepository.save(racun);
		Integer idStavke = 0;
		Integer maxRbrRac = stavkaRacunaRepository.getMaxRbrRac();
		if (maxRbrRac != null) {
			idStavke = maxRbrRac;
		}
		
		if (racun.getStavkeRac() != null) {
			
			for (StavkaRacuna stavka : racun.getStavkeRac()) {
				stavka.setRacun(racun);
				stavka.setId(new StavkaRacunaID(racun.getIDRacuna(), ++idStavke));
			}
			stavkaRacunaRepository.saveAll(racun.getStavkeRac());
		}
		
		return racun;
	}

	public Racun updateRacun(Long id, Racun racun) {
		Integer idStavke = 0;
		Integer maxRbrRac = stavkaRacunaRepository.getMaxRbrRac();
		if (maxRbrRac != null) {
			idStavke = maxRbrRac;
		}
				
		if (racun.getStavkeRac() != null) {
			for (StavkaRacuna stavka : racun.getStavkeRac()) {
				stavka.setRacun(new Racun(id));
				if (stavka.getId() != null && stavka.getId().getRBrRac() == 0) {
					stavka.getId().setRBrRac(++idStavke);
				}
			}
			stavkaRacunaRepository.saveAll(racun.getStavkeRac());
		}
		return racunRepository.save(racun);
	}

	public void deleteRacun(Long id) {
		racunRepository.deleteById(id);
	}
}
