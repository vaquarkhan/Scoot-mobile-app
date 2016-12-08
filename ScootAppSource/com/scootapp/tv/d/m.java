package com.scootapp.tv.d;

import com.sagar.taxiapp.beans.o;
import java.util.Hashtable;

public final class m
{
  private static final Hashtable<String, o> a = new Hashtable();
  
  public static o a(String paramString)
  {
    if (a.containsKey(paramString)) {
      return (o)a.get(paramString);
    }
    return null;
  }
  
  public static void a(String paramString, o paramo)
  {
    a.put(paramString, paramo);
  }
  
  public static void b(String paramString)
  {
    if (paramString != null) {
      a.remove(paramString);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */