package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class s
  extends Filter
{
  t a;
  
  s(t paramt)
  {
    this.a = paramt;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    return this.a.c((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = this.a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      localFilterResults.count = paramCharSequence.getCount();
      localFilterResults.values = paramCharSequence;
      return localFilterResults;
    }
    localFilterResults.count = 0;
    localFilterResults.values = null;
    return localFilterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = this.a.a();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != paramCharSequence)) {
      this.a.a((Cursor)paramFilterResults.values);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */