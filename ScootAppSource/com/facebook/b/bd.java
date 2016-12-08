package com.facebook.b;

import android.content.Context;
import android.webkit.WebView;

final class bd
  extends WebView
{
  bd(ba paramba, Context paramContext)
  {
    super(paramContext);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    try
    {
      super.onWindowFocusChanged(paramBoolean);
      return;
    }
    catch (NullPointerException localNullPointerException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */