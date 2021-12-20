package rs.ac.bg.fon.fpis.raps.services;

import java.util.List;

import rs.ac.bg.fon.fpis.raps.domain.Racun;

public interface RacunService {

	public List<Racun> getAll();

	public Racun getRacun(Long id);

	public Racun addRacun(Racun racun);

	public Racun updateRacun(Long id, Racun racun);

	public void deleteRacun(Long id);
}
