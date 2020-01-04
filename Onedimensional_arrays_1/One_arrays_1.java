/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
package Onedimensional_arrays_1;

public class One_arrays_1
{
  public static void main(String[] args)
  {
    int a[]={5,7,3,9,4,6,8,10};
    int K=4, sum=0;
    for (int i=0;i<a.length;i++) if (a[i]%K==0) sum+=a[i];
    System.out.println("Сумма элементов:"+sum);
  }
}
