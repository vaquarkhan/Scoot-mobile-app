package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class bu
{
  Notification A;
  public Notification B = new Notification();
  public ArrayList<String> C;
  public Context a;
  public CharSequence b;
  public CharSequence c;
  PendingIntent d;
  PendingIntent e;
  RemoteViews f;
  public Bitmap g;
  public CharSequence h;
  public int i;
  int j;
  boolean k = true;
  public boolean l;
  public cg m;
  public CharSequence n;
  int o;
  int p;
  boolean q;
  String r;
  boolean s;
  String t;
  public ArrayList<bq> u = new ArrayList();
  boolean v = false;
  String w;
  Bundle x;
  int y = 0;
  int z = 0;
  
  public bu(Context paramContext)
  {
    this.a = paramContext;
    this.B.when = System.currentTimeMillis();
    this.B.audioStreamType = -1;
    this.j = 0;
    this.C = new ArrayList();
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localNotification = this.B;
      localNotification.flags |= paramInt;
      return;
    }
    Notification localNotification = this.B;
    localNotification.flags &= (paramInt ^ 0xFFFFFFFF);
  }
  
  protected static CharSequence d(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    while (paramCharSequence.length() <= 5120) {
      return paramCharSequence;
    }
    return paramCharSequence.subSequence(0, 5120);
  }
  
  public Notification a()
  {
    return bp.a().a(this, b());
  }
  
  public bu a(int paramInt)
  {
    this.B.icon = paramInt;
    return this;
  }
  
  public bu a(long paramLong)
  {
    this.B.when = paramLong;
    return this;
  }
  
  public bu a(PendingIntent paramPendingIntent)
  {
    this.d = paramPendingIntent;
    return this;
  }
  
  public bu a(CharSequence paramCharSequence)
  {
    this.b = d(paramCharSequence);
    return this;
  }
  
  public bu a(boolean paramBoolean)
  {
    a(16, paramBoolean);
    return this;
  }
  
  public bu b(CharSequence paramCharSequence)
  {
    this.c = d(paramCharSequence);
    return this;
  }
  
  protected bv b()
  {
    return new bv();
  }
  
  public bu c(CharSequence paramCharSequence)
  {
    this.B.tickerText = d(paramCharSequence);
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */