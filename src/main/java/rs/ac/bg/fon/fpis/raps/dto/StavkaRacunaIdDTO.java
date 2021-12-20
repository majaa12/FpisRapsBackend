package rs.ac.bg.fon.fpis.raps.dto;

public class StavkaRacunaIdDTO {

	private long IDRacuna;
	private int RBrRac;

	public StavkaRacunaIdDTO() {

	}

	public StavkaRacunaIdDTO(long iDRacuna, int rBrRac) {
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
		return "StavkaRacunaIdDTO [IDRacuna=" + IDRacuna + ", RBrRac=" + RBrRac + "]";
	}
	
	
}
