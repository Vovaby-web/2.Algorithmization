/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
package Onedimensional_arrays_1;

import java.awt.print.*;

public class One_arrays_5
{
  public static void main(String[] args)
  {
    int a[]={5,7,3,9,4,6,8,0,6,8};
    String b="";
    System.out.print("Исходный массив:");
    for (int i=0;i<a.length;i++)
    {
      System.out.print(" "+a[i]);
      if (a[i]>i) b+=(a[i]+" ");
    }
    //Выводим массив на экран
    System.out.print("\nРезультат:");
    System.out.println(b);
    //Печатаем документ - нам же надо напечатать массив, а не вывести на экран, как окозалось
    PrinterJob job=PrinterJob.getPrinterJob();
    job.setPrintable(new PageImage(b));//PageImage(b) - класс для печати страницы
    if (job.printDialog())
    {
      try
      {
        job.print();
      } catch (PrinterException e)
      {
        System.out.println("Не печатает"+e);
      }
    }
  }
}
