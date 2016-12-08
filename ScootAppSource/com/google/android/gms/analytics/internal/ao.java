package com.google.android.gms.analytics.internal;

final class ao
  implements Runnable
{
  ao(an paraman, e parame) {}
  
  public void run()
  {
    if (!this.b.a.b())
    {
      this.b.a.c("Connected to service after a timeout");
      al.a(this.b.a, this.a);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */