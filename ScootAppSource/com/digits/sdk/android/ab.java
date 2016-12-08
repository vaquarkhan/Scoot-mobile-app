package com.digits.sdk.android;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.Data;
import com.digits.sdk.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ab
{
  private static final String[] a = { "mimetype", "lookup", "data2", "data3", "is_primary", "data1", "data1", "data2", "data3", "is_primary", "data1", "data2", "data3" };
  private static final String[] b = { "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/name" };
  private final Context c;
  
  ab(Context paramContext)
  {
    this.c = paramContext;
  }
  
  private List<String> a(Map<String, List<ContentValues>> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    b localb = new b(-1073741823, "UTF-8");
    Iterator localIterator1 = paramMap.keySet().iterator();
    Object localObject;
    int i;
    label96:
    ContentValues localContentValues;
    String str;
    if (localIterator1.hasNext())
    {
      localObject = (List)paramMap.get((String)localIterator1.next());
      i = 0;
      localHashMap.clear();
      localb.a();
      Iterator localIterator2 = ((List)localObject).iterator();
      if (localIterator2.hasNext())
      {
        localContentValues = (ContentValues)localIterator2.next();
        str = localContentValues.getAsString("mimetype");
        if ((!"vnd.android.cursor.item/phone_v2".equals(str)) && (!"vnd.android.cursor.item/email_v2".equals(str))) {
          break label274;
        }
        i = 1;
      }
    }
    label274:
    for (;;)
    {
      List localList = (List)localHashMap.get(str);
      localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        localHashMap.put(str, localObject);
      }
      ((List)localObject).add(localContentValues);
      break label96;
      if (i == 0) {
        break;
      }
      localb.a((List)localHashMap.get("vnd.android.cursor.item/name")).a((List)localHashMap.get("vnd.android.cursor.item/phone_v2"), null).b((List)localHashMap.get("vnd.android.cursor.item/email_v2"));
      localArrayList.add(localb.toString());
      break;
      return localArrayList;
    }
  }
  
  public Cursor a()
  {
    Object localObject = new HashSet(Arrays.asList(a));
    localObject = (String[])((HashSet)localObject).toArray(new String[((HashSet)localObject).size()]);
    Uri localUri = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("limit", Integer.toString(2500)).build();
    return this.c.getContentResolver().query(localUri, (String[])localObject, "mimetype=? OR mimetype=? OR mimetype=?", b, null);
  }
  
  public List<String> a(Cursor paramCursor)
  {
    if ((paramCursor == null) || (paramCursor.getCount() == 0)) {
      return Collections.emptyList();
    }
    int j = paramCursor.getColumnIndex("mimetype");
    int k = paramCursor.getColumnIndex("lookup");
    HashMap localHashMap = new HashMap();
    while (paramCursor.moveToNext())
    {
      Object localObject = paramCursor.getString(j);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("mimetype", (String)localObject);
      int i = -1;
      switch (((String)localObject).hashCode())
      {
      default: 
        switch (i)
        {
        default: 
          break;
        case 0: 
          DatabaseUtils.cursorIntToContentValuesIfPresent(paramCursor, localContentValues, "data2");
          DatabaseUtils.cursorStringToContentValuesIfPresent(paramCursor, localContentValues, "data3");
          DatabaseUtils.cursorIntToContentValuesIfPresent(paramCursor, localContentValues, "is_primary");
          DatabaseUtils.cursorStringToContentValuesIfPresent(paramCursor, localContentValues, "data1");
        }
        break;
      case 684173810: 
      case -1569536764: 
      case -1079224304: 
        for (;;)
        {
          label124:
          String str = paramCursor.getString(k);
          List localList = (List)localHashMap.get(str);
          localObject = localList;
          if (localList == null)
          {
            localObject = new ArrayList();
            localHashMap.put(str, localObject);
          }
          ((List)localObject).add(localContentValues);
          break;
          if (!((String)localObject).equals("vnd.android.cursor.item/phone_v2")) {
            break label124;
          }
          i = 0;
          break label124;
          if (!((String)localObject).equals("vnd.android.cursor.item/email_v2")) {
            break label124;
          }
          i = 1;
          break label124;
          if (!((String)localObject).equals("vnd.android.cursor.item/name")) {
            break label124;
          }
          i = 2;
          break label124;
          DatabaseUtils.cursorStringToContentValuesIfPresent(paramCursor, localContentValues, "data1");
          DatabaseUtils.cursorIntToContentValuesIfPresent(paramCursor, localContentValues, "data2");
          DatabaseUtils.cursorStringToContentValuesIfPresent(paramCursor, localContentValues, "data3");
          DatabaseUtils.cursorIntToContentValuesIfPresent(paramCursor, localContentValues, "is_primary");
          continue;
          DatabaseUtils.cursorStringToContentValuesIfPresent(paramCursor, localContentValues, "data1");
          DatabaseUtils.cursorStringToContentValuesIfPresent(paramCursor, localContentValues, "data2");
          DatabaseUtils.cursorStringToContentValuesIfPresent(paramCursor, localContentValues, "data3");
        }
      }
    }
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */