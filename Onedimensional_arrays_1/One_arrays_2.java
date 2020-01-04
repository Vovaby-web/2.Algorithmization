/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */
package Onedimensional_arrays_1;

public class One_arrays_2
{
  public static void main(String[] args)
  {
    int a[]={5,7,3,9,4,6,8,10,6,8};
    int Z=4, St=0;
    System.out.println("Исходный массив:");
    for (int i=0;i<a.length;i++)
    {
      System.out.print(" "+a[i]);
      if (a[i]>Z)
      {
        a[i]=Z;
        St++;
      }
    }
    System.out.println("\nЭлемент Z="+Z);
    System.out.println("Измененный массив:");
    for (int i=0;i<a.length;i++) System.out.print(" "+a[i]);
    System.out.println("\nКоличество замен:"+St);
  }
}