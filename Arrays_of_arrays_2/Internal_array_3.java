/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
package Arrays_of_arrays_2;

public class Internal_array_3
{
  public static void main (String[] args)
  {
    int k = 4, p = 3;
    byte n = 5, m = 5;
    int[][] a = new int[n][m];
    System.out.println("Исходный массив - ");
    for (int i = 0;i<n;i++)
    {
      for (int j = 0;j<m;j++)
      {
        a[i][j] = (int) (Math.random()*9+1);//пускай это будут числа случайные от 1 до 9
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
    System.out.println("k-я строка и p-й столбец - ");
    for (int i = 0;i<n;i++)
    {
      for (int j = 0;j<m;j++)
      {
        if (j==p)
          System.out.print(" "+a[i][j]);
        else if (i==k)
          System.out.print(" "+a[i][j]);
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}
