package com.parse;

import a.l;
import a.m;
import a.o;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class OfflineStore$6
  implements m<Cursor, o<Void>>
{
  OfflineStore$6(OfflineStore paramOfflineStore, OfflineQueryLogic paramOfflineQueryLogic, ParseQuery.State paramState, ParseUser paramParseUser, ParseSQLiteDatabase paramParseSQLiteDatabase, List paramList) {}
  
  public o<Void> then(o<Cursor> paramo)
  {
    paramo = (Cursor)paramo.f();
    Object localObject = new ArrayList();
    paramo.moveToFirst();
    while (!paramo.isAfterLast())
    {
      ((List)localObject).add(paramo.getString(0));
      paramo.moveToNext();
    }
    paramo.close();
    OfflineQueryLogic.ConstraintMatcher localConstraintMatcher = this.val$queryLogic.createMatcher(this.val$query, this.val$user);
    paramo = o.a(null);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      l locall = new l();
      paramo = paramo.d(new OfflineStore.6.4(this, str)).d(new OfflineStore.6.3(this, locall)).d(new OfflineStore.6.2(this, locall, localConstraintMatcher)).c(new OfflineStore.6.1(this, locall));
    }
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */