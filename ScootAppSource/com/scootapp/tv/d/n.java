package com.scootapp.tv.d;

import java.util.ArrayList;

public final class n
{
  private static final ArrayList<String> a = new ArrayList();
  
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
  
  public static void a()
  {
    a.clear();
  }
  
  public static ArrayList<String> b()
  {
    return a;
  }
  
  public static int c()
  {
    return a.size();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */