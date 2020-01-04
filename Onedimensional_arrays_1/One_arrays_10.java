/*
 *Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 *элемент(освободившиеся элементы заполнить нулями).Примечание. Дополнительный массив не использовать.
 */
package Onedimensional_arrays_1;

public class One_arrays_10
{
  public static void main (String args[])
  {
    byte n = 10;
    int a[] = new int[n+1];
    System.out.print("Исходный массив - ");
    for (int i = 1;i<=n;i++)
    {
      a[i] = (int) (Math.random()*9+1);
      System.out.print(" "+a[i]);
    }
    for (int i = 1;i<=n;i++)
    {
      if ((n-i)%2==0)//срабатывает на каждом 2 элементе
        // т.к. изменяется n в данном коде
      {
        for (int j = i;j<n;j++)
          a[j] = a[j+1];
        a[n] = 0;
        n--;
      }
    }
    System.out.print("\nПолученный массив-");
    for (int i = 1;i<=10;i++)
      System.out.print(" "+a[i]);
  }
}
