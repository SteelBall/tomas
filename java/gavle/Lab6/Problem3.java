/*
  Uppgift3
  Hur v�rden l�mnas �ver till metoder.
  Tomas Berggren, tombe691@gmail.com
  2019-04-08
*/


public class Problem3 {
    //3 a ett v�rde l�mnas h�r �ver "by value", dvs det som kommer
    //in �r ett tal som �r en kopia p� det v�rde som skickades in
    //ett alternativ som flera andra spr�k anv�nder �r "by reference"
    //d� skickas minnesadressen till variabeln in ist�llet och de
    //�ndringar som g�rs p�verkar �ven utanf�r metoden
    public static int sum(int startValue, int size){
	int sum = 0;
	for(int i=startValue; i<(size+startValue); i++) {
	    sum +=i;
	}
	return sum;
    }
    //3 b parameter skickas in till den h�r metoden n�r den
    //anropas fr�n main, argument �r det som tas emot, dvs
    //samma v�rde men det ena skickas och det andra tas emot
    public static int product(int startValue, int size){
	int product = 1;
	for(int i=startValue; i<(size+startValue); i++) {
	    product *=i;
	}
	return product;
    }
    //3 c koden m�ste veta om den ska skicka tillbaka n�got och i
    // s� fall vilken typ. mainmetoden i det h�r fallet �r void eftersom den
    //inte returnerar n�got. Metoden sum och product �r i den h�r
    //uppgiften av typen int och returnerar d� ett heltal som tas
    //emot d�r metoden anropas
    public static void main (String[] args) {
	int totalSum = sum(4, 6);
	System.out.println(totalSum);
	totalSum = sum(1, 10);
	System.out.println(totalSum);
	totalSum = sum(10, 5);
	System.out.println(totalSum);
	int totalProduct = product(4, 6);
	System.out.println(totalProduct);
	totalProduct = product(1, 10);
	System.out.println(totalProduct);
	totalProduct = product(10, 5);
	System.out.println(totalProduct);
    }
}
