package com.parse;

import a.ac;
import a.m;
import a.o;
import android.database.sqlite.SQLiteDatabase;

class ParseSQLiteDatabase$13
  implements m<Void, o<Void>>
{
  ParseSQLiteDatabase$13(ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<Void> paramo)
  {
    try
    {
      ParseSQLiteDatabase.access$300(this.this$0).close();
      return ParseSQLiteDatabase.access$200(this.this$0).a();
    }
    finally
    {
      ParseSQLiteDatabase.access$200(this.this$0).b(null);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */