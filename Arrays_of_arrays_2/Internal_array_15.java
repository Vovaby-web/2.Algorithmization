/*
 *Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
package Arrays_of_arrays_2;

public class Internal_array_15
{
  public static void main (String[] args)
  {
    int n = 5, m = 5, x = 1, y = 1;
    int[][] a = new int[n+1][m+1];
    System.out.println("Исходная матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        a[i][j] = (int) (Math.random()*9);//пускай это будут числа случайные от 0 до 15
        if (a[x][y]<a[i][j])
        {
          x = i;
          y = j;
        }
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
    System.out.println("Нашли наибольший элемент матрицы и \n" +
        "заменить все нечетные элементы на него - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        if ((i%2!=0)||(j%2!=0))a[i][j]=a[x][y];
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
  }
}
