package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grad implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sifraGrada")
	private int sifraGrada;
	
	@Column(name = "naziv")
	private String naziv;

	public Grad() {
	}

	public Grad(int sifraGrada, String naziv) {
		this.sifraGrada = sifraGrada;
		this.naziv = naziv;
	}

	public int getSifraGrada() {
		return sifraGrada;
	}

	public void setSifraGrada(int sifraGrada) {
		this.sifraGrada = sifraGrada;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Grad [sifraGrada=" + sifraGrada + ", naziv=" + naziv + "]";
	}

}
