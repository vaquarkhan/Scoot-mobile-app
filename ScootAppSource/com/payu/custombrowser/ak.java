package com.payu.custombrowser;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public final class ak
  extends WebChromeClient
{
  private a a;
  private boolean b = false;
  
  public ak(a parama)
  {
    this.a = parama;
  }
  
  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    return false;
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    if (this.a != null)
    {
      if ((this.b) || (paramInt >= 100)) {
        break label41;
      }
      this.b = true;
      this.a.c();
    }
    for (;;)
    {
      this.a.b(paramInt);
      return;
      label41:
      if (paramInt == 100)
      {
        this.a.c();
        this.b = false;
        this.a.b();
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */