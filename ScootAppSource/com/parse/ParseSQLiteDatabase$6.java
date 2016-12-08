package com.parse;

import a.m;
import a.o;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class ParseSQLiteDatabase$6
  implements m<Void, SQLiteDatabase>
{
  ParseSQLiteDatabase$6(ParseSQLiteDatabase paramParseSQLiteDatabase, SQLiteOpenHelper paramSQLiteOpenHelper) {}
  
  public SQLiteDatabase then(o<Void> paramo)
  {
    if ((ParseSQLiteDatabase.access$400(this.this$0) & 0x1) == 1) {
      return this.val$helper.getReadableDatabase();
    }
    return this.val$helper.getWritableDatabase();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */