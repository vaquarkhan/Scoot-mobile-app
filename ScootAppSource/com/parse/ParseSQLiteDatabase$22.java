package com.parse;

import a.m;
import a.o;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

class ParseSQLiteDatabase$22
  implements m<Void, Integer>
{
  ParseSQLiteDatabase$22(ParseSQLiteDatabase paramParseSQLiteDatabase, String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString) {}
  
  public Integer then(o<Void> paramo)
  {
    return Integer.valueOf(ParseSQLiteDatabase.access$300(this.this$0).update(this.val$table, this.val$values, this.val$where, this.val$args));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */