/*
    Uppgift2
    Gissa tal.
    Tomas Berggren, tombe691@gmail.com
    2019-03-18
*/
import java.util.Scanner;


public class Uppgift2 {
    public static int ReadInput(String text){
        int input = 0;
	// Create a Scanner object
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Gissa ett "+text+" :");
        if(myObj.hasNext()) {
            if (myObj.hasNextInt()) {
		// Read user input
                input = myObj.nextInt();  
		// Output user input
                System.out.println(text+" : " + input);  
            }
            else {
		// Output user input
                System.out.println("Inmatningen f�r "+text+" �r inte ett tal, du matade in: " + myObj.nextLine());  
            }
        }
        else {
	    // Output user input
            System.out.println("Felaktig inmatning, returnerar 0");
        }
        return input;
    }
    public static void main (String[] args) {
        int number;
	boolean play = true;
	int guess = (int) (Math.random () * 20) + 1;

	while(play) {
	    number = ReadInput(" tal mellan 1 och 20");

	    if (number < guess) {
		System.out.println("Du gissade f�r l�gt, f�rs�k igen");
	    }
	    else if (number > guess) {
		System.out.println("Du gissade f�r h�gt, f�rs�k igen");
	    }
	    else if (number == guess) {
		System.out.println("Du gissade r�tt!");
		play = false;
	    }
	}
	System.out.println("Bra jobbat, spelet �r slut");
    }
}
