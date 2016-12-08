package com.parse;

import a.m;
import a.o;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

class ParseSQLiteDatabase$27
  implements m<Void, Cursor>
{
  ParseSQLiteDatabase$27(ParseSQLiteDatabase paramParseSQLiteDatabase, String paramString, String[] paramArrayOfString) {}
  
  public Cursor then(o<Void> paramo)
  {
    return ParseSQLiteDatabase.access$300(this.this$0).rawQuery(this.val$sql, this.val$args);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$27.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */