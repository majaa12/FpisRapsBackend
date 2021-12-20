package rs.ac.bg.fon.fpis.raps.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.bg.fon.fpis.raps.domain.Grad;
import rs.ac.bg.fon.fpis.raps.repositories.GradRepository;
import rs.ac.bg.fon.fpis.raps.services.GradService;

@Service
@Transactional
public class GradServiceImpl implements GradService{
	@Autowired
	private GradRepository gradRepository;

	@Override
	public List<Grad> getAll() {
		return gradRepository.findAll();
	}

}
