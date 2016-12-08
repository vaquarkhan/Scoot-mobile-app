package com.digits.sdk.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public abstract class aq
  extends Activity
{
  ar a;
  
  abstract ar a();
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.a.a(paramInt1, paramInt2, this);
    if ((paramInt2 == 200) && (paramInt1 == 140)) {
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    setTheme(ao.d().h());
    super.onCreate(paramBundle);
    this.a = a();
    paramBundle = getIntent().getExtras();
    if (this.a.a(paramBundle))
    {
      setContentView(this.a.c());
      this.a.a(this, paramBundle);
      return;
    }
    finish();
    throw new IllegalAccessError("This activity can only be started from Digits");
  }
  
  public void onDestroy()
  {
    this.a.a();
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    this.a.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */