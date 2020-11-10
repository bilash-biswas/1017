#include<stdio.h>
int main()
{
   int X,Z;
   double Y;
   scanf("%d",&X);
   scanf("%d",&Z);
   Y = (double)(X * Z) / 12;
   printf("%.3lf\n", Y);

   return 0;
}
