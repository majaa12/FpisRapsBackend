package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;

import rs.ac.bg.fon.fpis.raps.domain.Grad;

public class KupacDTO implements Serializable {

	private Long IDKupca;

	private String PIBKupca;

	private String naziv;

	private GradDTO grad;

	private String adresa;

	public KupacDTO() {
	}

	public KupacDTO(Long iDKupca, String pIBKupca, String naziv, GradDTO grad, String adresa) {
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

	public GradDTO getgrad() {
		return grad;
	}

	public void setgrad(GradDTO grad) {
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
		return "KupacDTO [IDKupca=" + IDKupca + ", PIBKupca=" + PIBKupca + ", naziv=" + naziv + ", grad=" + grad
				+ ", adresa=" + adresa + "]";
	}

}
