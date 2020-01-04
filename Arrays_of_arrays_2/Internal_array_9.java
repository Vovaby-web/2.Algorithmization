/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */
package Arrays_of_arrays_2;

import java.util.Scanner;

public class Internal_array_9
{
  public static void main (String[] args)
  {
    int n = 5, m = 1;
    int s[] = new int[n+1];
    int[][] a = new int[n+1][n+1];
    System.out.println("Исходная матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        a[i][j] = (int) (Math.random()*9);//пускай это будут числа случайные от 0 до 9
        s[j] += a[i][j];
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
    for (int i = 2;i<=n;i++)
      if (s[m]<s[i])
        m = i;
    System.out.print(m+"-й столбец содержит макс сумму="+s[m]);
  }
}
