package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class StavkaRacunaID implements Serializable{

	private long IDRacuna;
	private int RBrRac;

	public StavkaRacunaID() {

	}

	public StavkaRacunaID(long iDRacuna, int rBrRac) {
		IDRacuna = iDRacuna;
		RBrRac = rBrRac;
	}

	public long getIDRacuna() {
		return IDRacuna;
	}

	public void setIDRacuna(long iDRacuna) {
		IDRacuna = iDRacuna;
	}

	public int getRBrRac() {
		return RBrRac;
	}

	public void setRBrRac(int rBrRac) {
		RBrRac = rBrRac;
	}

	@Override
	public String toString() {
		return "StavkaRacunaID [IDRacuna=" + IDRacuna + ", RBrRac=" + RBrRac + "]";
	}
	
	

}
