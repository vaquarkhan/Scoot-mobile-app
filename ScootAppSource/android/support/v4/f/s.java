package android.support.v4.f;

import java.util.Locale;

class s
{
  private static int b(Locale paramLocale)
  {
    switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
    {
    default: 
      return 0;
    }
    return 1;
  }
  
  public int a(Locale paramLocale)
  {
    if ((paramLocale != null) && (!paramLocale.equals(q.a)))
    {
      String str = a.a(paramLocale);
      if (str == null) {
        return b(paramLocale);
      }
      if ((str.equalsIgnoreCase(q.a())) || (str.equalsIgnoreCase(q.b()))) {
        return 1;
      }
    }
    return 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\f\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */