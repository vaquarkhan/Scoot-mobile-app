package com.scootapp.tv.d;

import java.util.ArrayList;

public final class e
{
  private static final ArrayList<String> a = new ArrayList();
  
  public static int a()
  {
    return a.size();
  }
  
  public static int a(String paramString)
  {
    int j = a.indexOf(paramString);
    int i = j;
    if (j < 0)
    {
      i = a.size();
      a.add(i, paramString);
    }
    return i;
  }
  
  public static String a(int paramInt)
  {
    if (a.size() > 0) {
      return (String)a.get(paramInt);
    }
    return "";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */