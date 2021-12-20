package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;

public class GradDTO implements Serializable {

	private int sifraGrada;

	private String naziv;

	public GradDTO() {
	}

	public GradDTO(int sifraGrada, String naziv) {
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
