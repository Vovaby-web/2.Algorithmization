/*
Даны две последовательности a1  a2  an и b1  b2  bm . Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
package Onedimensional_arrays_Sorting_3;

public class Arrays_sorting_2
{
  public static void main (String[] args)
  {
    byte n = 10, m = 6;
    int[] a = new int[n+m];
    int[] b = new int[m];
    int k = 0;
    System.out.println("k = "+k);
    System.out.println("Исходный массив №1 - ");
    a[0] = (int) (Math.random()*9);
    System.out.print(" "+a[0]);
    for (int i = 1;i<n;i++)
    {
      a[i] = (int) (Math.random()*9+a[i-1]);//пускай это будут числа случайные по возрастанию
      if (a[i]<10)
        System.out.print(" ");
      System.out.print(" "+a[i]);
    }
    System.out.println();
    System.out.println("Исходный массив №2 - ");
    b[0] = (int) (Math.random()*9);
    System.out.print(" "+b[0]);
    for (int i = 1;i<m;i++)
    {
      b[i] = (int) (Math.random()*9+b[i-1]);//пускай это будут числа случайные по возрастанию
      if (b[i]<10)
        System.out.print(" ");
      System.out.print(" "+b[i]);
    }
    System.out.println();
    //Соединим 2 массива
    for (int i = n;i<n+m;i++)
      a[i] = b[i-n];
    //отсортируем его по возрастанию
    for (int i = 0;i<n+m-1;i++)
      for (int j = 0;j<n+m-1;j++)
        if (a[j]>a[j+1])
        {
          k = a[j];
          a[j] = a[j+1];
          a[j+1] = k;
        }
    //распечатаем полученный массив
    System.out.println("Полученный массив - ");
    for (int i = 0;i<n+m;i++)
      System.out.print(" "+a[i]);
  }
}
