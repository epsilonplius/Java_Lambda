package Program;

import java.math.BigDecimal;

public class PrekeBO {
	private String Id;
	private String Pavadinimas;
	private Integer Kiekis;
	private BigDecimal Kaina;
	private BigDecimal LikucioVerte;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPavadinimas() {
		return Pavadinimas;
	}
	public void setPavadinimas(String pavadinimas) {
		Pavadinimas = pavadinimas;
	}
	public Integer getKiekis() {
		return Kiekis;
	}
	public void setKiekis(Integer kiekis) {
		Kiekis = kiekis;
	}
	public BigDecimal getKaina() {
		return Kaina;
	}
	public void setKaina(BigDecimal kaina) {
		Kaina = kaina;
	}
	public BigDecimal getLikucioVerte() {
		return LikucioVerte;
	}
	public void setLikucioVerte(BigDecimal likucioVerte) {
		LikucioVerte = likucioVerte;
	}
}
