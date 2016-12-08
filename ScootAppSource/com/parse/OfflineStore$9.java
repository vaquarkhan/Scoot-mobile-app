package com.parse;

import a.m;
import a.o;
import android.database.Cursor;
import java.util.WeakHashMap;

class OfflineStore$9
  implements m<Cursor, String>
{
  OfflineStore$9(OfflineStore paramOfflineStore, ParseObject paramParseObject) {}
  
  public String then(o<Cursor> paramo)
  {
    ??? = (Cursor)paramo.f();
    ((Cursor)???).moveToFirst();
    if (((Cursor)???).isAfterLast())
    {
      ((Cursor)???).close();
      throw new ParseException(120, "This object is not available in the offline cache.");
    }
    paramo = ((Cursor)???).getString(0);
    String str = ((Cursor)???).getString(1);
    ((Cursor)???).close();
    synchronized (OfflineStore.access$300(this.this$0))
    {
      OfflineStore.access$500(this.this$0).put(this.val$object, o.a(str));
      OfflineStore.access$400(this.this$0).put(str, this.val$object);
      return paramo;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */