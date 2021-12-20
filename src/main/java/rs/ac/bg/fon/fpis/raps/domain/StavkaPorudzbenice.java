package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class StavkaPorudzbenice implements Serializable {

	@EmbeddedId
	private StavkaPorudzbeniceID id;

	@Column(name = "vrstaPakovanja")
	private String vrstaPakovanja;

	@Column(name = "ukupnaKolicina")
	private double ukupnaKolicina;

	@ManyToOne
	@JoinColumn(name = "sifraZacina")
	private Zacin zacin;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("IDPor")
	@JoinColumn
	private Porudzbenica porudzbenica;

	public StavkaPorudzbenice() {

	}

	public StavkaPorudzbenice(StavkaPorudzbeniceID id, String vrstaPakovanja, double ukupnaKolicina, Zacin zacin,
			Porudzbenica porudzbenica) {
		this.id = id;
		this.vrstaPakovanja = vrstaPakovanja;
		this.ukupnaKolicina = ukupnaKolicina;
		this.zacin = zacin;
		this.porudzbenica = porudzbenica;
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

	public Zacin getZacin() {
		return zacin;
	}

	public void setZacin(Zacin zacin) {
		this.zacin = zacin;
	}

	public Porudzbenica getPorudzbenica() {
		return porudzbenica;
	}

	public void setPorudzbenica(Porudzbenica porudzbenica) {
		this.porudzbenica = porudzbenica;
	}

	@Override
	public String toString() {
		return "StavkaPorudzbenice [id=" + id + ", vrstaPakovanja=" + vrstaPakovanja + ", ukupnaKolicina="
				+ ukupnaKolicina + ", zacin=" + zacin + ", porudzbenica=" + porudzbenica + "]";
	}

}
