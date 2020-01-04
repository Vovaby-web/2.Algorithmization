/*
 *Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
 *..., n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 *собой. Построить такой квадрат.
 */
package Arrays_of_arrays_2;

public class Internal_array_16
{
  public static void main (String[] args)
  {
    int n = 3, x = 1;
    int[][] a = new int[n+1][n+1];
    System.out.println("Исходная матрица - ");
    for (int i = 1;i<n+1;i++)
    {
      for (int j = 1;j<n+1;j++)
      {
        a[i][j] = 1+((i+j-1+(n-1)/2)%n)*n+((i+2*j+2)%n);
        if (a[i][j]<10)
          System.out.print(" ");
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
  }
}
