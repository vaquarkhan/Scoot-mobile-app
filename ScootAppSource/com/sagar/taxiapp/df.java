package com.sagar.taxiapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.google.android.gms.location.places.b;
import java.util.ArrayList;

final class df
  extends Filter
{
  df(de paramde) {}
  
  public CharSequence convertResultToString(Object paramObject)
  {
    if ((paramObject instanceof b)) {
      return ((b)paramObject).a(null);
    }
    return super.convertResultToString(paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      de.a(this.a, de.a(this.a, paramCharSequence));
      if (de.a(this.a) != null)
      {
        localFilterResults.values = de.a(this.a);
        localFilterResults.count = de.a(this.a).size();
      }
    }
    return localFilterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    if ((paramFilterResults != null) && (paramFilterResults.count > 0))
    {
      this.a.notifyDataSetChanged();
      return;
    }
    this.a.notifyDataSetInvalidated();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */