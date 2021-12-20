package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StavkaPorudzbeniceID implements Serializable{

	private long IDPor;
	private int RBrPor;

	public StavkaPorudzbeniceID() {
	}

	public StavkaPorudzbeniceID(long iDPor, int rBrPor) {

		IDPor = iDPor;
		RBrPor = rBrPor;
	}

	public long getIDPor() {
		return IDPor;
	}

	public void setIDPor(long iDPor) {
		IDPor = iDPor;
	}

	public int getRBrPor() {
		return RBrPor;
	}

	public void setRBrPor(int rBrPor) {
		RBrPor = rBrPor;
	}

}
