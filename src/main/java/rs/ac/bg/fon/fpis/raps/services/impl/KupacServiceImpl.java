package rs.ac.bg.fon.fpis.raps.services.impl;

import rs.ac.bg.fon.fpis.raps.domain.Kupac;
import rs.ac.bg.fon.fpis.raps.repositories.KupacRepository;
import rs.ac.bg.fon.fpis.raps.services.KupacService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class KupacServiceImpl implements KupacService {

	@Autowired
	private KupacRepository kupacRepository;

	public List<Kupac> getAll() {
		List<Kupac> kupci = new ArrayList<>();
		kupacRepository.findAll().forEach(kupci::add);
		return kupci;
	}

	public Kupac getKupac(Long id) {
		Optional<Kupac> kupac = kupacRepository.findById(id);
		if (kupac.isPresent()) {
			return kupac.get();
		}
		return null;
	}

	public Kupac addKupac(Kupac kupac) {
		return kupacRepository.save(kupac);
	}

	public Kupac updateKupac(Long id, Kupac kupac) {
		return kupacRepository.save(kupac);
	}

	public void deleteKupac(Long id) {
		kupacRepository.deleteById(id);
	}

	@Override
	public List<Kupac> findByNaziv(String naziv) {
		return kupacRepository.findByNazivContaining(naziv);
	}
}
