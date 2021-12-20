package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;

import rs.ac.bg.fon.fpis.raps.domain.StavkaPorudzbeniceID;

public class StavkaPorudzbeniceDTO implements Serializable {

	private StavkaPorudzbeniceID id;
	private String vrstaPakovanja;
	private double ukupnaKolicina;
	private ZacinDTO zacin;

	public StavkaPorudzbeniceDTO() {

	}

	public StavkaPorudzbeniceDTO(StavkaPorudzbeniceID id, String vrstaPakovanja, double ukupnaKolicina,
			ZacinDTO zacin) {
		this.id = id;
		this.vrstaPakovanja = vrstaPakovanja;
		this.ukupnaKolicina = ukupnaKolicina;
		this.zacin = zacin;
	}

	public StavkaPorudzbeniceID getId() {
		return id;
	}

	public void setId(StavkaPorudzbeniceID id) {
		this.id = id;
	}

	public String getVrstaPakovanja() {
		return vrstaPakovanja;
	}

	public void setVrstaPakovanja(String vrstaPakovanja) {
		this.vrstaPakovanja = vrstaPakovanja;
	}

	public double getUkupnaKolicina() {
		return ukupnaKolicina;
	}

	public void setUkupnaKolicina(double ukupnaKolicina) {
		this.ukupnaKolicina = ukupnaKolicina;
	}

	public ZacinDTO getZacinDTO() {
		return zacin;
	}

	public void setZacinDTO(ZacinDTO zacin) {
		this.zacin = zacin;
	}

	@Override
	public String toString() {
		return "StavkaPorudzbeniceDTO [id=" + id + ", vrstaPakovanja=" + vrstaPakovanja + ", ukupnaKolicina="
				+ ukupnaKolicina + ", zacin=" + zacin + "]";
	}

}
