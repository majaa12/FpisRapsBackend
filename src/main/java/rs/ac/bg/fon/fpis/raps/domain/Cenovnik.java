package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;
import java.util.ArrayList;
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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Cenovnik implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCen")
	private long IDCen;
	
	@Column(name = "valuta")
	private String valuta;
	
	@ManyToOne
	@JoinColumn(name = "IDKupca")
	private Kupac kupac;
	
	@OneToMany(mappedBy = "cenovnik", cascade = CascadeType.REMOVE)
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<StavkaCenovnika> stavkeCen;

	public Cenovnik() {
		stavkeCen = new ArrayList<>();
	}

	public Cenovnik(long iDCen, String valuta, Kupac kupac, List<StavkaCenovnika> stavkeCen) {
		IDCen = iDCen;
		this.valuta = valuta;
		this.kupac = kupac;
		this.stavkeCen = stavkeCen;
	}

	public long getIDCen() {
		return IDCen;
	}

	public void setIDCen(long iDCen) {
		IDCen = iDCen;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	public List<StavkaCenovnika> getStavkeCen() {
		return stavkeCen;
	}

	public void setStavkeCen(List<StavkaCenovnika> stavkeCen) {
		this.stavkeCen = stavkeCen;
	}

	@Override
	public String toString() {
		return "Cenovnik [IDCen=" + IDCen + ", valuta=" + valuta + ", kupac=" + kupac.getIDKupca() + "]";
	}

}
