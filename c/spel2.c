/* 
Text�ventyrsspel fr�n grupp 1.

Testat och kommenterat av grupp 2:
Daniel, Johan, Tak-Loon, Mazen, Robert

Kommentarer som inleds med stj�rna (*) �r fr�n grupp 2.
Det �r saker vi har reagerat p�, �ndringar som skulle kunna g�ras, eller annan feedback 

Vissa av v�ra kommentarer har vi redigerat i programmet vissa har vi inte redigerat
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* 
	*deras <windows.h> beh�ver ej inkluderas - 
	anv�nds inte i programmet, antagligen hade de t�nkt 
	anv�nda biblioteket f�r n�gon funktion som inte implementerades 
*/

int main()
{	
	
    setlocale(LC_ALL, "");        //Svenska bokst�ver
    int omspel, val, completed=0; 
/* 
	* Variabeln "completed" hade kunnat vara en _Bool, 
	Eventuellt skulle det endast beh�vas en enda variabel f�r inmatning av spelarens val, 
	detta s�tt med a b c d -variabler kan dock g�ra koden mer �versk�dlig 
*/

    while(completed==0)
		
/* 
	*Spelet k�r automatiskt om fr�n b�rjan tills man "vinner", 
	kanske kunde man ha lagt in en fr�ga om spelaren vill starta om ist�llet, vid en f�rlust 
*/
    {
        system("cls");
        printf("\nDu vaknar upp en tisdagsmorgon klockan 08:50 p� t�gperongen till Link�pings Resecentrum och �r hungrig.\n");
        printf("G�rdagen minns du inte mycket av, men Slack p�minner dig snabbt om vart du ska, n�mligen L�nsmuseet.\n\n");
        printf("Tryck 1 f�r att g� till bussen. \nTryck 2 f�r att g� till Pressbyr�n\n\nSvar: ");
        do //* Snyggt med do-satserna!
        {
            scanf("%d", &val);
        }while(val<0 || val>2 );	

/* 	
	*Inmatningen upprepas vid fel inmatning, dock f�r spelaren ingen feedback om att denne matat in 
	fel v�rde, eler att spelet f�rv�ntar sig ny inmatning 
*/
		if (val==1)       //Val 1 -- Bussen direkt eller Pressbyr�n
        {
			val = 0;
			
            system("cls"); 
            printf("\nDu somnade p� bussen och vaknade upp i Motala, GAME OVER!\n\n");    //Fel
            
			printf("Tryck 1 f�r att spela om och 2 f�r att avsluta\n");
			
			scanf("%d", &omspel);
			if(omspel == 1){
				system("pause");
			}
			else{
				completed = 1;
			}			
        }
        else if (val==2)
        {
			val = 0;
			
            system("cls");
            printf("\nDu g�r till pressbyr�n och st�ller dig vid kassan, varp� en sur gubbe bakom disken fr�gar dig vad du vill ha. \n");      //R�tt
            printf("Du f�r f�ljande val: \n\nTryck 1 f�r kaffe+macka. \nTryck 2 f�r en Snickers.\n\nSvar:");
            do
            {
                scanf("%d", &val);
            }while(val<0 || val>2 );
        }
        if(val==1)        //Val 2 -- Kaffe+macka eller snickers
        {
			val = 0;
			
            system("cls");
            printf("\nDu k�nner dig pigg och m�tt fr�n din noggrant utvalda frukost, n�r du g�r mot bussarna.\n");      //R�tt
            printf("Du tittar p� busstabellen som h�nger p� sniskan.\n\nTryck 1 f�r att g� p� buss nr.12. \nTryck 2 f�r att g� p� buss nr.13. \nTryck 3 f�r att g�.\n\nSvar: ");
            //* L�nga texter i printf-funktionerna emellan�t, skulle g� att korta ned raderna genom att anv�nda tv� printf
			do
            {
                scanf("%d", &val);
            }while(val<0 || val>3 );        
		}
        else if(val==2)
        {
			val = 0;
			
            system("cls");
            printf("\nDu �r n�tallergiker, varf�r valde du en Snickers?! GAME OVER\n\n");     //Fel
            
			
			printf("Tryck 1 f�r att spela om och 2 f�r att avsluta\n");
			
			scanf("%d", &omspel);
			if(omspel == 1){
				system("pause");
			}
			else{
				completed = 1;
			}
        }
        if(val==1)        //Val 3 -- Buss 12 eller buss 13
        {
			val = 0;
			
            system("cls");
            printf("\nBuss 12 g�r r�tt v�g och du g�r av vid h�llplats L�nsmus�et, d�rifr�n �r det l�tt att hitta.\n\a");     //R�tt

            completed=1;
        }
        else if(val==2)
        {
			val = 0;
			
            system("cls");
            printf("\nBussen sv�nger tv�rt av och forts�tter �t helt fel h�ll, GAME OVER!\n\n");        //Fel
            
			printf("Tryck 1 f�r att spela om och 2 f�r att avsluta\n");
			
			scanf("%d", &omspel);
			if(omspel == 1){
				system("pause");
			}
			else{
				completed = 1;
			}
        }
        else if (val==3)
        {
			val = 0;
			
            system("cls");
            printf("\nDu har valt att g�. Du beger dig av p� g�ngbanan l�ngs J�rnv�gsavenyn\n");
            printf("Du st�r nu vid ett r�dljus, d�r J�rnv�gsavenyn �verg�r till Vasav�gen. \n\nTryck 1 f�r att v�nta en minut och g� mot gr�nt. \nTryck 2 f�r att chansa mot r�tt.\n\nSvar: ");
            do
            {
                scanf("%d", &val);
            }while(val<0 || val>2 );

            if(val==1)
            {
				val = 0;
				
                system("cls");
                system("color 0A "); //*kan l�gga in en system(color) f�r att byta tillbaka till vitt
                printf("\nDu litade blint p� det gr�na ljuset och blev p�k�rd av buss nr.12 i korsningen, GAME OVER!\n\n");
				
                system("pause");
				system("color 0F ");
				printf("Tryck 1 f�r att spela om och 2 f�r att avsluta\n");
			
				scanf("%d", &omspel);
				if(omspel == 1){
					system("pause");
				}
				else{
					completed = 1;
				}
            }
            else if (val==2)
            {
				val = 0;
				
                system("cls");
                system("color 0C");
                printf("\nDu g�r lugnt uppf�r Vasav�gen, korsar till andra sidan och �r framme om tre minuter. Grattis!\n\a");
				system("pause");
/* 
	*Det skulle kanske vara bra att l�gga in en system(color) f�r att byta 
	tillbaka till vitt innan spelet avslutas helt
*/
				system("color 0F ");
                completed=1;
            }
        }
    }
	return 0;
}
