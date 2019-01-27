using System;
namespace Program1
{
  public class Program
  {
    static void Main(string[] args)
    {
      Biblilotekarie obj = new Biblilotekarie();
      obj.AdderaBok();
      obj.SkrivBoklista();
      Console.ReadLine();
    }
  }
  class Bok
  {
    public string f�rfattare;
    public string titel;
  }
  class Biblilotekarie
  {
    public List<Bok> boklista = new List<Bok>();

    public void AdderaBok()
    {
      // L�gger till en bok i boklistan
      Roman nyBok = new Roman();
      nyBok.f�rfattare = "Astrid"; nyBok.titel = "Pippi";
      boklista.Add(nyBok);

    }
    public void SkrivBoklista()
    {
      // H�r kan jag skriva ut boklistan utan problem
      foreach (var item in boklista)
	{
	  Console.WriteLine(item.f�rfattare + " " + item.titel);
	} 
      // Hoppar till metoden Print i klassen Roman
      // och g�r samma sak d�r.
      Roman objRoman = new Roman();
      objRoman.Print();
    }
  }
  class Roman : Bok
  {
    Biblilotekarie objBibliotekarie = new Biblilotekarie();
    public void Print()
    {
      // Skriver ingenting
      foreach (var item in objBibliotekarie.boklista)
	{
	  Console.WriteLine(item.f�rfattare + " " + item.titel);
	}
      // F�rs�ker jag det h�r s� kraschar programmet
      Console.WriteLine(objBibliotekarie.boklista[0]);
    }
    // Det verkar som om boken som jag lade in i boklistan i klassen Biliotekarie
  } // inte finns kvar i boklistan n�r jag f�rs�ker skriva ut fr�n klassen Roman.
}
