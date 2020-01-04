/*
Сортировка вставками. Дана последовательность чисел a1,a2 ,...,an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1,a2 ,...,ai - упорядоченная последовательность, т. е.
a1 <= a2 <=  <= an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
package Onedimensional_arrays_Sorting_3;

public class Arrays_sorting_5
{
  public static void main(String[] args)
  {
    byte n=10;
    int[] a=new int[n];
    int m, ch=0;
    System.out.println("Исходный массив - ");
    for (int i=0;i<n;i++)
    {
      a[i]=(int) (Math.random()*9);
      System.out.print(" "+a[i]);
    }
    System.out.println();
    //Сортировка вставками
    for (int i=1;i<n-1;i++)
    {
      m=Sort(a,i);
      if (m<i)
      {
        ch=a[m];
        a[m]=a[i];
        a[i]=ch;
      }
    }
    System.out.println();
    //распечатаем полученный массив
    System.out.println("Полученный массив - ");
    for (int i=0;i<n;i++)
      System.out.print(" "+a[i]);
  }

  static int Sort(int[] a,int x)
  {
    int i=0;
    if (a[x]<a[0])return i;
    for (;i<x;i++)
      if ((a[x]>=a[i])&&(a[x]<=a[i+1])) break;
    return i;
  }
}
