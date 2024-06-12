import java.util.Objects;

public class Asfalistiko_symvolaio2 {
	private String hmeromhnia_lhxhs;
	private Pelaths2 customer;
	private Oxima2 oxima;
	private Paketo_Asfalishs2 paketo;
	private int cost;
	
	public Asfalistiko_symvolaio2(Pelaths2 customer, Oxima2 oxima, Paketo_Asfalishs2 paketo, int cost) {
		this.customer = customer;
        this.oxima = oxima;
        this.paketo = paketo;
        this.cost = cost;  
    }

	public Pelaths2 getCustomer() {
		return customer;
	}

	public void setCustomer(Pelaths2 customer) {
		this.customer = customer;
	}

	public Oxima2 getOxima() {
		return oxima;
	}

	public void setOxima(Oxima2 oxima) {
		this.oxima = oxima;
	}

	public Paketo_Asfalishs2 getPaketo() {
		return paketo;
	}

	public void setPaketo(Paketo_Asfalishs2 paketo) {
		this.paketo = paketo;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}