package com.parse;

import a.m;
import a.o;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

class ParseSQLiteDatabase$20
  implements m<Void, Long>
{
  ParseSQLiteDatabase$20(ParseSQLiteDatabase paramParseSQLiteDatabase, String paramString, ContentValues paramContentValues) {}
  
  public Long then(o<Void> paramo)
  {
    return Long.valueOf(ParseSQLiteDatabase.access$300(this.this$0).insertOrThrow(this.val$table, null, this.val$values));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */