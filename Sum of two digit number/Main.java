#include<stdio.h>
int main()
{
  int num, a, b, sum;
  scanf("%d ", &num);
  a = num / 10;
  b = num % 10;
  sum = a + b;
  printf("%d", sum);
}