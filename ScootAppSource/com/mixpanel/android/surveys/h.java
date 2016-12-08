package com.mixpanel.android.surveys;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class h
  implements AdapterView.OnItemClickListener
{
  h(f paramf, CardCarouselLayout paramCardCarouselLayout) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (CardCarouselLayout.a(this.b.a) != null)
    {
      paramAdapterView = paramAdapterView.getItemAtPosition(paramInt).toString();
      this.b.a.postDelayed(new i(this, paramAdapterView), 165L);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */