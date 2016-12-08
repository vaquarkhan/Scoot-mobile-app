package com.parse;

import a.m;
import a.o;
import android.database.Cursor;

class ParseSQLiteDatabase$26
  implements m<Cursor, Cursor>
{
  ParseSQLiteDatabase$26(ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public Cursor then(o<Cursor> paramo)
  {
    paramo = ParseSQLiteCursor.create((Cursor)paramo.f(), ParseSQLiteDatabase.access$500());
    paramo.getCount();
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteDatabase$26.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */