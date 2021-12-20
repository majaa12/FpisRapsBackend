package rs.ac.bg.fon.fpis.raps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.fpis.raps.domain.StavkaRacuna;
import rs.ac.bg.fon.fpis.raps.domain.StavkaRacunaID;

@Repository
public interface StavkaRacunaRepository extends JpaRepository<StavkaRacuna, StavkaRacunaID>{
	public void deleteByRacunIDRacuna(long IDRacuna);
	
	@Query(value = "SELECT max(s.id.RBrRac) from StavkaRacuna s")
	public Integer getMaxRbrRac();
}
