package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class ar
  extends SQLiteOpenHelper
{
  ar(aq paramaq, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    int j = 1;
    Set localSet = b(paramSQLiteDatabase, "hits2");
    int i = 0;
    while (i < 4)
    {
      String str = new String[] { "hit_id", "hit_string", "hit_time", "hit_url" }[i];
      if (!localSet.remove(str))
      {
        paramSQLiteDatabase = String.valueOf(str);
        if (paramSQLiteDatabase.length() != 0) {}
        for (paramSQLiteDatabase = "Database hits2 is missing required column: ".concat(paramSQLiteDatabase);; paramSQLiteDatabase = new String("Database hits2 is missing required column: ")) {
          throw new SQLiteException(paramSQLiteDatabase);
        }
      }
      i += 1;
    }
    if (!localSet.remove("hit_app_id")) {}
    for (i = j; !localSet.isEmpty(); i = 0) {
      throw new SQLiteException("Database hits2 has extra columns");
    }
    if (i != 0) {
      paramSQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
    }
  }
  
  /* Error */
  private boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_1
    //   4: ldc 75
    //   6: iconst_1
    //   7: anewarray 23	java/lang/String
    //   10: dup
    //   11: iconst_0
    //   12: ldc 77
    //   14: aastore
    //   15: ldc 79
    //   17: iconst_1
    //   18: anewarray 23	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: aload_2
    //   24: aastore
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokevirtual 83	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_1
    //   32: aload_1
    //   33: astore 4
    //   35: aload 4
    //   37: astore_1
    //   38: aload 4
    //   40: invokeinterface 88 1 0
    //   45: istore_3
    //   46: aload 4
    //   48: ifnull +10 -> 58
    //   51: aload 4
    //   53: invokeinterface 92 1 0
    //   58: iload_3
    //   59: ireturn
    //   60: astore 5
    //   62: aconst_null
    //   63: astore 4
    //   65: aload 4
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 10	com/google/android/gms/analytics/internal/ar:a	Lcom/google/android/gms/analytics/internal/aq;
    //   72: ldc 94
    //   74: aload_2
    //   75: aload 5
    //   77: invokevirtual 100	com/google/android/gms/analytics/internal/aq:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   80: aload 4
    //   82: ifnull +10 -> 92
    //   85: aload 4
    //   87: invokeinterface 92 1 0
    //   92: iconst_0
    //   93: ireturn
    //   94: astore_1
    //   95: aload 4
    //   97: astore_2
    //   98: aload_2
    //   99: ifnull +9 -> 108
    //   102: aload_2
    //   103: invokeinterface 92 1 0
    //   108: aload_1
    //   109: athrow
    //   110: astore 4
    //   112: aload_1
    //   113: astore_2
    //   114: aload 4
    //   116: astore_1
    //   117: goto -19 -> 98
    //   120: astore 5
    //   122: goto -57 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	ar
    //   0	125	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	125	2	paramString	String
    //   45	14	3	bool	boolean
    //   1	95	4	localSQLiteDatabase	SQLiteDatabase
    //   110	5	4	localObject	Object
    //   60	16	5	localSQLiteException1	SQLiteException
    //   120	1	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   3	32	60	android/database/sqlite/SQLiteException
    //   3	32	94	finally
    //   38	46	110	finally
    //   68	80	110	finally
    //   38	46	120	android/database/sqlite/SQLiteException
  }
  
  private Set<String> b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery(String.valueOf(paramString).length() + 22 + "SELECT * FROM " + paramString + " LIMIT 0", null);
    try
    {
      paramString = paramSQLiteDatabase.getColumnNames();
      int i = 0;
      while (i < paramString.length)
      {
        localHashSet.add(paramString[i]);
        i += 1;
      }
      return localHashSet;
    }
    finally
    {
      paramSQLiteDatabase.close();
    }
  }
  
  private void b(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    paramSQLiteDatabase = b(paramSQLiteDatabase, "properties");
    while (i < 6)
    {
      String str = new String[] { "app_uid", "cid", "tid", "params", "adid", "hits_count" }[i];
      if (!paramSQLiteDatabase.remove(str))
      {
        paramSQLiteDatabase = String.valueOf(str);
        if (paramSQLiteDatabase.length() != 0) {}
        for (paramSQLiteDatabase = "Database properties is missing required column: ".concat(paramSQLiteDatabase);; paramSQLiteDatabase = new String("Database properties is missing required column: ")) {
          throw new SQLiteException(paramSQLiteDatabase);
        }
      }
      i += 1;
    }
    if (!paramSQLiteDatabase.isEmpty()) {
      throw new SQLiteException("Database properties table has extra columns");
    }
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    if (!aq.a(this.a).a(3600000L)) {
      throw new SQLiteException("Database open failed");
    }
    try
    {
      SQLiteDatabase localSQLiteDatabase = super.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException1)
    {
      aq.a(this.a).a();
      this.a.f("Opening the database failed, dropping the table and recreating it");
      Object localObject = aq.b(this.a);
      this.a.o().getDatabasePath((String)localObject).delete();
      try
      {
        localObject = super.getWritableDatabase();
        aq.a(this.a).b();
        return (SQLiteDatabase)localObject;
      }
      catch (SQLiteException localSQLiteException2)
      {
        this.a.e("Failed to open freshly created database", localSQLiteException2);
        throw localSQLiteException2;
      }
    }
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    bo.a(paramSQLiteDatabase.getPath());
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor;
    if (Build.VERSION.SDK_INT < 15) {
      localCursor = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    for (;;)
    {
      try
      {
        localCursor.moveToFirst();
        localCursor.close();
        if (!a(paramSQLiteDatabase, "hits2"))
        {
          paramSQLiteDatabase.execSQL(aq.j());
          if (a(paramSQLiteDatabase, "properties")) {
            break;
          }
          paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
          return;
        }
      }
      finally
      {
        localCursor.close();
      }
      a(paramSQLiteDatabase);
    }
    b(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */