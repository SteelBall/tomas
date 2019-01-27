using System;
using System.Collections.Generic;

namespace P2.BokhyllanRevised
{
  class Program
  {
    static void Main(string[] args)
    {
      List<Bok> allBooks = new List<Bok>(); //lista adderas som inneh�ller referenserna till klassen Bok
      bool loop = true;
      while (loop)
	{
	  Console.WriteLine("\n\tHej och V�lkommen till Biblioteket!");
	  Console.WriteLine("\t[1] Registrera ny bok. ");
	  Console.WriteLine("\t[2] Visa b�cker.");
	  Console.WriteLine("\t[3] Radera alla b�cker.");
	  Console.WriteLine("\t[4] Avsluta");
	  Int32.TryParse(Console.ReadLine(), out int val); //f�nga felskrivningar

	  switch (val)
	    {
	    case 1:
	      allBooks.Add(Addera());
	      break; //fall ur case
	    case 2:
	      Console.WriteLine("Alla b�cker �r listade nedan: ");
	      foreach (Bok item in allBooks) //loopa igenom objekten i listan
		{
		  Console.WriteLine(item.ToString());
		}

	      break; //fall ur case
	    case 3:
	      allBooks.Clear();
	      Console.WriteLine("Raderat och klart.");
	      break; //fall ur case
	    case 4:
	      loop = false; //avsluta menyval-loop
	      break; //fall ur case
	    }
	} //While loop-vinge
    }

    public static Bok Addera() //DENNA FUNGERAR EJ OCH F�RST�R INTE PROBLEMET
    {
      Console.Write("Skriv Titel:\t");
      string titel = Console.ReadLine();
      Console.Write("Skriv Skribent:\t");
      string skribent = Console.ReadLine();
      Console.Write("V�lj Typ: [T] Tidskrift, [R] Roman eller [N] Novell: ");
      string typ = Console.ReadLine();
      Bok minBok; // = new Bok; //eget objekt skapas av klassen Bok. 
      switch (typ)
	{
	case "R":
	case "r":
	  minBok = new Roman(titel, skribent);
	return minBok; //VARF�R SKRIVER MAN RETURN? Metoden har ju ingen utdata i deklarationen?
	case "n":
	case "N":
	  minBok = new Novell(titel, skribent);
	return minBok;
	case "t":
	case "T":
	  minBok = new Tidskrift(titel, skribent);
	return minBok;
	default: //should never happen.
	  minBok = new Bok(titel, skribent);
	  return minBok;
	}
    }
  }
  

  class Bok
  {
    //3 egenskaper nedan som �r gemensamma f�r alla b�cker
    public string Titel { get; set; }
    public string Skribent { get; set; }
    public string Typ { get; set; }

    public Bok(string titel, string skribent) //Basklass-konstruktor
    {
      Titel = titel;
      Skribent = skribent;
    }

    public override string ToString()
    {
      return Titel + ", " + Skribent + ", " + Typ;
    }

  }

      
  class Tidskrift : Bok //underklass boktyp
  {
    public Tidskrift(string titel, string skribent) : base(titel, skribent) //�rvda egenskaper fr�n Bok klassen
      {
	Typ = "Tidskrift"; //ger ett v�rde till �rvd egenskap
      }
  }
  

  class Novell : Bok //underklass boktyp
  {
    public Novell(string titel, string skribent) : base(titel, skribent)
      {
	Typ = "Novell";
      }
  }

  class Roman : Bok //underklass boktyp
  {
    public Roman(string titel, string skribent) : base(titel, skribent)
      {
	Typ = "Roman";
      }


  }
}

