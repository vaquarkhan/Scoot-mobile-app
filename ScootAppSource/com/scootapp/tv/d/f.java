package com.scootapp.tv.d;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.scootapp.tv.a.z;

public final class f
  extends SQLiteOpenHelper
{
  private static f a;
  private static SQLiteDatabase b;
  private static SQLiteDatabase c;
  private static final StringBuilder d = new StringBuilder();
  
  private f(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramString, null, paramInt);
  }
  
  public static int a(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    return a().update(paramString1, paramContentValues, paramString2, paramArrayOfString);
  }
  
  public static int a(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    return a().delete(paramString1, paramString2, paramArrayOfString);
  }
  
  public static long a(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    return a().insert(paramString1, paramString2, paramContentValues);
  }
  
  public static Cursor a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    try
    {
      d.delete(0, d.length());
      d.append("SELECT ").append(paramString1).append(" FROM ").append(paramString2);
      if ((paramString3 != null) && (!"".equals(paramString3)) && (!paramString3.isEmpty())) {
        d.append(" WHERE ").append(paramString3);
      }
      if ((paramString4 != null) && (!"".equals(paramString4)) && (!paramString4.isEmpty())) {
        d.append(" ").append(paramString4);
      }
      Log.v("DBUtil", d.toString());
      paramString1 = b().rawQuery(d.toString(), null);
      return paramString1;
    }
    finally {}
  }
  
  private static SQLiteDatabase a()
  {
    if ((b == null) || (!b.isOpen())) {
      b = a.getWritableDatabase();
    }
    return b;
  }
  
  public static f a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new f(paramContext, paramContext.getResources().getString(2131296540), paramContext.getResources().getInteger(2131623942));
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static long b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    d.delete(0, d.length());
    d.append("SELECT COUNT(").append(paramString1).append(") FROM ").append(paramString2);
    if ((paramString3 != null) && (!"".equals(paramString3)) && (!paramString3.isEmpty())) {
      d.append(" WHERE ").append(paramString3);
    }
    if ((paramString4 != null) && (!"".equals(paramString4)) && (!paramString4.isEmpty())) {
      d.append(" ").append(paramString4);
    }
    Log.v("DBUtil", d.toString());
    return DatabaseUtils.longForQuery(b(), d.toString(), null);
  }
  
  private static SQLiteDatabase b()
  {
    if ((c == null) || (!c.isOpen())) {
      c = a.getReadableDatabase();
    }
    return c;
  }
  
  public void close()
  {
    try
    {
      if (b != null)
      {
        b.close();
        b = null;
      }
      if (c != null)
      {
        c.close();
        c = null;
      }
      return;
    }
    finally {}
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + z.b + "(" + z.a + " INTEGER, " + z.s + " TEXT, " + z.c + " TEXT, " + z.d + " TEXT, " + z.e + " TEXT, " + z.f + " TEXT, " + z.g + " TEXT, " + z.h + " TEXT, " + z.i + " TEXT, " + z.l + " TEXT, " + z.n + " TEXT, " + z.o + " REAL, " + z.p + " REAL, " + z.q + " TEXT, " + z.r + " TEXT, " + z.m + " TEXT DEFAULT '" + "N/A" + "')");
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + z.t + "(" + z.a + " INTEGER, " + z.v + " TEXT, " + z.d + " TEXT, " + z.g + " TEXT, " + z.h + " TEXT, " + z.l + " TEXT, " + z.p + " TEXT, " + z.w + " INTEGER, " + z.x + " TEXT, " + z.y + " TEXT, " + z.z + " TEXT, " + z.A + " TEXT, " + z.B + " TEXT, " + z.C + " TEXT)");
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + z.u + "(" + z.a + " INTEGER, " + z.v + " TEXT, " + z.d + " TEXT, " + z.g + " TEXT, " + z.h + " TEXT, " + z.l + " TEXT, " + z.p + " TEXT, " + z.w + " INTEGER, " + z.x + " TEXT, " + z.y + " TEXT, " + z.z + " TEXT, " + z.A + " TEXT, " + z.B + " TEXT, " + z.C + " TEXT)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramInt1) {
      paramSQLiteDatabase.execSQL("ALTER TABLE " + z.b + " ADD COLUMN " + z.s + " TEXT DEFAULT '" + "N/A" + "'");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */