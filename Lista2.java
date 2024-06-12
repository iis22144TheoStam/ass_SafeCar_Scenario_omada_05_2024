import java.util.ArrayList;

public class Lista2 {
	
	static ArrayList<Pelaths2> stoixeiaPelatwn = new ArrayList<Pelaths2>();
	static ArrayList<Oxima2> stoixeiaOximatos = new ArrayList<Oxima2>(); 
	static ArrayList<Paketo_Asfalishs2> stoixeiaPaketou = new ArrayList<Paketo_Asfalishs2>();
	static ArrayList<Asfalistiko_symvolaio2> stoixeiaSymvolaiou = new ArrayList<Asfalistiko_symvolaio2>();
	
	
	//public static ArrayList<Pelaths2> stoixeiaPelatwn; 
	// public ArrayList<Oxima2> stoixeiaOximatos;
	 
	 public boolean controlPel(Pelaths2 customer) {
			 
		if(!stoixeiaPelatwn.contains(customer)) {
			stoixeiaPelatwn.add(customer);
			return true;
		}else{
			return false;
		}
	}
	 
	 public boolean controlOx(Oxima2 oxima) {
		 
			if(!stoixeiaOximatos.contains(oxima)) {
				stoixeiaOximatos.add(oxima);
				return true;
			}else{
				return false;
			}
		}
			
	 public boolean controlPak(Paketo_Asfalishs2 paketo) {
		 
			if(!stoixeiaPaketou.contains(paketo)) {
				stoixeiaPaketou.add(paketo);
				return true;
			}else{
				return false;
			}
		}
	 
	 public void addSymvolaio(Asfalistiko_symvolaio2 symvolaio) {
		 
		 stoixeiaSymvolaiou.add(symvolaio);
		 
	 }

	public static ArrayList<Asfalistiko_symvolaio2> getStoixeiaSymvolaiou() {
		return stoixeiaSymvolaiou;
	}

	public static void setStoixeiaSymvolaiou(ArrayList<Asfalistiko_symvolaio2> stoixeiaSymvolaiou) {
		Lista2.stoixeiaSymvolaiou = stoixeiaSymvolaiou;
	}
	 
	 





}