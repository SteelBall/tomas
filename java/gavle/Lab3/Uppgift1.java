import java.math.BigDecimal;

public class Uppgift1 {

    public static void main (String[] args) {
        int a = 12;
        int b = 25;
        int c = -1;

        int a2 = a;
        int b2 = b;

//        ++b;  //�kar med 1 innan utskrift/ber�kning
//        a--;  //minskar med 1 efter utskrift/ber�kning
        //System.out.println(++b);
        //System.out.println(a--);
        System.out.println(-1*++b2*a2--);
        c *= ++b * a--;
        if (c % b == a + 2) {
            System.out.println("in if");
            c *= c;
        } else if (b % a == -c % a) {
            System.out.println("in else if b%a = "+ b % a +" -c % a = "+- c % a);
            System.out.println(c /= -1);
            //c /= -1;
        } else {
            System.out.println("in else");
            c += a - b;
        }
        System.out.println ("a: " + a + "; b: " + b + "; c: " + c);
        //a: 11; b: 26; c: 312

        int hundra = 100;
        int tusen = 1000;
        int tiotusen = 10000;
        //hundratusen m�ste ha en datatyp d�r alla siffror f�r plats
	//long �r en int som har fler bytes att lagra stora tal i
        long hundratusen = 100000;
	// big decimal kan anv�ndas till stora flyttal i java
        BigDecimal hundratusenpunktnoll = new BigDecimal(100000.0);
	//blir fel d� 100000 f�r fel typ
        System.out.println (100 * 1000 * 10000 * 100000);
	//blir r�tt d� 100000 hanteras p� r�tt s�tt
        System.out.println(hundra * tusen * tiotusen * hundratusen); 
	//blir fel d� 100000.0 f�r fel typ
        System.out.println (100 * 1000 * 10000 * 100000.0);
	//egen metod i klassen f�r att multiplicera BigDecimal
        System.out.println(hundratusenpunktnoll.multiply(new BigDecimal(hundra * tusen * tiotusen)));
    }
}
