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
public class StavkaCenovnika implements Serializable {

	@EmbeddedId
	private StavkaCenovnikaID id;

	@Column(name = "komKarton")
	private int komKarton;

	@Column(name = "pakovanjeKG")
	private double pakovanjeKG;

	@Column(name = "netoCena")
	private double netoCena;

	@ManyToOne
	@JoinColumn(name = "sifraZacina")
	private Zacin zacin;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("IDCen")
	@JoinColumn
	private Cenovnik cenovnik;

	public StavkaCenovnika() {

	}

	public StavkaCenovnika(StavkaCenovnikaID id, int komKarton, double pakovanjeKG, double netoCena, Zacin zacin,
			Cenovnik cenovnik) {
		this.id = id;
		this.komKarton = komKarton;
		this.pakovanjeKG = pakovanjeKG;
		this.netoCena = netoCena;
		this.zacin = zacin;
		this.cenovnik = cenovnik;
	}

	public StavkaCenovnikaID getId() {
		return id;
	}

	public void setId(StavkaCenovnikaID id) {
		this.id = id;
	}

	public int getKomKarton() {
		return komKarton;
	}

	public void setKomKarton(int komKarton) {
		this.komKarton = komKarton;
	}

	public double getPakovanjeKG() {
		return pakovanjeKG;
	}

	public void setPakovanjeKG(double pakovanjeKG) {
		this.pakovanjeKG = pakovanjeKG;
	}

	public double getNetoCena() {
		return netoCena;
	}

	public void setNetoCena(double netoCena) {
		this.netoCena = netoCena;
	}

	public Zacin getZacin() {
		return zacin;
	}

	public void setZacin(Zacin zacin) {
		this.zacin = zacin;
	}

	public Cenovnik getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}

	@Override
	public String toString() {
		return "StavkaCenovnika [id=" + id + ", komKarton=" + komKarton + ", pakovanjeKG=" + pakovanjeKG + ", netoCena="
				+ netoCena + ", zacin=" + zacin + ", cenovnik=" + cenovnik + "]";
	}

}
