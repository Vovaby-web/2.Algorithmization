/*
 * Даны действительные числа a1,a2,.....,an .
 * Найти * max( a1 + a2n ,a2 + a2n−1,an + an+1).
 * последовательности чисел нет - a[i]+a[i+1], сюда не подходит выражение - a2 + a2n−1
 * или a[i]+a[n-i], , сюда не подходит выражение - an + an+1
 */

package Onedimensional_arrays_1;

public class One_arrays_7
{
  public static void main(String args[])
  {
    byte n=10;
    int a[]=new int[n];
    int m=n-1;
    for (int i=0;i<n;i++)
    {
      a[i]=(int) (Math.random()*10+1);//пускай это будут числа случайные от 1 до 10
      System.out.print(" "+a[i]);
    }
    int max=a[0]+a[m];//первая сумма
    for (int i=0;i<(n/2-1);i++)
      if (max<a[i]+a[m-i]) max=a[i]+a[m-i];
    System.out.println("\n"+max);
  }
}
