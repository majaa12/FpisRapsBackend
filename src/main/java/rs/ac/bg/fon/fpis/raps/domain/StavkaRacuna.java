package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class StavkaRacuna implements Serializable {

	@EmbeddedId
	private StavkaRacunaID id;

	@Column(name = "brojSarze")
	private String brojSarze;

	@Temporal(TemporalType.DATE)
	@Column(name = "rokUpotrebe")
	private Date rokUpotrebe;

	@Column(name = "pdv")
	private double pdv;

	@Column(name = "ukupanIznos")
	private double ukupanIznos;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private Status status;

	@ManyToOne
	@JoinColumn(name = "sifraZacina")
	private Zacin zacin;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("IDRacuna")
	@JoinColumn
	private Racun racun;

	public StavkaRacuna() {

	}

	public StavkaRacuna(StavkaRacunaID id, String brojSarze, Date rokUpotrebe, double pdv, double ukupanIznos,
			Status status, Zacin zacin, Racun racun) {
		super();
		this.id = id;
		this.brojSarze = brojSarze;
		this.rokUpotrebe = rokUpotrebe;
		this.pdv = pdv;
		this.ukupanIznos = ukupanIznos;
		this.status = status;
		this.zacin = zacin;
		this.racun = racun;
	}

	public StavkaRacunaID getId() {
		return id;
	}

	public void setId(StavkaRacunaID id) {
		this.id = id;
	}

	public String getBrojSarze() {
		return brojSarze;
	}

	public void setBrojSarze(String brojSarze) {
		this.brojSarze = brojSarze;
	}

	public Date getRokUpotrebe() {
		return rokUpotrebe;
	}

	public void setRokUpotrebe(Date rokUpotrebe) {
		this.rokUpotrebe = rokUpotrebe;
	}

	public double getPdv() {
		return pdv;
	}

	public void setPdv(double pdv) {
		this.pdv = pdv;
	}

	public double getUkupanIznos() {
		return ukupanIznos;
	}

	public void setUkupanIznos(double ukupanIznos) {
		this.ukupanIznos = ukupanIznos;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Zacin getZacin() {
		return zacin;
	}

	public void setZacin(Zacin zacin) {
		this.zacin = zacin;
	}

	public Racun getRacun() {
		return racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}

	@Override
	public String toString() {
		return "StavkaRacuna [id=" + id + ", brojSarze=" + brojSarze + ", rokUpotrebe=" + rokUpotrebe + ", pdv=" + pdv
				+ ", ukupanIznos=" + ukupanIznos + ", status=" + status + ", zacin=" + zacin + ", racun=" + racun + "]";
	}

}
