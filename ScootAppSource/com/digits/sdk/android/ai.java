package com.digits.sdk.android;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.SectionIndexer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

final class ai
  extends ArrayAdapter<ah>
  implements SectionIndexer
{
  private final HashMap<String, Integer> a = new LinkedHashMap();
  private final HashMap<String, Integer> b = new LinkedHashMap();
  private String[] c;
  
  public ai(Context paramContext)
  {
    super(paramContext, R.layout.dgts__country_row, 16908308);
  }
  
  public int a(String paramString)
  {
    paramString = (Integer)this.b.get(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.intValue();
  }
  
  public void a(List<ah> paramList)
  {
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      ah localah = (ah)paramList.next();
      String str = localah.a.substring(0, 1).toUpperCase(Locale.getDefault());
      if (!this.a.containsKey(str)) {
        this.a.put(str, Integer.valueOf(i));
      }
      this.b.put(localah.a, Integer.valueOf(i));
      i += 1;
      add(localah);
    }
    this.c = new String[this.a.size()];
    this.a.keySet().toArray(this.c);
    notifyDataSetChanged();
  }
  
  public int getPositionForSection(int paramInt)
  {
    if (this.c == null) {}
    while (paramInt <= 0) {
      return 0;
    }
    int i = paramInt;
    if (paramInt >= this.c.length) {
      i = this.c.length - 1;
    }
    return ((Integer)this.a.get(this.c[i])).intValue();
  }
  
  public int getSectionForPosition(int paramInt)
  {
    return 0;
  }
  
  public Object[] getSections()
  {
    return this.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */