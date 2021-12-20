package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JedinicaMere implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idJM")
	private long idJM;
	
	@Column(name = "naziv")
	private String naziv;

	public JedinicaMere() {
	}

	public JedinicaMere(long idJM, String naziv) {
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
