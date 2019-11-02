package gra.lan.de;

import java.util.Scanner;


public class SparbuchTest {

	public static void main(String[] args) {
		boolean loop=false;

		
		Scanner scan = new Scanner(System.in);
		Bauplan meierFranz = new Bauplan("Franz Meier");
		
		while(loop==false){		
			boolean ein =false;
			boolean nextLoop =true;
			double eingabe=0;
			
			String s="";
			System.out.print("Was m�chten sie tun:\n$");
			
			s = scan.next();
			if(s.equalsIgnoreCase("buchen")){	
					try{
					System.out.print("Bitte geben sie einen Betrag ein:\n#");	
					eingabe =scan.nextDouble();
					System.out.println(eingabe);
					ein = true;
					}catch (Exception e) {
						System.out.println("[!]Fehler: Bitte nur Zahlen eingeben!");
						ein = false;
					}
				if(ein == true){
				meierFranz.buchen(eingabe);
				nextLoop=false;
				}
				
			}else if(s.equalsIgnoreCase("zinsen")){
				System.out.println(meierFranz.zinsenBerechnen());
				nextLoop=false;
			}else{
				System.out.println("Falsche Eingabe!");
			}
			
			while(nextLoop ==false){
				System.out.println("Wollen sie weiter machen? J/N");
				s=scan.next();
				if(s.equalsIgnoreCase("J")||s.equalsIgnoreCase("N")){
					if(s.equalsIgnoreCase("J")){
						nextLoop=true;
					}
					if(s.equalsIgnoreCase("N")){
						System.out.println("exit");
						nextLoop=true;
						loop=true;
					}
				}else{
					System.out.println("Falsche Eingabe!");
				}
			
			}

			
		}
	}
}
