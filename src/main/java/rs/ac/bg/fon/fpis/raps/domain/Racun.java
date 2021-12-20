package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Racun implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDRacuna")
	private long IDRacuna;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datumPrometa")
	private Date datumPrometa;
	
	@Column(name = "PDVOsnova")
	private double PDVOsnova;
	
	@Column(name = "iznosPDV")
	private double iznosPDV;
	
	@Column(name = "racunIznos")
	private double racunIznos;
	
	@Column(name = "uslovPlacanja")
	private String uslovPlacanja;
	
	@ManyToOne
	@JoinColumn(name = "IDPor")
	private Porudzbenica porudzbenica;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "racun", cascade = CascadeType.REMOVE)
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<StavkaRacuna> stavkeRac;

	public Racun() {
		stavkeRac = new ArrayList<>();
	}
	public Racun(long iDRacuna) {
		this.IDRacuna = iDRacuna;
	}

	public Racun(long iDRacuna, Date datumPrometa, double pDVOsnova, double iznosPDV, double racunIznos,
			String uslovPlacanja, Porudzbenica porudzbenica, List<StavkaRacuna> stavkeRac) {
		IDRacuna = iDRacuna;
		this.datumPrometa = datumPrometa;
		PDVOsnova = pDVOsnova;
		this.iznosPDV = iznosPDV;
		this.racunIznos = racunIznos;
		this.uslovPlacanja = uslovPlacanja;
		this.porudzbenica = porudzbenica;
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

	public Porudzbenica getPorudzbenica() {
		return porudzbenica;
	}

	public void setPorudzbenica(Porudzbenica porudzbenica) {
		this.porudzbenica = porudzbenica;
	}

	public List<StavkaRacuna> getStavkeRac() {
		return stavkeRac;
	}

	public void setStavkeRac(List<StavkaRacuna> stavkeRac) {
		this.stavkeRac = stavkeRac;
	}

	@Override
	public String toString() {
		return "Racun [IDRacuna=" + IDRacuna + ", datumPrometa=" + datumPrometa + ", PDVOsnova=" + PDVOsnova
				+ ", iznosPDV=" + iznosPDV + ", racunIznos=" + racunIznos + ", uslovPlacanja=" + uslovPlacanja
				+ ", porudzbenica=" + porudzbenica + ", stavkeRac=" + stavkeRac + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (IDRacuna ^ (IDRacuna >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Racun other = (Racun) obj;
		if (IDRacuna != other.IDRacuna)
			return false;
		return true;
	}
}
