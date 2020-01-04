/*
Сортировка обменами. Дана последовательность чисел a1 < a2 < ... < an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai  ai+1 , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
package Onedimensional_arrays_Sorting_3;

public class Arrays_sorting_4
{
  public static void main(String[] args)
  {
    byte n=10;
    int[] a=new int[n];
    int m, ch=0;
    System.out.println("Исходный массив - ");
    for (int i=0;i<n;i++)
    {
      if (i>0) a[i]=(int) (Math.random()*9+a[i-1]);
      else a[0]=(int) (Math.random()*9);
      if (a[i]<10) System.out.print(" ");//для красивого вывода на консоль
      System.out.print(" "+a[i]);
    }
    //Сортировка обменами
    for (int i=0;i<n-1;i++)
    {
      for (int j=0;j<n-1;j++)
        if (a[j]>a[j+1])
        {
          m=a[j];
          a[j]=a[j+1];
          a[j+1]=m;
          ch++;
        }
    }
    System.out.println();
    //распечатаем полученный массив
    System.out.println("Полученный массив - ");
    for (int i=0;i<n;i++)
      System.out.print(" "+a[i]);
    System.out.println("\nПерестановок - "+ch);
  }
}
