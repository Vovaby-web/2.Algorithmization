/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * и подсчитать количество положительных элементов в ней.
 */
package Arrays_of_arrays_2;

public class Internal_array_7
{
  public static void main (String[] args)
  {
    int n = 10;
    double[][] a = new double[n+1][n+1];
    double positive = 0;
    System.out.println("Сформированная матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        a[i][j] = Math.round(Math.sin((Math.pow(i, 2)-Math.pow(j, 2))/n));
        if (a[i][j]>0)
          positive += a[i][j];
        if (a[i][j] >= 0)
          System.out.print(" ");
        System.out.print(" "+(int) a[i][j]);
      }
      System.out.println();
    }
    System.out.println("Количество положительных элементов - "+positive);
  }
}
