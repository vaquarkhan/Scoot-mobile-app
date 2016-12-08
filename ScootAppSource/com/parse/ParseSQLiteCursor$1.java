package com.parse;

import android.database.Cursor;
import java.util.concurrent.Callable;

class ParseSQLiteCursor$1
  implements Callable<Void>
{
  ParseSQLiteCursor$1(ParseSQLiteCursor paramParseSQLiteCursor) {}
  
  public Void call()
  {
    ParseSQLiteCursor.access$000(this.this$0).close();
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSQLiteCursor$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */