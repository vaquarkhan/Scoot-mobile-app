package com.codetroopers.betterpickers.calendardatepicker;

import java.util.Calendar;

public final class l
  implements Comparable<l>
{
  int a;
  int b;
  int c;
  private Calendar d;
  
  public l()
  {
    a(System.currentTimeMillis());
  }
  
  public l(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3);
  }
  
  public l(long paramLong)
  {
    a(paramLong);
  }
  
  public l(Calendar paramCalendar)
  {
    this.a = paramCalendar.get(1);
    this.b = paramCalendar.get(2);
    this.c = paramCalendar.get(5);
  }
  
  private void a(long paramLong)
  {
    if (this.d == null) {
      this.d = Calendar.getInstance();
    }
    this.d.setTimeInMillis(paramLong);
    this.b = this.d.get(2);
    this.a = this.d.get(1);
    this.c = this.d.get(5);
  }
  
  public long a()
  {
    if (this.d == null)
    {
      this.d = Calendar.getInstance();
      this.d.set(this.a, this.b, this.c, 0, 0, 0);
    }
    return this.d.getTimeInMillis();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = Calendar.getInstance();
    this.d.set(paramInt1, paramInt2, paramInt3, 0, 0, 0);
    this.a = this.d.get(1);
    this.b = this.d.get(2);
    this.c = this.d.get(5);
  }
  
  public void a(l paraml)
  {
    this.a = paraml.a;
    this.b = paraml.b;
    this.c = paraml.c;
  }
  
  public int b(l paraml)
  {
    if ((this.a < paraml.a) || ((this.a == paraml.a) && (this.b < paraml.b)) || ((this.a == paraml.a) && (this.b == paraml.b) && (this.c < paraml.c))) {
      return -1;
    }
    if ((this.a == paraml.a) && (this.b == paraml.b) && (this.c == paraml.c)) {
      return 0;
    }
    return 1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */