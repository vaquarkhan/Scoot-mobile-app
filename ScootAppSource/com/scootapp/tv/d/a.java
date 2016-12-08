package com.scootapp.tv.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class a
{
  public static final Comparator<String> a = new b();
  public static final Comparator<String> b = new c();
  private static final ArrayList<String> c = new ArrayList();
  
  public static int a(String paramString)
  {
    int j = c.indexOf(paramString);
    int i = j;
    if (j < 0)
    {
      i = c.size();
      c.add(i, paramString);
    }
    return i;
  }
  
  public static String a(int paramInt)
  {
    if (!c.isEmpty()) {
      return (String)c.get(paramInt);
    }
    return "0";
  }
  
  public static void a()
  {
    c.clear();
  }
  
  public static int b(String paramString)
  {
    return c.indexOf(paramString);
  }
  
  public static ArrayList<String> b()
  {
    return c;
  }
  
  public static int c()
  {
    return c.size();
  }
  
  public static void d()
  {
    Collections.sort(c, b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */