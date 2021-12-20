package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Zacin implements Serializable {

	@Id
	@Column(name = "sifraZacina")
	private String sifraZacina;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "jedinicnaCena")
	private double jedinicnaCena;
	
	@Column(name = "kolNaZalihama")
	private double kolNaZalihama;
	
	@Column(name = "ukupnaVrednost")
	private double ukupnaVrednost;
	
	@ManyToOne
	@JoinColumn(name = "idJM")
	private JedinicaMere jm;

	public Zacin() {
	}

	public Zacin(String sifraZacina, String naziv, double jedinicnaCena, double kolNaZalihama, double ukupnaVrednost,
			JedinicaMere jm) {
		this.sifraZacina = sifraZacina;
		this.naziv = naziv;
		this.jedinicnaCena = jedinicnaCena;
		this.kolNaZalihama = kolNaZalihama;
		this.ukupnaVrednost = ukupnaVrednost;
		this.jm = jm;
	}

	public String getSifraZacina() {
		return sifraZacina;
	}

	public void setSifraZacina(String sifraZacina) {
		this.sifraZacina = sifraZacina;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(double jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public double getKolNaZalihama() {
		return kolNaZalihama;
	}

	public void setKolNaZalihama(double kolNaZalihama) {
		this.kolNaZalihama = kolNaZalihama;
	}

	public double getUkupnaVrednost() {
		return ukupnaVrednost;
	}

	public void setUkupnaVrednost(double ukupnaVrednost) {
		this.ukupnaVrednost = ukupnaVrednost;
	}

	public JedinicaMere getJm() {
		return jm;
	}

	public void setJm(JedinicaMere jm) {
		this.jm = jm;
	}

	@Override
	public String toString() {
		return "Zacin [sifraZacina=" + sifraZacina + ", naziv=" + naziv + ", jedinicnaCena=" + jedinicnaCena
				+ ", kolNaZalihama=" + kolNaZalihama + ", ukupnaVrednost=" + ukupnaVrednost + ", jm=" + jm + "]";
	}

	

}
