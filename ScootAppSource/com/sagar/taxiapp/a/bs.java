package com.sagar.taxiapp.a;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.List;

final class bs
  extends Filter
{
  private bs(bq parambq) {}
  
  protected Filter.FilterResults performFiltering(CharSequence arg1)
  {
    Filter.FilterResults localFilterResults1 = new Filter.FilterResults();
    if (bq.a(this.a) == null) {}
    synchronized (bq.b(this.a))
    {
      bq.a(this.a, new ArrayList(bq.c(this.a)));
      if (??? != null) {
        if (???.length() != 0) {
          break label130;
        }
      }
    }
    synchronized (bq.b(this.a))
    {
      ??? = new ArrayList(bq.a(this.a));
      localFilterResults1.values = ???;
      localFilterResults1.count = ((ArrayList)???).size();
      return localFilterResults1;
      ??? = finally;
      throw ???;
    }
    label130:
    ??? = ???.toString().toLowerCase();
    for (;;)
    {
      Object localObject3;
      String str;
      synchronized (bq.b(this.a))
      {
        ??? = new ArrayList(bq.a(this.a));
        int j = ((ArrayList)???).size();
        ??? = new ArrayList();
        int i = 0;
        if (i >= j) {
          break;
        }
        localObject3 = ((ArrayList)???).get(i);
        str = localObject3.toString().toLowerCase();
        if (str.startsWith(???))
        {
          ((ArrayList)???).add(localObject3);
          i += 1;
        }
      }
      if (str.contains(???)) {
        ((ArrayList)???).add(localObject3);
      }
    }
    localFilterResults2.values = ???;
    localFilterResults2.count = ((ArrayList)???).size();
    return localFilterResults2;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    bq.a(this.a, (List)paramFilterResults.values);
    if (paramFilterResults.count > 0)
    {
      this.a.notifyDataSetChanged();
      return;
    }
    this.a.notifyDataSetInvalidated();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */