package rs.ac.bg.fon.fpis.raps.services;

import java.util.List;

import rs.ac.bg.fon.fpis.raps.domain.Kupac;

public interface KupacService {

	public List<Kupac> getAll();
	
	public List<Kupac> findByNaziv(String naziv);

	public Kupac getKupac(Long id);

	public Kupac addKupac(Kupac kupac);

	public Kupac updateKupac(Long id, Kupac kupac);

	public void deleteKupac(Long id);
}
