package com.scootapp.tv.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.sagar.taxiapp.beans.b;
import com.scootapp.tv.a.z;
import com.scootapp.tv.d.f;
import java.util.List;

public final class a
{
  private static String a;
  private static final String b = z.t;
  private static String c;
  private static String d;
  
  public static int a(String paramString)
  {
    c = z.v + "='" + paramString + "'";
    try
    {
      paramString = new ContentValues();
      paramString.put(z.w, Integer.valueOf(1));
      int i = f.a(b, paramString, c, null);
      return i;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return 0;
  }
  
  public static long a()
  {
    a = z.a;
    c = "";
    d = "";
    return f.b(a, b, c, d);
  }
  
  public static long a(b paramb)
  {
    ContentValues localContentValues = new ContentValues();
    long l = a();
    if (l < 8L) {
      localContentValues.put(z.a, Long.valueOf(l + 1L));
    }
    for (;;)
    {
      localContentValues.put(z.v, paramb.c());
      localContentValues.put(z.g, paramb.d());
      localContentValues.put(z.h, paramb.a());
      localContentValues.put(z.d, paramb.f());
      localContentValues.put(z.p, paramb.e());
      localContentValues.put(z.w, Integer.valueOf(paramb.g()));
      localContentValues.put(z.l, paramb.b());
      localContentValues.put(z.x, paramb.h());
      localContentValues.put(z.y, paramb.i());
      localContentValues.put(z.z, paramb.j());
      localContentValues.put(z.A, paramb.k());
      localContentValues.put(z.B, paramb.l());
      localContentValues.put(z.C, paramb.m());
      return f.a(b, null, localContentValues);
      if (l == 8L)
      {
        b();
        localContentValues.put(z.a, Long.valueOf(l));
      }
    }
  }
  
  public static List<b> a(List<b> paramList)
  {
    a = "*";
    c = "";
    d = "ORDER BY " + z.a + " DESC";
    Cursor localCursor = f.a(a, b, c, d);
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      while (localCursor.moveToNext())
      {
        b localb = new b();
        localb.l(localCursor.getString(localCursor.getColumnIndex(z.C)));
        localb.c(localCursor.getString(localCursor.getColumnIndex(z.v)));
        localb.a(localCursor.getString(localCursor.getColumnIndex(z.h)));
        localb.f(localCursor.getString(localCursor.getColumnIndex(z.d)));
        localb.b(localCursor.getString(localCursor.getColumnIndex(z.l)));
        localb.e(localCursor.getString(localCursor.getColumnIndex(z.p)));
        localb.d(localCursor.getString(localCursor.getColumnIndex(z.g)));
        localb.a(localCursor.getInt(localCursor.getColumnIndex(z.w)));
        localb.g(localCursor.getString(localCursor.getColumnIndex(z.x)));
        localb.h(localCursor.getString(localCursor.getColumnIndex(z.y)));
        localb.i(localCursor.getString(localCursor.getColumnIndex(z.z)));
        localb.j(localCursor.getString(localCursor.getColumnIndex(z.A)));
        localb.k(localCursor.getString(localCursor.getColumnIndex(z.B)));
        paramList.add(localb);
      }
      localCursor.close();
    }
    return paramList;
  }
  
  public static void b()
  {
    c = z.a + " = 1";
    f.a(b, c, null);
    int i = 1;
    while (i < 8)
    {
      c = z.a + " = " + (i + 1);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(z.a, Integer.valueOf(i));
      f.a(b, localContentValues, c, null);
      i += 1;
    }
    c = z.a + " = " + 8;
    f.a(b, c, null);
  }
  
  public static void c()
  {
    f.a(b, null, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */