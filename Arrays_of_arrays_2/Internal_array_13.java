/*
 *Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
package Arrays_of_arrays_2;

public class Internal_array_13
{
  public static void main (String[] args)
  {
    int n = 8, m = 0;
    int[][] a = new int[n+1][n+1];
    System.out.println("Исходная матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        a[i][j] = (int) (Math.random()*9+1);//пускай это будут числа случайные от 1 до 9
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
    System.out.println("Сортировка столбцов матрицы по возрастанию значений элементов:");
    for (int k = 1;k<=n;k++)
      for (int i = 1;i<n;i++)
        for (int j = 1;j<n;j++)
        {
          if (a[j][k]>a[j+1][k])
          {
            m = a[j][k];
            a[j][k] = a[j+1][k];
            a[j+1][k] = m;
          }
        }
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
        System.out.print(" "+a[i][j]);
      System.out.println();
    }
    System.out.println("Сортировка столбцов матрицы по убыванию значений элементов:");
    for (int k = 1;k<=n;k++)
      for (int i = 1;i<n;i++)
        for (int j = 1;j<n;j++)
        {
          if (a[j][k]<a[j+1][k])
          {
            m = a[j][k];
            a[j][k] = a[j+1][k];
            a[j+1][k] = m;
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
