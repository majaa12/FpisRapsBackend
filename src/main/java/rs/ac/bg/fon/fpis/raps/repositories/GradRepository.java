package rs.ac.bg.fon.fpis.raps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.fpis.raps.domain.Grad;

@Repository
public interface GradRepository extends JpaRepository<Grad, Integer>{

}
