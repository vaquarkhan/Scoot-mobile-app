package e.a;

import java.util.Calendar;
import java.util.TimeZone;

public final class cy
{
  public static final long a;
  
  static
  {
    Calendar localCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    localCalendar.set(1904, 0, 1, 0, 0, 0);
    localCalendar.set(14, 0);
    a = localCalendar.getTimeInMillis();
  }
  
  public static int a(long paramLong)
  {
    return (int)((paramLong - a) / 1000L);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */