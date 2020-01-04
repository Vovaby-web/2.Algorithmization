/*
 * Дана последовательность целых чисел a1,a2,...,an . Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1,a2,....,an).
 */
package Onedimensional_arrays_1;

public class One_arrays_8
{
  public static void main(String args[])
  {
    byte n=10;
    int a[]=new int[n];
    int min=0;
    System.out.print("Исходный массив-");
    for (int i=0;i<n;i++)
    {
      a[i]=(int) (Math.random()*10+1);//пускай это будут числа случайные от 1 до 10
      System.out.print(" "+a[i]);
    }
    min=a[0];
    for (int i=0;i<n;i++)
      if (min>a[i]) min=a[i];
    System.out.println("\nМинимальное значение в массиве-"+min);
    for (int i=0;i<n;i++)
      if (a[i]==min)
      {
        if (i<n-1) for (int j=i;j<n-1;j++) a[j]=a[j+1];
        else a[i]=0;//с последним элементом можно было ничего не делать, но я его обнулил
        n--;
      }
    System.out.print("Полученный массив-");
    for (int i=0;i<n;i++) System.out.print(" "+a[i]);
  }
}
