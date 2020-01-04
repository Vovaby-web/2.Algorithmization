/*
 *Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 *один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 *дополнительный массив.
 */
package Onedimensional_arrays_Sorting_3;

public class Arrays_sorting_1
{
  public static void main(String[] args)
  {
    byte n=10, m=6;
    int[] a=new int[n+m];
    int[] b=new int[m];
    int k=4;
    System.out.println("k = "+k);
    System.out.println("Исходный массив №1 - ");
    for (int i=0;i<n;i++)
    {
      a[i]=(int) (Math.random()*9+1);//пускай это будут числа случайные от 1 до 9
      System.out.print(" "+a[i]);
    }
    System.out.println();
    System.out.println("Исходный массив №2 - ");
    for (int i=0;i<m;i++)
    {
      b[i]=(int) (Math.random()*9+1);//пускай это будут числа случайные jот 1 до 9
      System.out.print(" "+b[i]);
    }
    System.out.println();
    for (int i=0;i<m;i++)
    {
      a[i+n]=a[i+k];
      a[i+k]=b[i];
    }
    System.out.println();
    System.out.println("Полученный массив - ");
    for (int i=0;i<n+m;i++)
      System.out.print(" "+a[i]);
  }
}
