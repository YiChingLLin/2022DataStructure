import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please type (1)type and (2)number of initial people or capital and (3)years");
		Scanner sc = new Scanner(System.in);
			try {
				while(sc.hasNext()) {
					int type = sc.nextInt();
					
					switch(type){
					
						case 0://population
							int people = sc.nextInt(); 
							int pyears = sc.nextInt();
							int generation = pyears/30; 
							int prate = 2;
				
							GeomProgression<Integer> Population = new GeomProgression<Integer>(people, prate);
							Population.printProgression(generation+1);
							break;
							
						case 1://capital
							double initial = sc.nextDouble(); 
							int cyears = sc.nextInt();
							double crate = 1.026;
							GeomProgression<Double> Capital = new GeomProgression<Double>(initial, crate);
							Capital.printProgression(cyears+1);
							break;
							
						default:
							throw new Exception("InvalidType please enter type for 0 or 1");
					}
				}
				
				
			}catch(Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		sc.close();
	}

}