/*
    Uppgift3
    hitta h�gsta och l�gsta tal med javakod.
    Tomas Berggren, tombe691@gmail.com
    2019-02-10
*/
import java.util.Scanner;
import java.util.Arrays;



public class Uppgift3 {
    public static int ReadInput(String text){
        int number = 0;
	// Create a Scanner object
        Scanner myObj = new Scanner(System.in); 
        System.out.print("Mata in tal "+text+" :");
        if(myObj.hasNext()) {
            if (myObj.hasNextInt()) {
		// Read user input
                number = myObj.nextInt();  
            }
            else {
		// Output user input
                System.out.println("Tal "+text+" �r inte ett tal, du matade in: " + myObj.nextLine());  
            }
        }
        else {
	    // Output user input
            System.out.println("Felaktig inmatning, returnerar 0");

        }
        return number;
    }
    public static void main (String[] args) {
        int[] array = new int[3];
        double number_1, number_2, number_3;
        array[0] = ReadInput("1");
        array[1] = ReadInput("2");
        array[2] = ReadInput("3");

	System.out.println("Det f�rsta talet �r "+array[0]+".");  
	System.out.println("Det andra talet �r "+array[1]+".");  
	System.out.println("Det tredje talet �r "+array[2]+".");  
	Arrays.sort(array);
	System.out.println("\nDet st�rsta talet �r "+array[2]+".");  
	System.out.println("\nDet minsta talet �r "+array[0]+".");  
    }
}
