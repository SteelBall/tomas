using System;

namespace Rextester
{
public class Program
    {
        public static void Main(string[] args)
        {

Console.WriteLine("Skriv ditt f�r och efternamn"); //Skriver ut till konsolen
string user = Console.ReadLine(); // L�ser in och sparar anv�nderens namn i variabeln user med datatypen string
Console.WriteLine("V�lkommen " + user); //Skriver ut till konsolen, h�lsar anv�ndaren v�lkommen
Console.WriteLine(user + " vad �r din �lder?"); //Skriver ut till konsolen, fr�gar anv�nderen om �lder
int age = Int32.Parse(Console.ReadLine()); // L�ser in och konverterar anv�ndarens �lder till siffor, sparar i variebeln age med datatypen int
int days = age * 365; //Multiplicerar anv�ndarens �lder med 356
Console.WriteLine(user + " du har levt i " + days + " dagar"); //Skriver ut till konsolen hur m�nga dagar anv�ndaren har levt

      }
    }
}