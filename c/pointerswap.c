#include<stdio.h>
//d� beh�ver vi anv�nda pekare
void swap(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}


int main()  //vi vill byta plats p� de v�rden som finns i a och b, sid 244
{
  int a = 1;
  int b = 2;
  printf("%d %d\n", a, b);
  swap(&a, &b);
  printf("%d %d\n", a, b);

 return 0;
}
