/*
 *Дана матрица. Вывести на экран все нечетные столбцы,
 *у которых первый элемент больше последнего.
 */
package Arrays_of_arrays_2;

public class Internal_array_1
{
  public static void main (String[] args)
  {
    byte n = 3, m = 10;
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
    System.out.println("все нечетные столбцы, у которых первый элемент больше последнего");
    for (int i = 0;i<n;i++)
    {
      for (int j = 0;j<m;j++)
        if ((j%2>0)&&(a[0][j]>a[n-1][j]))
          System.out.print(" "+a[i][j]);
      System.out.println();
    }
  }
}

