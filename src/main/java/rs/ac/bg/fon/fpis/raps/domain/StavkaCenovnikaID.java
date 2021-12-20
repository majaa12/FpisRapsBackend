package rs.ac.bg.fon.fpis.raps.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StavkaCenovnikaID implements Serializable{

	private long IDCen;
	private int RBrCen;

	public StavkaCenovnikaID() {

	}

	public StavkaCenovnikaID(long iDCen, int rBrCen) {
		super();
		IDCen = iDCen;
		RBrCen = rBrCen;
	}

	public long getIDCen() {
		return IDCen;
	}

	public void setIDCen(long iDCen) {
		IDCen = iDCen;
	}

	public int getRBrCen() {
		return RBrCen;
	}

	public void setRBrCen(int rBrCen) {
		RBrCen = rBrCen;
	}

}
