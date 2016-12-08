package com.scootapp.tv.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;
import com.sagar.taxiapp.beans.OlaBookingObject;
import com.sagar.taxiapp.beans.o;
import com.scootapp.tv.a.z;
import com.scootapp.tv.d.f;
import com.scootapp.tv.d.m;
import java.util.List;

public final class c
{
  private static String a;
  private static final String b = z.b;
  private static String c;
  private static String d;
  
  public static long a()
  {
    a = z.a;
    c = "";
    d = "";
    return f.b(a, b, c, d);
  }
  
  public static long a(OlaBookingObject paramOlaBookingObject)
  {
    ContentValues localContentValues = new ContentValues();
    long l = a();
    if (l < 8L) {
      localContentValues.put(z.a, Long.valueOf(l + 1L));
    }
    for (;;)
    {
      localContentValues.put(z.s, paramOlaBookingObject.a());
      localContentValues.put(z.g, paramOlaBookingObject.g());
      localContentValues.put(z.h, paramOlaBookingObject.d());
      localContentValues.put(z.i, paramOlaBookingObject.e());
      localContentValues.put(z.n, paramOlaBookingObject.h());
      localContentValues.put(z.o, Float.valueOf(paramOlaBookingObject.i()));
      localContentValues.put(z.p, Integer.valueOf(paramOlaBookingObject.c()));
      localContentValues.put(z.l, paramOlaBookingObject.j());
      localContentValues.put(z.m, paramOlaBookingObject.b());
      localContentValues.put(z.r, paramOlaBookingObject.f());
      return f.a(b, null, localContentValues);
      if (l == 8L)
      {
        b();
        localContentValues.put(z.a, Long.valueOf(l));
      }
    }
  }
  
  public static long a(o paramo)
  {
    c = z.s + "='" + paramo.a() + "'";
    try
    {
      ContentValues localContentValues = new ContentValues();
      if (paramo.b() != 0) {
        localContentValues.put(z.p, Integer.valueOf(paramo.b()));
      }
      if (paramo.c() != null) {
        localContentValues.put(z.g, paramo.c());
      }
      int i = f.a(b, localContentValues, c, null);
      return i;
    }
    catch (Exception localException)
    {
      m.a(paramo.a(), paramo);
    }
    return 0L;
  }
  
  public static long a(String paramString1, String paramString2)
  {
    c = z.s + "='" + paramString1 + "'";
    paramString1 = new ContentValues();
    paramString1.put(z.n, paramString2);
    return f.a(b, paramString1, c, null);
  }
  
  public static String a(int paramInt)
  {
    a = z.s;
    c = z.a + "=" + paramInt;
    d = "";
    Cursor localCursor = f.a(a, b, c, d);
    if ((localCursor != null) && (localCursor.getCount() > 0) && (localCursor.moveToFirst())) {
      return localCursor.getString(localCursor.getColumnIndex(z.s));
    }
    return null;
  }
  
  public static String a(String paramString)
  {
    a = z.n;
    c = z.s + "='" + paramString + "'";
    d = "";
    paramString = f.a(a, b, c, d);
    if ((paramString != null) && (paramString.getCount() > 0) && (paramString.moveToFirst())) {
      return paramString.getString(paramString.getColumnIndex(z.n));
    }
    return "cancelled";
  }
  
  public static List<OlaBookingObject> a(List<OlaBookingObject> paramList)
  {
    a = "*";
    c = "";
    d = "ORDER BY " + z.a + " DESC";
    Cursor localCursor = f.a(a, b, c, d);
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      while (localCursor.moveToNext())
      {
        OlaBookingObject localOlaBookingObject = new OlaBookingObject();
        localOlaBookingObject.a(localCursor.getString(localCursor.getColumnIndex(z.s)));
        localOlaBookingObject.c(localCursor.getString(localCursor.getColumnIndex(z.h)));
        localOlaBookingObject.d(localCursor.getString(localCursor.getColumnIndex(z.i)));
        localOlaBookingObject.h(localCursor.getString(localCursor.getColumnIndex(z.n)));
        localOlaBookingObject.a(localCursor.getFloat(localCursor.getColumnIndex(z.o)));
        localOlaBookingObject.i(localCursor.getString(localCursor.getColumnIndex(z.l)));
        localOlaBookingObject.b(localCursor.getString(localCursor.getColumnIndex(z.m)));
        localOlaBookingObject.e(localCursor.getString(localCursor.getColumnIndex(z.r)));
        Log.v("Scoot", "Cab Company " + localOlaBookingObject.f());
        int i = localCursor.getInt(localCursor.getColumnIndex(z.p));
        String str = localCursor.getString(localCursor.getColumnIndex(z.g));
        localOlaBookingObject.a(i);
        localOlaBookingObject.g(str);
        if ("COMPLETED".equals(localOlaBookingObject.h()))
        {
          o localo = m.a(localOlaBookingObject.a());
          if (localo != null)
          {
            if (i == 0) {
              localOlaBookingObject.a(localo.b());
            }
            if ((str != null) && (str.isEmpty())) {
              localOlaBookingObject.g(localo.c());
            }
          }
        }
        paramList.add(localOlaBookingObject);
      }
      localCursor.close();
    }
    return paramList;
  }
  
  public static long b(String paramString1, String paramString2)
  {
    c = z.s + "='" + paramString1 + "'";
    paramString1 = new ContentValues();
    paramString1.put(z.m, paramString2);
    return f.a(b, paramString1, c, null);
  }
  
  public static o b(String paramString)
  {
    a = z.p + "," + z.g;
    c = z.s + "='" + paramString + "'";
    d = "";
    paramString = f.a(a, b, c, d);
    if ((paramString != null) && (paramString.getCount() > 0) && (paramString.moveToFirst()))
    {
      o localo = new o();
      localo.a(paramString.getInt(paramString.getColumnIndex(z.p)));
      localo.b(paramString.getString(paramString.getColumnIndex(z.g)));
      return localo;
    }
    return null;
  }
  
  public static void b()
  {
    int i = 1;
    c = z.a + " = 1";
    m.b(a(1));
    f.a(b, c, null);
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */