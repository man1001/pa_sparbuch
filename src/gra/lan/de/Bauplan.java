package gra.lan.de;

public class Bauplan {
	double kontostand = 1000.0;
	String name;
	double zinssatz = 0.55;
	String log="";

	
	public Bauplan(String n){
		this.name = n;
	}
	
	public void buchen(double d){
		double betrag = kontostand+d;
		if(betrag<0){
			System.out.println("Buchung nicht möglich");
			
		}else{
		log += "Kontostand: "+kontostand+" Buchung: "+ d +" Neuer Kontostand:";
		kontostand = kontostand+d;
		log +=kontostand+"\n";
		System.out.println("Buchung erfolgreich");
		System.out.println("Neuer Kontostand: "+kontostand +"€");
		}
	}
	
	public double zinsenBerechnen(){
		double z = kontostand*zinssatz;
		return z;
	}
	
	public String getLog(){
		return log;
	}
	
}
