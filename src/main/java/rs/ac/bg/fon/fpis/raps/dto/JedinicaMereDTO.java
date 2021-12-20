package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;

public class JedinicaMereDTO implements Serializable {

	private long idJM;

	private String naziv;

	public JedinicaMereDTO() {
	}

	public JedinicaMereDTO(long idJM, String naziv) {
		this.idJM = idJM;
		this.naziv = naziv;
	}

	public long getIdJM() {
		return idJM;
	}

	public void setIdJM(long idJM) {
		this.idJM = idJM;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "JedinicaMere [naziv=" + naziv + "]";
	}
}
