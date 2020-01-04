/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
package Onedimensional_arrays_1;

public class One_arrays_3
{
  public static void main(String[] args)
  {
    int a[]={5,-7,3,9,4,-6,8,0,6,8};
    int N=10, negative=0, positive=0, zro=0;
    System.out.println("\nДлина массива N="+N);
    System.out.println("Исходный массив:");
    for (int i=0;i<N;i++)
    {
      System.out.print(" "+a[i]);
      if (a[i]<0) negative++;
      else if (a[i]==0) zro++;
      else positive++;
    }
    System.out.println("\nОтрицательных значений в массиве:"+negative);
    System.out.println("Положительных значений в массиве:"+positive);
    System.out.println("Нулевых значений в массиве:"+zro);
  }
}
