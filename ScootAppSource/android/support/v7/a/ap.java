package android.support.v7.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.view.Window.Callback;

class ap
  extends ao
{
  private static bs r;
  private int s = -100;
  private boolean t;
  private boolean u = true;
  
  ap(Context paramContext, Window paramWindow, ai paramai)
  {
    super(paramContext, paramWindow, paramai);
  }
  
  private boolean e(int paramInt)
  {
    Resources localResources = this.a.getResources();
    Configuration localConfiguration = localResources.getConfiguration();
    int i = localConfiguration.uiMode;
    if (paramInt == 2) {}
    for (paramInt = 32; (i & 0x30) != paramInt; paramInt = 16)
    {
      localConfiguration = new Configuration(localConfiguration);
      localConfiguration.uiMode = (paramInt | localConfiguration.uiMode & 0xFFFFFFCF);
      localResources.updateConfiguration(localConfiguration, null);
      return true;
    }
    return false;
  }
  
  private bs t()
  {
    if (r == null) {
      r = new bs(this.a.getApplicationContext());
    }
    return r;
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new aq(this, paramCallback);
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (this.s == -100)) {
      this.s = paramBundle.getInt("appcompat:local_night_mode", -100);
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    if (this.s != -100) {
      paramBundle.putInt("appcompat:local_night_mode", this.s);
    }
  }
  
  int d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramInt;
    case 0: 
      if (t().a()) {
        return 2;
      }
      return 1;
    }
    return -1;
  }
  
  public boolean i()
  {
    this.t = true;
    if (this.s == -100) {}
    for (int i = j();; i = this.s)
    {
      i = d(i);
      if (i == -1) {
        break;
      }
      return e(i);
    }
    return false;
  }
  
  public boolean o()
  {
    return this.u;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */