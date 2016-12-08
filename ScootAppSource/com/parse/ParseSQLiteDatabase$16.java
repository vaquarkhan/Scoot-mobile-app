package com.parse;

import a.m;
import a.o;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

class ParseSQLiteDatabase$16
  implements m<Void, Cursor>
{
  ParseSQLiteDatabase$16(ParseSQLiteDatabase paramParseSQLiteDatabase, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2) {}
  
  public Cursor then(o<Void> paramo)
  {
    return ParseSQLiteDatabase.access$300(this.this$0).query(this.val$table, this.val$select, this.val$where, this.val$args, null, null, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */