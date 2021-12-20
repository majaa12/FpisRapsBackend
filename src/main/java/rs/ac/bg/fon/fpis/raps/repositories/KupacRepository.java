package rs.ac.bg.fon.fpis.raps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.fpis.raps.domain.Kupac;

@Repository
public interface KupacRepository extends JpaRepository<Kupac, Long>{
	public List<Kupac> findByNazivContaining(String naziv);
}
