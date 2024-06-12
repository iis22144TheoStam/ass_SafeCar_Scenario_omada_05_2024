import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SafeCar {

	public static void main(String[] args) {
		Lista2 lista2 = new Lista2();
	
		
		//Customer creation
	    Pelaths2 Customer1 = new Pelaths2("Maria","Papadopoulou","2310264368","maria.papadopoulou@gmail.com","AO79432");
	    if(lista2.controlPel(Customer1))
		   System.out.println("Added " + Customer1.getOnoma() );
	    else
	    	System.out.println("exists");
	    
	    Pelaths2 Customer2 = new Pelaths2("Maria","Papadopoulou","2310264368","maria.papadopoulou@gmail.com","AO79432");
	    if(lista2.controlPel(Customer2))
			   System.out.println("Added " + Customer2.getOnoma() );
	    else
	    	System.out.println("exists");
	    
	    Pelaths2 Customer3 = new Pelaths2("Evanthia","Papagianni","2310245368","evanthia.papagianni@gmail.com","AO77813");
	    if(lista2.controlPel(Customer3))
			   System.out.println("Added " + Customer3.getOnoma() );
	    else
	    	System.out.println("exists");
	    
	    Pelaths2 Customer4 = new Pelaths2("Vasilis","Karagiannis","2310245668","ioannis.karagiannis@gmail.com","AO45698");
	    if(lista2.controlPel(Customer4))
			   System.out.println("Added " + Customer4.getOnoma() );
	    else
	    	System.out.println("exists");
	    
	    
	  //Oxima creation
	    Oxima2 oxima1 = new Oxima2("Mercedes","GLC","XKP8923","2020","7C3FR76A515072256");
	    if(lista2.controlOx(oxima1))
		   System.out.println("Added " + oxima1.getMarka() );
	    else
	    	System.out.println("exists");
	    
	    Oxima2 oxima2 = new Oxima2("Subaru","Forester","NII4269","2018","7C3FR76A555071465");
	    if(lista2.controlOx(oxima2))
			   System.out.println("Added " + oxima2.getMarka() );
	    else
	    	System.out.println("exists");
	    
	    Oxima2 oxima3 = new Oxima2("Ford","Ranger","KOH4681","2022","7C3FR76A55504645");
	    if(lista2.controlOx(oxima3))
			   System.out.println("Added " + oxima3.getMarka() );
	    else
	    	System.out.println("exists");
	    
	    Oxima2 oxima4 = new Oxima2("Mercedes","GLC","XKP8923","2020","7C3FR76A515072256");
	    if(lista2.controlOx(oxima4))
			   System.out.println("Added " + oxima4.getMarka() );
	    else
	    	System.out.println("exists");
	    
	    
	  //package creation
	    Paketo_Asfalishs2 paketo_asfalishs1 = new Paketo_Asfalishs2("ΜI93","Mikti asfalisi","6");
	    if(lista2.controlPak(paketo_asfalishs1))
		   System.out.println("Added " + paketo_asfalishs1.getCode() );
	    else
	    	System.out.println("exists");
	    
	    Paketo_Asfalishs2 paketo_asfalishs2 = new Paketo_Asfalishs2("B56","Basiki asfalisi","6");
	    if(lista2.controlPak(paketo_asfalishs2))
			   System.out.println("Added " + paketo_asfalishs2.getCode() );
	    else
	    	System.out.println("exists");
	    
	    Paketo_Asfalishs2 paketo_asfalishs3 = new Paketo_Asfalishs2("O58","Me odiki","6");
	    if(lista2.controlPak(paketo_asfalishs3))
			   System.out.println("Added " + paketo_asfalishs3.getCode() );
	    else
	    	System.out.println("exists");
	    
	    Paketo_Asfalishs2 paketo_asfalishs4 = new Paketo_Asfalishs2("ΜI93","Mikti asfalisi","6");
	    if(lista2.controlPak(paketo_asfalishs4))
			   System.out.println("Added " + paketo_asfalishs4.getCode() );
	    else
	    	System.out.println("exists");
	 
	  
	  //InsuranceContract creation
	    Asfalistiko_symvolaio2 asfalistiko_symvolaio1 = new Asfalistiko_symvolaio2(Customer1, oxima1, paketo_asfalishs2, 60);
	    lista2.addSymvolaio(asfalistiko_symvolaio1);
	    
	    Asfalistiko_symvolaio2 asfalistiko_symvolaio2 = new Asfalistiko_symvolaio2(Customer2, oxima2, paketo_asfalishs1, 120);
	    lista2.addSymvolaio(asfalistiko_symvolaio2);
	    
	    Asfalistiko_symvolaio2 asfalistiko_symvolaio3 = new Asfalistiko_symvolaio2(Customer3, oxima3, paketo_asfalishs3, 80);
	    lista2.addSymvolaio(asfalistiko_symvolaio3);
	    
	    for (int i=0; i<lista2.stoixeiaSymvolaiou.size(); i++) {
	    	Asfalistiko_symvolaio2 asfalistiko_symvolaio = lista2.stoixeiaSymvolaiou.get(i);
	    	System.out.println("Onoma pelath: " + asfalistiko_symvolaio.getCustomer().getOnoma() + 
	    			", Arithmos Kykloforias: " + asfalistiko_symvolaio.getOxima().getArithmosKykloforias() +
	    			", Perigrafi: " + asfalistiko_symvolaio.getPaketo().getPerigrafh() +
	    			", Kostos: " + asfalistiko_symvolaio.getCost());
	    }
	    
	    
	    // organosi pellaton kai ton oximaton pou tous anikei
	    HashMap<Pelaths2, HashSet<Oxima2>> customerVehiclesMap = new HashMap<>();
        HashMap<Pelaths2, Integer> customerCostMap = new HashMap<>();
	    
        for (Asfalistiko_symvolaio2 asfalistiko_symvolaio : lista2.getStoixeiaSymvolaiou()) {
        	Pelaths2 customer = asfalistiko_symvolaio.getCustomer();
        	Oxima2 oxima = asfalistiko_symvolaio.getOxima();
            int cost = asfalistiko_symvolaio.getCost();

            // Add oxima to customer's list of vehicles
            customerVehiclesMap.putIfAbsent(customer, new HashSet<>());
            customerVehiclesMap.get(customer).add(oxima);

            // Add cost to customer's total cost
            customerCostMap.put(customer, customerCostMap.getOrDefault(customer, 0) + cost);
        }
	    
        // print pelatis, ta oximatatou kai sum cost
        for (Pelaths2 customer : customerVehiclesMap.keySet()) {
            System.out.println("Customer: " + customer.getOnoma() +" :" + customer.getArithmostaut());
            System.out.print("Vehicles: ");
            for (Oxima2 oxima : customerVehiclesMap.get(customer)) {
                System.out.print(oxima.getMarka() + " :" + oxima.getArPlais()+ ", ");
            }
            System.out.println("\nTotal Cost: " + customerCostMap.get(customer));
            System.out.println("-----------");
        }
	 
	}
}

