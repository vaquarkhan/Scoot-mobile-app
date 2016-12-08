package com.digits.sdk.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.e;

public abstract class ap
  extends e
{
  ar m;
  
  abstract ar l();
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.m.a(paramInt1, paramInt2, this);
    if ((paramInt2 == 200) && (paramInt1 == 140)) {
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    setTheme(ao.d().h());
    super.onCreate(paramBundle);
    this.m = l();
    paramBundle = getIntent().getExtras();
    if (this.m.a(paramBundle))
    {
      setContentView(this.m.c());
      this.m.a(this, paramBundle);
      return;
    }
    finish();
    throw new IllegalAccessError("This activity can only be started from Digits");
  }
  
  public void onDestroy()
  {
    this.m.a();
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    this.m.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */