import java.util.Objects;

public class Paketo_Asfalishs2 {
    private String name;
    private String kalypseis;
    private String times;
    private String code;
	private String perigrafh;
	private String diarkeia;

    public Paketo_Asfalishs2(String code, String perigrafh, String diarkeia) {
        this.code = code;
        this.perigrafh = perigrafh;
        this.diarkeia = diarkeia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKalypseis() {
        return kalypseis;
    }

    public void setKalypseis(String kalypseis) {
        this.kalypseis = kalypseis;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPerigrafh() {
		return perigrafh;
	}

	public void setPerigrafh(String perigrafh) {
		this.perigrafh = perigrafh;
	}

	public String getDiarkeia() {
		return diarkeia;
	}

	public void setDiarkeia(String diarkeia) {
		this.diarkeia = diarkeia;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paketo_Asfalishs2 paketo_asfalishs2 = (Paketo_Asfalishs2) o;
        return Objects.equals(code, paketo_asfalishs2.code) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
