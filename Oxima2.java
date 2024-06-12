import java.util.Objects;

public class Oxima2 {
    private String arithmosKykloforias;
    private String marka;
    private String arPlais;
    private String montelo;
    private String year;
    private Paketo_Asfalishs2 paketoAsfalishs;
    private Asfalistiko_symvolaio2 asfalistikoSymvolaio;

    public Oxima2(String marka, String montelo, String arithmosKykloforias, String year, String arPlais) {
        this.arithmosKykloforias = arithmosKykloforias;
        this.marka = marka;
        this.arPlais = arPlais;
        this.montelo = montelo;
        this.year = year;
       // this.paketoAsfalishs = paketoAsfalishs;
       // this.asfalistikoSymvolaio = asfalistikoSymvolaio;
    }

    public String getArithmosKykloforias() {
        return arithmosKykloforias;
    }

    public void setArithmosKykloforias(String arithmosKykloforias) {
        this.arithmosKykloforias = arithmosKykloforias;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getArPlais() {
		return arPlais;
	}

	public void setArPlais(String arPlais) {
		this.arPlais = arPlais;
	}

	public String getMontelo() {
        return montelo;
    }

    public void setMontelo(String montelo) {
        this.montelo = montelo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Paketo_Asfalishs2 getPaketoAsfalishs() {
        return paketoAsfalishs;
    }

    public void setPaketoAsfalishs(Paketo_Asfalishs2 paketoAsfalishs) {
        this.paketoAsfalishs = paketoAsfalishs;
    }

    public Asfalistiko_symvolaio2 getAsfalistikoSymvolaio() {
        return asfalistikoSymvolaio;
    }

    public void setAsfalistikoSymvolaio(Asfalistiko_symvolaio2 asfalistikoSymvolaio) {
        this.asfalistikoSymvolaio = asfalistikoSymvolaio;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oxima2 oxima2 = (Oxima2) o;
        return Objects.equals(arPlais, oxima2.arPlais) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(arPlais);
    }
    
}
