import java.util.Arrays;
import java.util.Scanner;
public class Fase2 {
	  public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			 
			//Decide the number of cities
			System.out.print("Enter how many cities you want to write: ");
			int numOfCities = Integer.parseInt(scan.nextLine());
	 
			//Create a string array to store the names of the cities
			String arrayOfCities[] = new String[numOfCities];
			for (int i = 0; i < arrayOfCities.length; i++) {
				System.out.print("Enter the name of the city " + (i+1) + " : ");
			        arrayOfCities[i] = scan.nextLine();
			}
			    
			//Now show your cities's name one by one in alphabetic order
			Arrays.sort(arrayOfCities);
			for (int i = 0; i < arrayOfCities.length; i++) {
				System.out.print("My cities in alphabetic order are : ");
			        System.out.print(arrayOfCities[i] + "\n");
			}
			scan.close();
  }
}