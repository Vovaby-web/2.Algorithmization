/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
package Arrays_of_arrays_2;

public class Internal_array_4
{
  public static void main (String[] args)
  {
    int n = 5;
    n=(n%2==0)?n:--n;//делаем  четное n
    int[][] a = new int[n+1][n+1];
    System.out.println("Сформированная матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        if (i%2>0)
          a[i][j] = j;
        else
          a[i][j] = n-j+1;
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
  }
}
