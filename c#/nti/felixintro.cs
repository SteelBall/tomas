using System;

namespace upp2
{
  class Program
  {
    static void Main(String[] args)
    {
      Console.WriteLine("V�lkommen! Skriv in din �lder:");

      string enterYear = Console.ReadLine();
      int age = Convert.ToInt32(enterYear);

      int finalAge = 365*age;//+age/4;
      
      Console.WriteLine("Du har levt" + finalAge + "dagar"); 

      Console.ReadKey();
    }
  }
}
