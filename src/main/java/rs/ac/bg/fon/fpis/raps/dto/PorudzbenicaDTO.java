package rs.ac.bg.fon.fpis.raps.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PorudzbenicaDTO implements Serializable {

	private long IDPor;
	private Date datumPor;
	private KupacDTO kupac;
	private CenovnikDTO cenovnik;
	private List<StavkaPorudzbeniceDTO> stavkePor;

	public PorudzbenicaDTO() {
		stavkePor = new ArrayList<>();
	}

	public PorudzbenicaDTO(long iDPor, Date datumPor, KupacDTO kupac, CenovnikDTO cenovnik,
			List<StavkaPorudzbeniceDTO> stavkePor) {
		IDPor = iDPor;
		this.datumPor = datumPor;
		this.kupac = kupac;
		this.cenovnik = cenovnik;
		this.stavkePor = stavkePor;
	}

	public long getIDPor() {
		return IDPor;
	}

	public void setIDPor(long iDPor) {
		IDPor = iDPor;
	}

	public Date getDatumPor() {
		return datumPor;
	}

	public void setDatumPor(Date datumPor) {
		this.datumPor = datumPor;
	}

	public KupacDTO getKupacDTO() {
		return kupac;
	}

	public void setKupacDTO(KupacDTO kupac) {
		this.kupac = kupac;
	}

	public CenovnikDTO getCenovnikDTO() {
		return cenovnik;
	}

	public void setCenovnikDTO(CenovnikDTO cenovnik) {
		this.cenovnik = cenovnik;
	}

	public List<StavkaPorudzbeniceDTO> getStavkePor() {
		return stavkePor;
	}

	public void setStavkePor(List<StavkaPorudzbeniceDTO> stavkePor) {
		this.stavkePor = stavkePor;
	}

	@Override
	public String toString() {
		return "PorudzbenicaDTO [IDPor=" + IDPor + ", datumPor=" + datumPor + ", kupac=" + kupac + ", cenovnik="
				+ cenovnik + ", stavkePor=" + stavkePor + "]";
	}

}
