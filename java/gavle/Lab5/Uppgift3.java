/*
    Uppgift3
    F�rklara resultatet.
    Tomas Berggren, tombe691@gmail.com
    2019-03-31
*/


public class Uppgift3
{
    public static void main(String[] args) {
	// en array med 3 platser, index 0, 1, 2
	int[] numbers = { 5, 0, -23 };
	// byter ut v�rdet p� index 1, dvs 0 till 16
	numbers[1] += 16;
	// skapar en ny array (values) som pekar p� adressen till den f�rsta arrayen
	// (numbers) hade man anv�nt pekare mer tydligt i java hade det varit tydligare
	// den andra variabeln pekar p� samma minnesutrymme
	int[] values = numbers;
	// �ndrar v�rdet p� den f�rsta adressen till 10, eftersom adressen
	// �r samma f�r b�da arrayerna �ndras inneh�llet f�r b�da
	values[0] = 10;
	// multiplicerar den sista positionen med -2 och f�r 46
	values[2] *= -2;
	// skriver ut den nya och f�r 10 16 46
	for (int i = 0; i < numbers.length; i++)
	    System.out.println (numbers[i]);
    }
}
