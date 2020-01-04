/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */
package Arrays_of_arrays_2;

public class Internal_array_14
{
  public static void main (String[] args)
  {
    int n = 8, m = 8;
    int[][] a = new int[n+1][m+1];
    int[] b = new int[n+1];
    System.out.println("Матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=m;j++)
      {
        b[j]++;
        if (b[j]<=j)
          a[i][j] = 1;
        else
          a[i][j] = 0;
      }
    }

    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
        System.out.print(" "+a[i][j]);
      System.out.println();
    }

  }
}
