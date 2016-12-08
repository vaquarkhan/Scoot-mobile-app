package com.payu.magicretry;

import android.os.Bundle;
import android.support.v4.app.av;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.payu.magicretry.b.b;

public class MainActivity
  extends android.support.v7.a.ah
{
  WebView m;
  a n;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.magicretry_main);
    this.m = ((WebView)findViewById(R.id.wv1));
    paramBundle = f();
    this.n = new a();
    paramBundle.a().a(R.id.magic_retry_container, this.n, "magicRetry").a();
    this.m.setWebChromeClient(new WebChromeClient());
    this.m.setWebViewClient(new b(this.n));
    this.n.a(this.m);
    this.m.loadUrl("http://google.com");
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(R.menu.menu_main, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */