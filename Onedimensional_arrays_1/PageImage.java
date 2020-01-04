package Onedimensional_arrays_1;

import java.awt.*;
import java.awt.print.*;

class PageImage implements Printable
{
  String s;
  PageImage(String s)
  {
    this.s=s;
  }
  public int print(Graphics g,PageFormat pf,int pageNumber) throws PrinterException
  {
    if (pageNumber>=1)
    {
      return (Printable.NO_SUCH_PAGE);
    } else
    {
      g.drawString(s,300,150);
    }
    return (Printable.PAGE_EXISTS);
  }
}
