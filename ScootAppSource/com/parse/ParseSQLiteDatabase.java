package com.parse;

import a.ac;
import a.o;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ParseSQLiteDatabase
{
  private static final ExecutorService dbExecutor = ;
  private static final TaskQueue taskQueue = new TaskQueue();
  private o<Void> current = null;
  private final Object currentLock = new Object();
  private SQLiteDatabase db;
  private int openFlags;
  private final ac<Void> tcs = new ac();
  
  private ParseSQLiteDatabase(int paramInt)
  {
    this.openFlags = paramInt;
    taskQueue.enqueue(new ParseSQLiteDatabase.2(this));
  }
  
  static o<ParseSQLiteDatabase> openDatabaseAsync(SQLiteOpenHelper paramSQLiteOpenHelper, int paramInt)
  {
    ParseSQLiteDatabase localParseSQLiteDatabase = new ParseSQLiteDatabase(paramInt);
    return localParseSQLiteDatabase.open(paramSQLiteOpenHelper).b(new ParseSQLiteDatabase.1(localParseSQLiteDatabase));
  }
  
  public o<Void> beginTransactionAsync()
  {
    synchronized (this.currentLock)
    {
      this.current = this.current.b(new ParseSQLiteDatabase.7(this), dbExecutor);
      o localo = this.current.b(new ParseSQLiteDatabase.8(this), o.a);
      return localo;
    }
  }
  
  public o<Void> closeAsync()
  {
    synchronized (this.currentLock)
    {
      this.current = this.current.b(new ParseSQLiteDatabase.13(this), dbExecutor);
      o localo = this.current.b(new ParseSQLiteDatabase.14(this), o.a);
      return localo;
    }
  }
  
  public o<Void> deleteAsync(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    synchronized (this.currentLock)
    {
      paramString1 = this.current.c(new ParseSQLiteDatabase.24(this, paramString1, paramString2, paramArrayOfString), dbExecutor);
      this.current = paramString1.k();
      paramString1 = paramString1.b(new ParseSQLiteDatabase.25(this), o.a).k();
      return paramString1;
    }
  }
  
  public o<Void> endTransactionAsync()
  {
    synchronized (this.currentLock)
    {
      this.current = this.current.a(new ParseSQLiteDatabase.11(this), dbExecutor);
      o localo = this.current.b(new ParseSQLiteDatabase.12(this), o.a);
      return localo;
    }
  }
  
  public boolean inTransaction()
  {
    return this.db.inTransaction();
  }
  
  public o<Void> insertOrThrowAsync(String paramString, ContentValues paramContentValues)
  {
    synchronized (this.currentLock)
    {
      paramString = this.current.c(new ParseSQLiteDatabase.20(this, paramString, paramContentValues), dbExecutor);
      this.current = paramString.k();
      paramString = paramString.b(new ParseSQLiteDatabase.21(this), o.a).k();
      return paramString;
    }
  }
  
  public o<Void> insertWithOnConflict(String paramString, ContentValues paramContentValues, int paramInt)
  {
    synchronized (this.currentLock)
    {
      paramString = this.current.c(new ParseSQLiteDatabase.18(this, paramString, paramContentValues, paramInt), dbExecutor);
      this.current = paramString.k();
      paramString = paramString.b(new ParseSQLiteDatabase.19(this), o.a).k();
      return paramString;
    }
  }
  
  public o<Boolean> isOpenAsync()
  {
    synchronized (this.currentLock)
    {
      o localo = this.current.a(new ParseSQLiteDatabase.4(this));
      this.current = localo.k();
      return localo;
    }
  }
  
  public o<Boolean> isReadOnlyAsync()
  {
    synchronized (this.currentLock)
    {
      o localo = this.current.a(new ParseSQLiteDatabase.3(this));
      this.current = localo.k();
      return localo;
    }
  }
  
  o<Void> open(SQLiteOpenHelper paramSQLiteOpenHelper)
  {
    synchronized (this.currentLock)
    {
      this.current = this.current.a(new ParseSQLiteDatabase.6(this, paramSQLiteOpenHelper), dbExecutor).b(new ParseSQLiteDatabase.5(this), o.a);
      paramSQLiteOpenHelper = this.current;
      return paramSQLiteOpenHelper;
    }
  }
  
  public o<Cursor> queryAsync(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2)
  {
    synchronized (this.currentLock)
    {
      paramString1 = this.current.c(new ParseSQLiteDatabase.16(this, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2), dbExecutor).c(new ParseSQLiteDatabase.15(this), dbExecutor);
      this.current = paramString1.k();
      paramString1 = paramString1.b(new ParseSQLiteDatabase.17(this), o.a);
      return paramString1;
    }
  }
  
  public o<Cursor> rawQueryAsync(String paramString, String[] paramArrayOfString)
  {
    synchronized (this.currentLock)
    {
      paramString = this.current.c(new ParseSQLiteDatabase.27(this, paramString, paramArrayOfString), dbExecutor).c(new ParseSQLiteDatabase.26(this), dbExecutor);
      this.current = paramString.k();
      paramString = paramString.b(new ParseSQLiteDatabase.28(this), o.a);
      return paramString;
    }
  }
  
  public o<Void> setTransactionSuccessfulAsync()
  {
    synchronized (this.currentLock)
    {
      this.current = this.current.d(new ParseSQLiteDatabase.9(this), dbExecutor);
      o localo = this.current.b(new ParseSQLiteDatabase.10(this), o.a);
      return localo;
    }
  }
  
  public o<Integer> updateAsync(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    synchronized (this.currentLock)
    {
      paramString1 = this.current.c(new ParseSQLiteDatabase.22(this, paramString1, paramContentValues, paramString2, paramArrayOfString), dbExecutor);
      this.current = paramString1.k();
      paramString1 = paramString1.b(new ParseSQLiteDatabase.23(this), o.a);
      return paramString1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */