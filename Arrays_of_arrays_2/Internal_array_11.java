/*
 *Матрицу 10x20 заполнить случайными числами от 0 до 15.
 *Вывести на экран саму матрицу и номера строк, в
 *которых число 5 встречается три и более раз.
 */
package Arrays_of_arrays_2;

public class Internal_array_11
{
  public static void main (String[] args)
  {
    int n = 10, m = 20, s;
    int[][] a = new int[n+1][m+1];
    System.out.println("Исходная матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        a[i][j] = (int) (Math.random()*15);//пускай это будут числа случайные от 1 до 9
        if (a[i][j]<10)
          System.out.print(" ");
        System.out.print(" "+a[i][j]);
        if ((i==j)&&(a[i][j]>0))
          m += a[i][j];
      }
      System.out.println();
    }
    System.out.print("номера строк, в которых число пять \n"+"встречается три и более раз:");
    for (int i = 1;i<=n;i++)
    {
      m = 0;
      for (int j = 1;j<=n;j++)
      {
        if (a[i][j]==5)
          m++;
        if (m >= 3)
        {
          System.out.print(" "+i);
          break;
        }
      }
    }
  }
}
