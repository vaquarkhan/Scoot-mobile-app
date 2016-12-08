package com.parse;

import a.m;
import a.o;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

class ParseSQLiteDatabase$18
  implements m<Void, Long>
{
  ParseSQLiteDatabase$18(ParseSQLiteDatabase paramParseSQLiteDatabase, String paramString, ContentValues paramContentValues, int paramInt) {}
  
  public Long then(o<Void> paramo)
  {
    return Long.valueOf(ParseSQLiteDatabase.access$300(this.this$0).insertWithOnConflict(this.val$table, null, this.val$values, this.val$conflictAlgorithm));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */