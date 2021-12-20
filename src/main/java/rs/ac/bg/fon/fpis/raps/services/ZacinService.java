package rs.ac.bg.fon.fpis.raps.services;

import java.util.List;

import rs.ac.bg.fon.fpis.raps.domain.Zacin;

public interface ZacinService {

	public List<Zacin> getAll();
	
	public Zacin getById(String id);
}
