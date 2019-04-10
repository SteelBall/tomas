/*
  Uppgift1
  L�s in dynamiskt antal v�rden till array och sortera.
  Tomas Berggren, tombe691@gmail.com
  2019-03-31
*/
import java.util.Scanner;
import java.util.Arrays;


public class Uppgift1 {
    public static int ReadInput(String text){
        int input = 0;
	// Create a Scanner object
        Scanner myObj = new Scanner(System.in); 
        System.out.print(text+" : ");
        if(myObj.hasNext()) {
            if (myObj.hasNextInt()) {
		// Read user input
                input = myObj.nextInt();  
            }
            else {
		// Output user input
                System.out.println("Inmatningen f�r "+text+" �r inte ett tal, du matade in: " +
				   myObj.nextLine());  
            }
        }
        else {
	    // Output user input
            System.out.println("Felaktig inmatning, returnerar 0");
        }
        return input;
    }
    public static void main (String[] args) {
        int size;
	// read number of values
	size = ReadInput("Hur m�nga v�rden ska registreras?\nAnge ett heltal");
	// create array with the size given
	int myArray[] = new int[size];
	System.out.println("\nRegistrera v�rden: ");
	// input values
	for(int i=0; i<size; i++) {
	    String text = "V�rde "+(i+1);
	    myArray[i] = ReadInput(text);
	}
	// print input from array
	System.out.println("\nV�rdena i ursprunglig ordning: ");
	for(int i=0; i<size; i++) {
	    System.out.print(myArray[i]+" ");
	}
	// sort array
	Arrays.sort(myArray);
	// print sorted input from arry
	System.out.println("\n\nV�rdena i sorterad ordning: ");
	for(int i=0; i<size; i++) {
	    System.out.print(myArray[i]+" ");
	}
	// print highest and lowest value
	System.out.println("\n\nSt�rsta v�rdet: "+myArray[size-1]);
	System.out.println("Minsta v�rdet: "+myArray[0]+"\n");
    }
}
