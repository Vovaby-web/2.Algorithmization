/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
package Onedimensional_arrays_1;

public class One_arrays_4
{
  public static void main(String[] args)
  {
    int a[]={5,-7,3,9,4,-6,8,0,6,8};
    int largest=0, least=0, s_lar=0, s_leas=0;
    int i=0;
    System.out.println("Исходный массив:");
    for (;i<a.length;i++)
    {
      System.out.print(" "+a[i]);
      if (a[i]<least)
      {
        least=a[i];
        s_leas=i;
      }
      if (a[i]>largest)
      {
        largest=a[i];
        s_lar=i;
      }
    }
    //Замена местами наибольшего и наименьшего
    i=a[s_lar];
    a[s_lar]=a[s_leas];
    a[s_leas]=i;
    System.out.println("\nНаименьшее число в массиве:"+least);
    System.out.println("Наибольшее число в массиве:"+largest);
    System.out.println("Массив с учетом замены:");
    for (i=0;i<a.length;i++)System.out.print(" "+a[i]);
  }
}
