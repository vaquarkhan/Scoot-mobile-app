package com.appsflyer;

import android.content.Context;
import java.util.concurrent.ExecutorService;

final class g
  implements Runnable
{
  private Context a;
  private String b;
  private String c;
  private String d;
  private String e;
  private ExecutorService f;
  private boolean g;
  
  private g(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, ExecutorService paramExecutorService)
  {
    this.a = paramContext;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.g = paramBoolean;
    this.f = paramExecutorService;
  }
  
  public void run()
  {
    c.a(this.a, this.b, this.c, this.d, this.e, this.g);
    this.f.shutdown();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsflyer\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */