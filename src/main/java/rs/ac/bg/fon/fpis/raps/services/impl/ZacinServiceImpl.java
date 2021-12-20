package rs.ac.bg.fon.fpis.raps.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.bg.fon.fpis.raps.domain.Zacin;
import rs.ac.bg.fon.fpis.raps.repositories.ZacinRepository;
import rs.ac.bg.fon.fpis.raps.services.ZacinService;

@Service
@Transactional
public class ZacinServiceImpl implements ZacinService{

	@Autowired
	private ZacinRepository zacinRepository;

	@Override
	public List<Zacin> getAll() {
		return zacinRepository.findAll();
	}

	@Override
	public Zacin getById(String id) {
		return zacinRepository.getById(id);
	}
	
	
}
