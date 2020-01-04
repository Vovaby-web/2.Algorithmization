/*
 *В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 *на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 *пользователь с клавиатуры.
 */
package Arrays_of_arrays_2;

import java.util.Scanner;

public class Internal_array_8
{
  public static void main (String[] args)
  {
    int n = 8;
    int k = 0, p = 0, m = 0;
    int[][] a = new int[n+1][n+1];
    Scanner in = new Scanner(System.in);
    System.out.print("Введите номер первого столбца - ");
    String Data = in.next();
    k = Integer.parseInt(Data);
    System.out.print("Введите номер второго столбца - ");
    Data = in.next();
    p = Integer.parseInt(Data);
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
    System.out.println();
    for (int i = 1;i<=n;i++)
    {
      for (int j = 1;j<=n;j++)
      {
        if ((k<p)&&(j==k))
        {
          m = a[i][j];
          a[i][j] = a[i][p];
          a[i][p] = m;
        } else if ((k>p)&&(j==p))
        {
          m = a[i][j];
          a[i][j] = a[i][p];
          a[i][p] = m;
        }
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
  }
}
