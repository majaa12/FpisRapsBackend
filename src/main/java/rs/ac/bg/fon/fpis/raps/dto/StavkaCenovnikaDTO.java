package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;
import rs.ac.bg.fon.fpis.raps.domain.StavkaCenovnikaID;

public class StavkaCenovnikaDTO implements Serializable {

	private StavkaCenovnikaID id;
	private int komKarton;
	private double pakovanjeKG;
	private double netoCena;
	private ZacinDTO zacin;

	public StavkaCenovnikaDTO() {

	}

	public StavkaCenovnikaDTO(StavkaCenovnikaID id, int komKarton, double pakovanjeKG, double netoCena,
			ZacinDTO zacin) {
		this.id = id;
		this.komKarton = komKarton;
		this.pakovanjeKG = pakovanjeKG;
		this.netoCena = netoCena;
		this.zacin = zacin;
	}

	public StavkaCenovnikaID getId() {
		return id;
	}

	public void setId(StavkaCenovnikaID id) {
		this.id = id;
	}

	public int getKomKarton() {
		return komKarton;
	}

	public void setKomKarton(int komKarton) {
		this.komKarton = komKarton;
	}

	public double getPakovanjeKG() {
		return pakovanjeKG;
	}

	public void setPakovanjeKG(double pakovanjeKG) {
		this.pakovanjeKG = pakovanjeKG;
	}

	public double getNetoCena() {
		return netoCena;
	}

	public void setNetoCena(double netoCena) {
		this.netoCena = netoCena;
	}
	

	public ZacinDTO getZacin() {
		return zacin;
	}

	public void setZacin(ZacinDTO zacin) {
		this.zacin = zacin;
	}

	@Override
	public String toString() {
		return "StavkaCenovnikaDTO [id=" + id + ", komKarton=" + komKarton + ", pakovanjeKG=" + pakovanjeKG
				+ ", netoCena=" + netoCena + ", zacin=" + zacin + "]";
	}

}
