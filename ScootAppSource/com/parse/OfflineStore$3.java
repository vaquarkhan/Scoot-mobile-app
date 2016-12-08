package com.parse;

import a.m;
import a.o;
import android.database.Cursor;
import java.util.WeakHashMap;

class OfflineStore$3
  implements m<Cursor, T>
{
  OfflineStore$3(OfflineStore paramOfflineStore, String paramString) {}
  
  public T then(o<Cursor> arg1)
  {
    Object localObject1 = (Cursor)???.f();
    ((Cursor)localObject1).moveToFirst();
    if (((Cursor)localObject1).isAfterLast())
    {
      ((Cursor)localObject1).close();
      throw new IllegalStateException("Attempted to find non-existent uuid " + this.val$uuid);
    }
    synchronized (OfflineStore.access$300(this.this$0))
    {
      Object localObject3 = (ParseObject)OfflineStore.access$400(this.this$0).get(this.val$uuid);
      if (localObject3 != null) {
        return (T)localObject3;
      }
      String str = ((Cursor)localObject1).getString(0);
      localObject3 = ((Cursor)localObject1).getString(1);
      ((Cursor)localObject1).close();
      localObject1 = ParseObject.createWithoutData(str, (String)localObject3);
      if (localObject3 == null)
      {
        OfflineStore.access$400(this.this$0).put(this.val$uuid, localObject1);
        OfflineStore.access$500(this.this$0).put(localObject1, o.a(this.val$uuid));
      }
      return (T)localObject1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */