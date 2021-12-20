package rs.ac.bg.fon.fpis.raps;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import rs.ac.bg.fon.fpis.raps.domain.Porudzbenica;
import rs.ac.bg.fon.fpis.raps.domain.Racun;
import rs.ac.bg.fon.fpis.raps.domain.StavkaPorudzbenice;
import rs.ac.bg.fon.fpis.raps.domain.StavkaRacuna;
import rs.ac.bg.fon.fpis.raps.dto.PorudzbenicaDTO;
import rs.ac.bg.fon.fpis.raps.dto.RacunDTO;
import rs.ac.bg.fon.fpis.raps.dto.StavkaPorudzbeniceDTO;
import rs.ac.bg.fon.fpis.raps.dto.StavkaRacunaDTO;

@Configuration
public class ApplicationConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.typeMap(Porudzbenica.class, PorudzbenicaDTO.class).addMapping(Porudzbenica::getCenovnik, PorudzbenicaDTO::setCenovnikDTO);
		modelMapper.typeMap(Porudzbenica.class, PorudzbenicaDTO.class).addMapping(Porudzbenica::getKupac, PorudzbenicaDTO::setKupacDTO);
		modelMapper.typeMap(StavkaPorudzbenice.class, StavkaPorudzbeniceDTO.class).addMapping(StavkaPorudzbenice::getZacin, StavkaPorudzbeniceDTO::setZacinDTO);
		modelMapper.typeMap(StavkaRacuna.class, StavkaRacunaDTO.class).addMapping(StavkaRacuna::getZacin, StavkaRacunaDTO::setZacinDTO);
		modelMapper.typeMap(StavkaRacunaDTO.class, StavkaRacuna.class).addMapping(StavkaRacunaDTO::getZacinDTO, StavkaRacuna::setZacin);
		modelMapper.typeMap(StavkaRacunaDTO.class, StavkaRacuna.class).addMapping(StavkaRacunaDTO::getId, StavkaRacuna::setId);
		modelMapper.typeMap(Racun.class, RacunDTO.class).addMapping(Racun::getPorudzbenica, RacunDTO::setPorudzbenicaDTO);
		return modelMapper;
	}
}
