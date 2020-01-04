/*
 *Найти положительные элементы главной диагонали квадратной матрицы.
 */
package Arrays_of_arrays_2;

public class Internal_array_10
{
  public static void main (String[] args)
  {
    int n = 8, m=0;
    int[][] a = new int[n+1][n+1];
    System.out.println("Исходная матрица - ");
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        a[i][j] = (int) (Math.random()*9-Math.random()*9);//пускай это будут числа случайные от 1 до 9
        if (a[i][j]>=0)
          System.out.print(" ");
        System.out.print(" "+a[i][j]);
        if ((i==j)&&(a[i][j]>0))m+=a[i][j];
      }
      System.out.println();
    }
    System.out.println("положительные элементы главной \nдиагонали квадратной матрицы="+m);
  }
}
