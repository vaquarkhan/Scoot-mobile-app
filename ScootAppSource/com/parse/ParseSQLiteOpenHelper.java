package com.parse;

import a.o;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

abstract class ParseSQLiteOpenHelper
{
  private final SQLiteOpenHelper helper;
  
  public ParseSQLiteOpenHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    this.helper = new ParseSQLiteOpenHelper.1(this, paramContext, paramString, paramCursorFactory, paramInt);
  }
  
  private o<ParseSQLiteDatabase> getDatabaseAsync(boolean paramBoolean)
  {
    SQLiteOpenHelper localSQLiteOpenHelper = this.helper;
    if (!paramBoolean) {}
    for (int i = 1;; i = 0) {
      return ParseSQLiteDatabase.openDatabaseAsync(localSQLiteOpenHelper, i);
    }
  }
  
  public o<ParseSQLiteDatabase> getReadableDatabaseAsync()
  {
    return getDatabaseAsync(false);
  }
  
  public o<ParseSQLiteDatabase> getWritableDatabaseAsync()
  {
    return getDatabaseAsync(true);
  }
  
  public abstract void onCreate(SQLiteDatabase paramSQLiteDatabase);
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase) {}
  
  public abstract void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */