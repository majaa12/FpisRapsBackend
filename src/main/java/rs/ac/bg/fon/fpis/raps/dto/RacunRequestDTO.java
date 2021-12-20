package rs.ac.bg.fon.fpis.raps.dto;

import java.util.Date;
import java.util.List;

public class RacunRequestDTO {
	private long IDRacuna;
	private Date datumPrometa;
	private double PDVOsnova;
	private double iznosPDV;
	private double racunIznos;
	private String uslovPlacanja;
	private long porudzbenicaId;
	private List<StavkaRacunaDTO> stavkeRac;
	
	public RacunRequestDTO() {
	
	}
	
	public RacunRequestDTO(long iDRacuna, Date datumPrometa, double pDVOsnova, double iznosPDV, double racunIznos,
			String uslovPlacanja, long porudzbenicaId, List<StavkaRacunaDTO> stavkeRac) {
		IDRacuna = iDRacuna;
		this.datumPrometa = datumPrometa;
		PDVOsnova = pDVOsnova;
		this.iznosPDV = iznosPDV;
		this.racunIznos = racunIznos;
		this.uslovPlacanja = uslovPlacanja;
		this.porudzbenicaId = porudzbenicaId;
		this.stavkeRac = stavkeRac;
	}
	public long getIDRacuna() {
		return IDRacuna;
	}
	public void setIDRacuna(long iDRacuna) {
		IDRacuna = iDRacuna;
	}
	public Date getDatumPrometa() {
		return datumPrometa;
	}
	public void setDatumPrometa(Date datumPrometa) {
		this.datumPrometa = datumPrometa;
	}
	public double getPDVOsnova() {
		return PDVOsnova;
	}
	public void setPDVOsnova(double pDVOsnova) {
		PDVOsnova = pDVOsnova;
	}
	public double getIznosPDV() {
		return iznosPDV;
	}
	public void setIznosPDV(double iznosPDV) {
		this.iznosPDV = iznosPDV;
	}
	public double getRacunIznos() {
		return racunIznos;
	}
	public void setRacunIznos(double racunIznos) {
		this.racunIznos = racunIznos;
	}
	public String getUslovPlacanja() {
		return uslovPlacanja;
	}
	public void setUslovPlacanja(String uslovPlacanja) {
		this.uslovPlacanja = uslovPlacanja;
	}
	public long getPorudzbenicaId() {
		return porudzbenicaId;
	}
	public void setPorudzbenicaId(long porudzbenicaId) {
		this.porudzbenicaId = porudzbenicaId;
	}
	public List<StavkaRacunaDTO> getStavkeRac() {
		return stavkeRac;
	}
	public void setStavkeRac(List<StavkaRacunaDTO> stavkeRac) {
		this.stavkeRac = stavkeRac;
	}
	@Override
	public String toString() {
		return "RacunRequestDTO [IDRacuna=" + IDRacuna + ", datumPrometa=" + datumPrometa + ", PDVOsnova=" + PDVOsnova
				+ ", iznosPDV=" + iznosPDV + ", racunIznos=" + racunIznos + ", uslovPlacanja=" + uslovPlacanja
				+ ", porudzbenicaId=" + porudzbenicaId + ", stavkeRac=" + stavkeRac + "]";
	}
	
	
}
