package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CenovnikDTO implements Serializable {

	private long IDCen;

	private String valuta;

	private KupacDTO kupac;

	private List<StavkaCenovnikaDTO> stavkeCen;

	public CenovnikDTO() {
		stavkeCen = new ArrayList<>();
	}

	public CenovnikDTO(long iDCen, String valuta, KupacDTO kupac, List<StavkaCenovnikaDTO> stavkeCen) {
		IDCen = iDCen;
		this.valuta = valuta;
		this.kupac = kupac;
		this.stavkeCen = stavkeCen;
	}

	public long getIDCen() {
		return IDCen;
	}

	public void setIDCen(long iDCen) {
		IDCen = iDCen;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public KupacDTO getKupac() {
		return kupac;
	}

	public void setKupac(KupacDTO kupac) {
		this.kupac = kupac;
	}

	public List<StavkaCenovnikaDTO> getStavkeCen() {
		return stavkeCen;
	}

	public void setStavkeCen(List<StavkaCenovnikaDTO> stavkeCen) {
		this.stavkeCen = stavkeCen;
	}

	@Override
	public String toString() {
		return "CenovnikDTO [IDCen=" + IDCen + ", valuta=" + valuta + ", KupacDTO=" + kupac + ", stavkeCen="
				+ stavkeCen + "]";
	}

}
