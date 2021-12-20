package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import rs.ac.bg.fon.fpis.raps.domain.StavkaRacunaID;

public class StavkaRacunaDTO implements Serializable {

	private StavkaRacunaIdDTO id;
	private String brojSarze;
	private Date rokUpotrebe;
	private double pdv;
	private double ukupanIznos;
	private StatusDTO status;
	private ZacinDTO zacin;

	@JsonIgnore
	private RacunDTO racunDTO;

	public StavkaRacunaDTO() {

	}

	public StavkaRacunaDTO(StavkaRacunaIdDTO id, String brojSarze, Date rokUpotrebe, double pdv, double ukupanIznos,
			StatusDTO status, ZacinDTO zacin, RacunDTO racunDTO) {
		this.id = id;
		this.brojSarze = brojSarze;
		this.rokUpotrebe = rokUpotrebe;
		this.pdv = pdv;
		this.ukupanIznos = ukupanIznos;
		this.status = status;
		this.zacin = zacin;
		this.racunDTO = racunDTO;
	}

	public StavkaRacunaIdDTO getId() {
		return id;
	}

	public void setId(StavkaRacunaIdDTO id) {
		this.id = id;
	}

	public String getBrojSarze() {
		return brojSarze;
	}

	public void setBrojSarze(String brojSarze) {
		this.brojSarze = brojSarze;
	}

	public Date getRokUpotrebe() {
		return rokUpotrebe;
	}

	public void setRokUpotrebe(Date rokUpotrebe) {
		this.rokUpotrebe = rokUpotrebe;
	}

	public double getPdv() {
		return pdv;
	}

	public void setPdv(double pdv) {
		this.pdv = pdv;
	}

	public double getUkupanIznos() {
		return ukupanIznos;
	}

	public void setUkupanIznos(double ukupanIznos) {
		this.ukupanIznos = ukupanIznos;
	}

	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}

	public ZacinDTO getZacinDTO() {
		return zacin;
	}

	public void setZacinDTO(ZacinDTO zacin) {
		this.zacin = zacin;
	}

	public RacunDTO getRacunDTO() {
		return racunDTO;
	}

	public void setRacunDTO(RacunDTO racunDTO) {
		this.racunDTO = racunDTO;
	}

	@Override
	public String toString() {
		return "StavkaRacunaDTO [id=" + id + ", brojSarze=" + brojSarze + ", rokUpotrebe=" + rokUpotrebe + ", pdv="
				+ pdv + ", ukupanIznos=" + ukupanIznos + ", status=" + status + ", zacin=" + zacin + ", racunDTO="
				+ racunDTO + "]";
	}

}
