import java.util.Objects;


public class Pelaths2 {
    private String onoma;
    private String epwnymo;
    private String phonenum;
    private String email;
    private String arithmostaut;

    public Pelaths2(String onoma, String epwnymo, String phonenum, String email, String arithmostaut) {
        this.onoma = onoma;
        this.epwnymo = epwnymo;
        this.phonenum = phonenum;
        this.email = email;
        this.arithmostaut = arithmostaut;
    }

	public String getArithmostaut() {
		return arithmostaut;
	}

	public void setArithmostaut(String arithmostaut) {
		this.arithmostaut = arithmostaut;
	}
    
	public String getOnoma() {
		return onoma;
	}

	public void setOnoma(String onoma) {
		this.onoma = onoma;
	}

	public String getEpwnymo() {
		return epwnymo;
	}

	public void setEpwnymo(String epwnymo) {
		this.epwnymo = epwnymo;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelaths2 pelaths2 = (Pelaths2) o;
        return Objects.equals(arithmostaut, pelaths2.arithmostaut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arithmostaut);
    }
	
}
