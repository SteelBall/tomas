using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
// Koden ovanf�r ber�ttar vilka bibliotek man vill anv�nda sig utav och med hj�lp av dessa kan jag skriva koden under //


namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args) // Detta �r main-metoden //
        {
            string strNamn1;      // variabel f�r f�rnamn //
            string strNamn2;      // variabel f�r efternamn //
            int alder = 0;        // variabel f�r �lder //

            Console.Write("Hall� d�r! V�nligen skriv in ditt f�rnamn: ");   // en h�lsning till anv�ndare och fr�ga om anv�ndares f�rnamn //

            strNamn1 = Console.ReadLine();      // l�ser in f�rnamnet //

            Console.Clear();          // tar bort nuvarande mening f�r att undvika flera meningar efter varandra //

            Console.Write("V�nligen skriv in ditt efternamn: ");   // andra fr�gan om anv�ndares efternamn //

            strNamn2 = Console.ReadLine();         // l�ser in efternamn //

            Console.Clear();          // tar bort nuvarande mening....//

            Console.WriteLine("V�lkommen till mitt program " + strNamn1 + " " + strNamn2 + "! Tryck p� ENTER f�r att g� vidare.");

            Console.ReadKey();        // anv�ndaren trycker p� ENTER f�r att g� vidare till fr�gan under //

            Console.Clear();          // tar bort nuvarande mening....//

            Console.Write("Hur gammal �r du" + " " + strNamn1 + "? ");        // skriver ut fr�gan med f�rnamn, med hj�lp av variabeln "strNamn" //
                               
            alder = Convert.ToInt32(Console.ReadLine());       // konverterar till nr ist�llet f�r karakt�rer samt l�ser in �ldern //

            Console.Clear();            // tar bort nuvarande mening....//

            Console.Write("Antal dagar du har levt: " + alder*365);        // svaret p� fr�gan, den r�knar ut �lder g�nger 365 dagar, den bortser dock ifr�n skott�r // 

            Console.ReadKey();         // s� att konsolrutan inte st�ngs efter att man fyllt i �lder //

                    


        }
    }
}
