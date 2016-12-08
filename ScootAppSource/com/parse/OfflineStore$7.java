package com.parse;

import a.l;
import a.m;
import a.o;
import android.database.Cursor;

class OfflineStore$7
  implements m<Cursor, String>
{
  OfflineStore$7(OfflineStore paramOfflineStore, l paraml) {}
  
  public String then(o<Cursor> paramo)
  {
    paramo = (Cursor)paramo.f();
    paramo.moveToFirst();
    if (paramo.isAfterLast())
    {
      paramo.close();
      throw new IllegalStateException("Attempted to find non-existent uuid " + (String)this.val$uuid.a());
    }
    String str = paramo.getString(0);
    paramo.close();
    return str;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */