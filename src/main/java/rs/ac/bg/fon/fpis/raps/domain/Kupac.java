package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Kupac implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDKupca")
	private Long IDKupca;
	
	@Column(name = "PIB")
	private String PIBKupca;
	
	@Column(name = "naziv")
	private String naziv;
	
	@ManyToOne
	@JoinColumn(name = "sifraGrada")
	private Grad grad;
	
	@Column(name = "adresa")
	private String adresa;

	public Kupac() {
	}

	public Kupac(Long iDKupca, String pIBKupca, String naziv, Grad grad, String adresa) {
		IDKupca = iDKupca;
		PIBKupca = pIBKupca;
		this.naziv = naziv;
		this.grad = grad;
		this.adresa = adresa;
	}

	public Long getIDKupca() {
		return IDKupca;
	}

	public void setIDKupca(Long iDKupca) {
		IDKupca = iDKupca;
	}

	public String getPIBKupca() {
		return PIBKupca;
	}

	public void setPIBKupca(String pIBKupca) {
		PIBKupca = pIBKupca;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Grad getGrad() {
		return grad;
	}

	public void setGrad(Grad grad) {
		this.grad = grad;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		return "Kupac [IDKupca=" + IDKupca + ", PIBKupca=" + PIBKupca + ", naziv=" + naziv + ", grad=" + grad
				+ ", adresa=" + adresa + "]";
	}
	
}
