package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;

public class ZacinDTO implements Serializable {

	private String sifraZacina;
	private String naziv;
	private double jedinicnaCena;
	private double kolNaZalihama;
	private double ukupnaVrednost;
	private JedinicaMereDTO jm;

	public ZacinDTO() {
	}

	public ZacinDTO(String sifraZacina, String naziv, double jedinicnaCena, double kolNaZalihama, double ukupnaVrednost,
			JedinicaMereDTO jm) {
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

	public JedinicaMereDTO getJm() {
		return jm;
	}

	public void setJm(JedinicaMereDTO jm) {
		this.jm = jm;
	}

	@Override
	public String toString() {
		return "ZacinDTO [sifraZacina=" + sifraZacina + ", naziv=" + naziv + ", jedinicnaCena=" + jedinicnaCena
				+ ", kolNaZalihama=" + kolNaZalihama + ", ukupnaVrednost=" + ukupnaVrednost + ", jm=" + jm + "]";
	}

}
