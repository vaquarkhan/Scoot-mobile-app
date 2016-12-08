package android.support.v7.a;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.bh;
import android.support.v4.app.dj;
import android.support.v4.app.dk;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.gx;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class ah
  extends android.support.v4.app.aa
  implements dk, ai, i
{
  private aj m;
  private int n = 0;
  private boolean o;
  private Resources p;
  
  public Intent a()
  {
    return bh.a(this);
  }
  
  public b a(c paramc)
  {
    return null;
  }
  
  public void a(dj paramdj)
  {
    paramdj.a(this);
  }
  
  public void a(b paramb) {}
  
  public void a(Toolbar paramToolbar)
  {
    k().a(paramToolbar);
  }
  
  public boolean a(Intent paramIntent)
  {
    return bh.a(this, paramIntent);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    k().b(paramView, paramLayoutParams);
  }
  
  public h b()
  {
    return k().g();
  }
  
  public void b(Intent paramIntent)
  {
    bh.b(this, paramIntent);
  }
  
  public void b(dj paramdj) {}
  
  public void b(b paramb) {}
  
  public void d()
  {
    k().e();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((android.support.v4.view.aa.a(paramKeyEvent, 4096)) && (paramKeyEvent.getUnicodeChar(paramKeyEvent.getMetaState() & 0x8FFF) == 60))
    {
      int i = paramKeyEvent.getAction();
      if (i == 0)
      {
        a locala = h();
        if ((locala != null) && (locala.b()) && (locala.g()))
        {
          this.o = true;
          return true;
        }
      }
      else if ((i == 1) && (this.o))
      {
        this.o = false;
        return true;
      }
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public View findViewById(int paramInt)
  {
    return k().a(paramInt);
  }
  
  public MenuInflater getMenuInflater()
  {
    return k().b();
  }
  
  public Resources getResources()
  {
    if ((this.p == null) && (gx.a())) {
      this.p = new gx(this, super.getResources());
    }
    if (this.p == null) {
      return super.getResources();
    }
    return this.p;
  }
  
  public a h()
  {
    return k().a();
  }
  
  public boolean i()
  {
    Object localObject = a();
    if (localObject != null)
    {
      if (a((Intent)localObject))
      {
        localObject = dj.a(this);
        a((dj)localObject);
        b((dj)localObject);
        ((dj)localObject).a();
      }
      for (;;)
      {
        try
        {
          android.support.v4.app.a.a(this);
          return true;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        b(localIllegalStateException);
      }
    }
    return false;
  }
  
  public void invalidateOptionsMenu()
  {
    k().e();
  }
  
  @Deprecated
  public void j() {}
  
  public aj k()
  {
    if (this.m == null) {
      this.m = aj.a(this, this);
    }
    return this.m;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    k().a(paramConfiguration);
    if (this.p != null)
    {
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      this.p.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }
  
  public void onContentChanged()
  {
    j();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    aj localaj = k();
    localaj.h();
    localaj.a(paramBundle);
    if ((localaj.i()) && (this.n != 0))
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label55;
      }
      onApplyThemeResource(getTheme(), this.n, false);
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label55:
      setTheme(this.n);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    k().f();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    a locala = h();
    if ((paramMenuItem.getItemId() == 16908332) && (locala != null) && ((locala.a() & 0x4) != 0)) {
      return i();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    k().b(paramBundle);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    k().d();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    k().c(paramBundle);
  }
  
  protected void onStop()
  {
    super.onStop();
    k().c();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    k().a(paramCharSequence);
  }
  
  public void setContentView(int paramInt)
  {
    k().b(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    k().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    k().a(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.n = paramInt;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */