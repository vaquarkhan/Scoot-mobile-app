package com.mixpanel.android.c;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ax
  extends ba
{
  private final Map<TextView, TextWatcher> a = new HashMap();
  
  public ax(List<aa> paramList, String paramString, bf parambf)
  {
    super(paramList, paramString, parambf, true);
  }
  
  public void a()
  {
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((TextView)localEntry.getKey()).removeTextChangedListener((TextWatcher)localEntry.getValue());
    }
    this.a.clear();
  }
  
  public void a(View paramView)
  {
    if ((paramView instanceof TextView))
    {
      paramView = (TextView)paramView;
      ay localay = new ay(this, paramView);
      TextWatcher localTextWatcher = (TextWatcher)this.a.get(paramView);
      if (localTextWatcher != null) {
        paramView.removeTextChangedListener(localTextWatcher);
      }
      paramView.addTextChangedListener(localay);
      this.a.put(paramView, localay);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */