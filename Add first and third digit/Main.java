#include<stdio.h>
int main()
{
  int num, a, b, add;
  scanf("%d", &num);
  a = num % 10;
  b = num / 100;
  add = a + b;
  printf("%d",add);
}