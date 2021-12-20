package rs.ac.bg.fon.fpis.raps.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.bg.fon.fpis.raps.domain.Porudzbenica;
import rs.ac.bg.fon.fpis.raps.repositories.PorudzbenicaRepository;
import rs.ac.bg.fon.fpis.raps.services.PorudzbenicaService;

@Service
@Transactional
public class PorudzbenicaServiceImpl implements PorudzbenicaService{

	@Autowired
	private PorudzbenicaRepository porudzbenicaRepository;
	
	public List<Porudzbenica> getAll(Long kupacId) {
		List<Porudzbenica> porudzbenice = new ArrayList<>();
		porudzbenicaRepository.findByKupacIDKupca(kupacId).forEach(porudzbenice::add);
		return porudzbenice;
	}

	@Override
	public Porudzbenica getById(Long id) {
		return porudzbenicaRepository.getById(id);
	}

	
}
