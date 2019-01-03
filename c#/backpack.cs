using System;

namespace Ryggs�cken
{
    class Program
    {
        static void Main(string[] args)
        {
            /*H�r initieras en bool f�r att vi ska kunna anv�nda oss av en loop,
             * i annat fall skulle menyn endast synas en g�ng*/
            bool isRunning = true;
            /* vi beh�ver initsiera v�r str�ng(str) "content" h�r f�r att den ska vara synlig f�r alla
             * nedanst�ende kodblock*/          
            string content = Console.ReadLine();
            //h�r �r sj�lva loopen, dvs s� l�nge detta �r sant kommer menyn att visas omoch om igen
            while (isRunning)
            {
                /*h�r �r sj�lva programmets meny*/
                Console.WriteLine("\n V�lkommen till ryggs�cken!");
                Console.WriteLine("\t[1] L�gg till ett f�rem�l");
                Console.WriteLine("\t[2] Skriv ut inneh�llet");
                Console.WriteLine("\t[3] Rensa Inneh�llet");
                Console.WriteLine("\t[4] Avsluta");
                Console.Write("\n G�r ett val ");


                                int selection = Convert.ToInt32(Console.ReadLine());
                //H�r �r olika utfall eroende p� vilket val anv�ndaren g�r
                if (selection == 1)
                {
                    Console.Write("L�gg till ett f�rem�l: ");
                    /* genom att anv�nda "+=" operatorn l�ggs det nya inmatade v�rdet till det gamla
                     * i annat fall visar den endast det senast inmatade v�rdet*/
                      content += Console.ReadLine();
                    // om val 1 f�r anv�ndare mata in vad den vill l�gga i ryggs�cken
                }
                else if (selection == 2)
                    //om val 2 skrivs  det som anv�ndaren har lagt till i ryggs�cken ut.
                {
                    Console.WriteLine(content);
                }
                else if (selection == 3)
                    //om val 3 tilldelas conten ett "tomt" v�rde dvs ryggs�cken t�ms
                {
                    content = "";
                }
                else if (selection == 4)
                    /*ger att bool �r false och avslutar loopen, detta eftersom
                     * att while loopen endast k�rs s� l�nge  den �r sann.
                     * detta g�r att menyn inte kommer att visas om du anger  val 4*/                    
                {
                    isRunning = false;
                }
                else
                { //Raden under kommer upp om du v�ljer utanf�r sifferspannet.
                    Console.WriteLine(" Ogiltigt val, v�lj mellan [1] [2] [3] [4]");
                    /* slutkommentar precis som ni anger i videon hade det genom att anv�nda 
                     *switch ist�llet f�r else och if else gett en elegantare kod, men ville testa 
                     *p� detta s�tt f�r att se hur det blev.
                     F�r att motverka krasch vid felaktig inmatning, t�nker jag att man kunde
                     ha l�st genom en tryParse, antar att vi kommer g� igenom det senare.*/
                }


            }
        }
    }
}
