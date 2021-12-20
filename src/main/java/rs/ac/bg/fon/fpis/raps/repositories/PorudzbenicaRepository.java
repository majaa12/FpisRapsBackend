package rs.ac.bg.fon.fpis.raps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.fpis.raps.domain.Porudzbenica;

@Repository
public interface PorudzbenicaRepository extends JpaRepository<Porudzbenica, Long>{

	public List<Porudzbenica> findByKupacIDKupca(Long kupacId);
}
