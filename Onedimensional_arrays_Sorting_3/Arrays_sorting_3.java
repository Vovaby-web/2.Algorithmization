/*
 *Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
package Onedimensional_arrays_Sorting_3;

public class Arrays_sorting_3
{
  public static void main(String[] args)
  {
    byte n=10;
    int[] a=new int[n];
    int m;
    System.out.println("Исходный массив - ");
    a[0]=(int) (Math.random()*9);
    System.out.print(" "+a[0]);
    for (int i=1;i<n;i++)
    {
      a[i]=(int) (Math.random()*9+a[i-1]);//пускай это будут числа случайные по возрастанию
      if (a[i]<10) System.out.print(" ");//для красивого вывода на консоль
      System.out.print(" "+a[i]);
    }
    for (int i=0;i<n;i++)
    {
      for (int j=i;j<n;j++)
       if (a[i]<a[j]){
         m=a[i];
         a[i]=a[j];
         a[j]=m;
       }
    }
    System.out.println();
    //распечатаем полученный массив
    System.out.println("Полученный массив - ");
    for (int i=0;i<n;i++)
      System.out.print(" "+a[i]);
  }

}
