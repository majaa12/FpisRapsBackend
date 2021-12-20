package rs.ac.bg.fon.fpis.raps.services;

import java.util.List;

import rs.ac.bg.fon.fpis.raps.domain.Porudzbenica;

public interface PorudzbenicaService {

	public List<Porudzbenica> getAll(Long id);
	
	public Porudzbenica getById(Long id);
}
