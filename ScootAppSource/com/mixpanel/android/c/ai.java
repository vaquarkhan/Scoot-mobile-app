package com.mixpanel.android.c;

import android.os.Message;

final class ai
  implements Runnable
{
  private volatile boolean b = true;
  
  public ai(af paramaf) {}
  
  public void a()
  {
    this.b = false;
    af.a(this.a).post(this);
  }
  
  public void b()
  {
    this.b = true;
    af.a(this.a).removeCallbacks(this);
  }
  
  public void run()
  {
    if (!this.b)
    {
      Message localMessage = af.a(this.a).obtainMessage(1);
      af.a(this.a).sendMessage(localMessage);
    }
    af.a(this.a).postDelayed(this, 30000L);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */