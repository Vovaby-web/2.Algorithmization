/*
 *Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
package Arrays_of_arrays_2;
public class Internal_array_2
{
  public static void main (String[] args)
  {
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
    System.out.println("Массив по диагонали - ");
    for (int i = 0;i<n;i++)
    {
      for (int j = 0;j<m;j++)
        if (j==i)System.out.print(" "+a[i][j]);
      System.out.println();
    }
  }
}
