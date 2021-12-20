package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Porudzbenica implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPor")
	private long IDPor;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datumPor")
	private Date datumPor;
	
	@ManyToOne
	@JoinColumn(name = "IDKupca")
	private Kupac kupac;
	
	@ManyToOne
	@JoinColumn(name = "IDCen")
	private Cenovnik cenovnik;
	
	@OneToMany(mappedBy = "porudzbenica", cascade = CascadeType.REMOVE)
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<StavkaPorudzbenice> stavkePor;

	public Porudzbenica() {
		stavkePor = new ArrayList<>();
	}

	public Porudzbenica(long iDPor, Date datumPor, Kupac kupac, Cenovnik cenovnik, List<StavkaPorudzbenice> stavkePor) {
		super();
		IDPor = iDPor;
		this.datumPor = datumPor;
		this.kupac = kupac;
		this.cenovnik = cenovnik;
		this.stavkePor = stavkePor;
	}

	public long getIDPor() {
		return IDPor;
	}

	public void setIDPor(long iDPor) {
		IDPor = iDPor;
	}

	public Date getDatumPor() {
		return datumPor;
	}

	public void setDatumPor(Date datumPor) {
		this.datumPor = datumPor;
	}

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	public Cenovnik getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}

	public List<StavkaPorudzbenice> getStavkePor() {
		return stavkePor;
	}

	public void setStavkePor(List<StavkaPorudzbenice> stavkePor) {
		this.stavkePor = stavkePor;
	}

	@Override
	public String toString() {
		return "Porudzbenica [IDPor=" + IDPor + ", datumPor=" + datumPor + ", kupac=" + kupac.getIDKupca() + "]";
	}

	
}
